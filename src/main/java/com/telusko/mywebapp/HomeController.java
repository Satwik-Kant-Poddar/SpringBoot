package com.telusko.mywebapp;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
   @RequestMapping("home")
  // @ResponseBody
    public String home(HttpServletRequest req)
           //HttpServletResponse
   {
       HttpSession session = req.getSession();
       String name = req.getParameter("name");
       System.out.println("hi " + name);
       session.setAttribute("name",name);
       return "home";
   }
}
