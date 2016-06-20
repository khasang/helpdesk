package io.khasang.helpdesk.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import io.khasang.helpdesk.model.CreateTable;
import io.khasang.helpdesk.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppContoller {
    @Autowired
    Message message;
    @Autowired
    CreateTable createTable;

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

    @RequestMapping("/create")
    public String create(Model model){
        model.addAttribute("create", createTable.result());
        return "create";
    }
}
