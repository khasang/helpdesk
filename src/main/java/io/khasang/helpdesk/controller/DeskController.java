package io.khasang.helpdesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeskController {

    @RequestMapping("/desk")
    public String desk(Model model) {
        model.addAttribute("title", "Main desk page");
        return "desk";
    }
}
