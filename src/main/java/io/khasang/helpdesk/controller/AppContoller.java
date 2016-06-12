package io.khasang.helpdesk.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppContoller {

    @RequestMapping("/")
    public String hello(Model model){
        model.addAttribute("hello", "Welcome to Help Desk program!");
        return "hello";
    }

    @RequestMapping("/signIn")
    public String signIn(Model model){
        model.addAttribute("signIn", "Hiii");
        return "signIn";
    }

    @RequestMapping("/registration")
    public String registration(Model model){
        model.addAttribute("registration", "Hiii");
        return "registration";
    }
}
