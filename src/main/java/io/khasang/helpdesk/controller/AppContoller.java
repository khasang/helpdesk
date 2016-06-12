package io.khasang.helpdesk.controller;

import io.khasang.helpdesk.model.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppContoller {
    @Autowired
    @Qualifier("index")
    Page indexPage;

    @Autowired
    @Qualifier("admin")
    Page adminPage;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("page", indexPage);
        return "index";
    }

    @RequestMapping("/admin")
    public String admin(Model model) {
        model.addAttribute("title", "Admin page");
        return "admin";
    }

    @RequestMapping("/desk")
    public String desk(Model model) {
        model.addAttribute("title", "Main desk page");
        return "desk";
    }

    @RequestMapping("/maps")
    public String maps(Model model) {
        model.addAttribute("title", "Helpdesk maps");
        return "maps";
    }

    @RequestMapping("/news")
    public String news(Model model) {
        model.addAttribute("title", "Helpdesk news");
        return "news";
    }
}
