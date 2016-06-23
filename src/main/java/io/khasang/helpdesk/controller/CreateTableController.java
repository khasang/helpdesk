package io.khasang.helpdesk.controller;

import io.khasang.helpdesk.model.CreateTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CreateTableController {
    @Autowired
    CreateTable createTable;

    @RequestMapping("/create")
    public String create(Model model){
        model.addAttribute("create", createTable.result());
        return "create";
    }
}
