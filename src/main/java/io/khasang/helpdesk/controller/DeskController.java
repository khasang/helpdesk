package io.khasang.helpdesk.controller;

import io.khasang.helpdesk.model.DeskViewer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;

@Controller
public class DeskController {
    @Autowired
    DeskViewer deskViewer;

    @RequestMapping("/desk")
    public String desk(Model model) throws SQLException {
        model.addAttribute("hello", "Desk page!");
        model.addAttribute("items", deskViewer.viewAllTasks());
        return "desk";
    }

    @RequestMapping("/newtask")
    public String task(Model model) {
        model.addAttribute("hello", "Task page!");
        return "newtask";
    }
}
