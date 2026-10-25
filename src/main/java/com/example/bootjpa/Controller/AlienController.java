package com.example.bootjpa.Controller;

import com.example.bootjpa.dao.AlienRepo;
import com.example.bootjpa.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import java.util.Optional;

@Controller
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

    @RequestMapping("/getAlien")
    public ModelAndView getAlien(@RequestParam Integer aid){
        ModelAndView mv = new ModelAndView("showAlien.jsp");
        Alien alien = repo.findById(aid).orElse(new Alien());
        //Optional<Alien> alien = repo.findById(aid);
        mv.addObject(alien);
        return mv;
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
