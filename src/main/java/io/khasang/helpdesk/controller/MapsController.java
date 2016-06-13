package io.khasang.helpdesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MapsController {

    public static final String MAPS = "maps";

    @RequestMapping("/maps")
    public String viewMaps(Model model) {
        model.addAttribute("maps");
        return MAPS;
    }
}
