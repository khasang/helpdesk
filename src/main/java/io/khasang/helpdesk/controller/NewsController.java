package io.khasang.helpdesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewsController {

    public static final String NEWS = "news";

    @RequestMapping("/news")
    public String viewNews(Model model) {
        model.addAttribute("news");
        return NEWS;
    }
}
