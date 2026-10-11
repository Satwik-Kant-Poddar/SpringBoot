package com.telusko.mywebapp;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
//   @RequestMapping("home")
//  // @ResponseBody
//    public String home(@RequestParam("name") String myName, HttpSession session)
//           //(HttpServletRequest req)
//           //HttpServletResponse
//   {
//      HttpSession session = req.getSession();
//       String name = req.getParameter("name");
//       ModelAndView mv = new ModelAndView();
//       System.out.println("hi " + myName);
//       session.setAttribute("name",myName);
//       return "home";
//   }

    // this was for modelandview with single param
//    @RequestMapping("home")
//    public ModelAndView home(@RequestParam("name") String myname){
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("name",myname);
//        mv.setViewName("home");
//        return mv;
//    }

     //this was for modelandview with mutli param
    @RequestMapping("home")
    public ModelAndView home(Alien alien){
        ModelAndView mv = new ModelAndView();
        mv.addObject("obj",alien);
        mv.setViewName("home");
        return mv;
    }



}
