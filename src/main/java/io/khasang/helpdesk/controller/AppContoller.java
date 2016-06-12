package io.khasang.helpdesk.controller;

import io.khasang.helpdesk.model.Example;
import io.khasang.helpdesk.model.Hello;
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

    @RequestMapping("/")
    public String hello(Model model){
        Example example = new Example();
        model.addAttribute("hello", example.getMessage());
        return "hello";
    }

    @RequestMapping("/example")
    public String example(Model model){
        model.addAttribute("tail", hello.getNum());
        return "example";
    }

}
