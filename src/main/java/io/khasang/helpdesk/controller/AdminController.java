package io.khasang.helpdesk.controller;

import io.khasang.helpdesk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
    @Autowired
    UserService userService;

    @RequestMapping("/admin")
    public String admin(Model model) {
        model.addAttribute("title", "Admin page");
        return "admin/index";
    }

    @RequestMapping("/admin/users")
    public String users(Model model) {
        model.addAttribute("users", userService.getUsersAsList());
        return "admin/users";
    }
}
