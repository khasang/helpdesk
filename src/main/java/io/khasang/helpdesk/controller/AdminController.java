package io.khasang.helpdesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

    public static final String ADMIN = "admin";
    public static final String SAVE_USER = "saveUser";

    @RequestMapping("/admin")
    public String adminPage(Model model){
        model.addAttribute("admin", "That's admin page");
        return ADMIN;
    }


    @RequestMapping("/admin/saveUser")
    public String addUser(Model model){
        model.addAttribute("saveUser", "save");
        return SAVE_USER;
    }
}
