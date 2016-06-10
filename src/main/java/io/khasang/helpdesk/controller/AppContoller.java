package io.khasang.helpdesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppContoller {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Helpdesk in action:)");
        return "index";
    }

    @RequestMapping("/admin")
    public String admin(Model model) {
        return "admin";
    }

    @RequestMapping("/desk")
    public String desk(Model model) {
        return "desk";
    }

    @RequestMapping("/news")
    public String news(Model model) {
        return "news";
    }

    @RequestMapping("/maps")
    public String maps(Model model) {
        return "maps";
    }
}
