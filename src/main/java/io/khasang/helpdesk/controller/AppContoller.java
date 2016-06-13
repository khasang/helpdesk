package io.khasang.helpdesk.controller;

import io.khasang.helpdesk.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppContoller {
    @Autowired
    Message message;

    //4to to sdelal
    @RequestMapping("/")
    public String hello(Model model){
        model.addAttribute("hello", "Welcome to Help Desk program!");
        return "hello";
    }

    @RequestMapping("/hello")
    public String by(Model model){
        model.addAttribute("hello", message.getInfoMess());
        return "by";
    }
}
