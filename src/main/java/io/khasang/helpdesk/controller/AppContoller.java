package io.khasang.helpdesk.controller;

import io.khasang.helpdesk.model.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppContoller {

    @Autowired
    Example example;

    @RequestMapping("/")
    public String hello(Model model) {
        model.addAttribute("hello", "Index page!");
        return "index";
    }

    @RequestMapping("/admin")
    public String admin(Model model) {
        model.addAttribute("hello", "Admin page!");
        return "admin";
    }

    @RequestMapping("/desk")
    public String desk(Model model) {
        model.addAttribute("hello", "Desk page!");
        return "desk";
    }

    @RequestMapping("/desk/task")
    public String task(Model model) {
        model.addAttribute("hello", "Task page!");
        return "task";
    }

    @RequestMapping("/solution")
    public String number(Model model){
        model.addAttribute("number", example.getNumber());
        return "solution";
    }
}
