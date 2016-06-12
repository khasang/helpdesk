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

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("title", "Index page");
        return "index";
    }

//    @RequestMapping("/hello")
//    public String by(Model model){
//        model.addAttribute("hello", message.getInfoMess());
//        return "by";
//    }
}
