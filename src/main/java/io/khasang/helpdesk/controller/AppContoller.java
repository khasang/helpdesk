package io.khasang.helpdesk.controller;

import io.khasang.helpdesk.model.Example;
import io.khasang.helpdesk.model.Hello;
import io.khasang.helpdesk.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppContoller {
    @Autowired
    Example example;

    @Autowired
    Hello hello;

    @Autowired
    Message message;

    @RequestMapping("/")
    public String hello(Model model) {
        model.addAttribute("hello", "Index page!");
        return "index";
    }

    @RequestMapping("/signIn")
    public String signIn(Model model) {
        model.addAttribute("signIn", message.getInfoMess());
        return "signIn";
    }

    @RequestMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("registration", "Hiii");
        return "registration";
    }
}
