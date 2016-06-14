package io.khasang.helpdesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

    @RequestMapping("/admin")
    public String admin(){
        return "admin";
    }

    @RequestMapping("/createUser")
    public String createUser(){
        return "createUser";
    }

    @RequestMapping("/deleteUser")
    public String deleteUser() {
        return "deleteUser";
    }
}
