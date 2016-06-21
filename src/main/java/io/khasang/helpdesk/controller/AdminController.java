package io.khasang.helpdesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

    @RequestMapping("/admin")
    public String admin(Model model) {
        model.addAttribute("title", "Admin page");
        return "admin/index";
    }

}
