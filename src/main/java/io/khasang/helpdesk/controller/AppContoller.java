package io.khasang.helpdesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppContoller {

    @RequestMapping("/")
    public String hello(Model model){
        model.addAttribute("hello", "Welcome to Help Desk program!");
        return "index";
    }

    @RequestMapping("/admin")
    public String admin(Model model){
        model.addAttribute("hello", "Admin page!");
        return "admin";
    }

    @RequestMapping("/desk")
    public String desk(Model model){
        model.addAttribute("hello", "Desk page!");
        return "desk";
    }

    @RequestMapping("/desk/task")
    public String task(Model model){
        model.addAttribute("hello", "Task page!");
        return "task";
    }
}
