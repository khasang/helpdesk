package io.khasang.helpdesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JIRAController {

    @RequestMapping("/JIRAmovie")
    public String jira(Model model) {
        model.addAttribute("hello", "Intro to JIRA portfolio");
        return "JIRAmovie/JIRAmovie";
    }
}
