package io.khasang.helpdesk.controller;

import io.khasang.helpdesk.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppContoller {

    @RequestMapping("/")
    public String hello(Model model){
        model.addAttribute("index", "Welcome to Help Desk program!");
        return "index";
    }

    @RequestMapping("/admin")
    public String admin(Model model){
        model.addAttribute("title", "This is Admin page" );
//        model.addAttribute("user", user.addUser("Vasya"));
//        model.addAttribute("testUser", user.getName());
        return "admin";
    }

    @RequestMapping("/desk")
    public String doMainPage(Model model){
        model.addAttribute("link", "/desk/task");
        return "desk";
    }

    @RequestMapping("/desk/task")
    public String taskId(Model model){
        model.addAttribute("taskId", "Task number is");
        return "task";
    }
}
