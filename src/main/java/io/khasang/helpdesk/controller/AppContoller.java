package io.khasang.helpdesk.controller;

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

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/createTable")
    public String createTable(Model model){
        model.addAttribute("create", createTable.result());
        return "createTable";
    }

}
