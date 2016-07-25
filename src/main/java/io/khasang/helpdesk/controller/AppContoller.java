package io.khasang.helpdesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppContoller {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/maps")
    public String maps() {
        return "maps";
    }

    @RequestMapping("/news")
    public String news() {
        return "news";
    }

    @RequestMapping("/rest")
    public String rest() {
        return "rest";
    }
}
