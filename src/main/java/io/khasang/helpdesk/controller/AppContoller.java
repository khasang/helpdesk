package io.khasang.helpdesk.controller;

import io.khasang.helpdesk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppContoller {

    @Autowired
    UserService test;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/maps")
    public String maps(Model model) {
        model.addAttribute("pages.title", "Helpdesk maps");
        return "maps";
    }

    @RequestMapping("/news")
    public String news(Model model) {
        model.addAttribute("pages.title", "Helpdesk news");
        return "news";
    }
}
