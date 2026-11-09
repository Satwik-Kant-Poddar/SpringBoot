package com.example.bootjpa.Controller;

import com.example.bootjpa.dao.AlienRepo;
import com.example.bootjpa.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import java.util.Optional;

@RestController
public class AlienController {

    @Autowired
    AlienRepo repo;

    @RequestMapping("/")
    public String home(){
        return "home.jsp";
    }

    @RequestMapping("/addAlien")
    public String addAlien(Alien alien){
        repo.save(alien);
        return "home.jsp";
    }

    @RequestMapping("/alien/{aid}")
    @ResponseBody
    public Optional<Alien> getAlien(@PathVariable("aid") int aid){
      return repo.findById(aid);
    }

    @RequestMapping(value = "/alien" )
    //@RequestMapping(value = "/alien",produces ={application/xml})
    @ResponseBody
    public List<Alien> getAlien(){
        return repo.findAll();
    }

    @PostMapping(path = "/alien")
    //@PostMapping(value = "/alien",consume ={application/xml})
    public Alien saveAlien(@RequestBody  Alien alien){
        System.out.println(alien.toString());
        //alien.getAid();
        repo.save(alien);
        return alien;
    }

    @DeleteMapping(path = "/alien/{aid}")
    public Alien deleteAlien(@PathVariable ("aid")int aid ){
        Optional<Alien> a = repo.findById(aid);
        repo.deleteById(aid);
        return a.orElse(null);
    }

    @PutMapping(path = "/alien")
    public Alien updateAlien(@RequestBody Alien alien) {
        System.out.println(alien.toString());
        repo.save(alien);
        return alien;
    }

    @RequestMapping("/getAlienByTech")
    public String getAlienByTech(@RequestParam String tech){
        List<Alien> alien = repo.findByTech(tech);
        for(Alien each : alien){
            System.out.println(each.toString());
        }
        return "home.jsp";
    }

    @RequestMapping("/getAlienGreaterAid")
    public String getAlienGreaterAid(@RequestParam Integer aid){
        List<Alien> alien = repo.findByAidGreaterThan(aid);
        for(Alien each : alien){
            System.out.println(each.toString());
        }
        return "home.jsp";
    }

    @RequestMapping("/getAlienTechSorted")
    public String getAlienTechSorted(@RequestParam String tech){
        List<Alien> alien = repo.findByTechSorted(tech);
        for(Alien each : alien){
            System.out.println(each.toString());
        }
        return "home.jsp";
    }

    @RequestMapping("/deleteAlien")
    public ModelAndView deleteAlien(@RequestParam Integer aid){
        ModelAndView mv = new ModelAndView("deleteAlien.jsp");
        Alien alien = repo.findById(aid).orElse(null);
        repo.deleteById(aid);
        mv.addObject("alien", alien);
        mv.addObject("aid", aid);
        return mv;
    }
}
