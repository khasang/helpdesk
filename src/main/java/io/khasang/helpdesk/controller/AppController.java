package io.khasang.helpdesk.controller;

import io.khasang.helpdesk.model.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
    @Autowired
    Example example;

    @RequestMapping("/1")
    public String hello(Model model){
        model.addAttribute("hello", example.getMessage());
        /*model.addAttribute("hello", "1");*/
        return "hello";
    }
}
