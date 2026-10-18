package com.example.bootjpa.Controller;

import com.example.bootjpa.dao.AlienRepo;
import com.example.bootjpa.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
