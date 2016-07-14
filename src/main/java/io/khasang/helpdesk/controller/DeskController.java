package io.khasang.helpdesk.controller;

import io.khasang.helpdesk.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;

@Controller
public class DeskController {

    @RequestMapping("/desk/task")
    public String task(Model model) {
        model.addAttribute("hello", "Tasks page!");
        return "task";
    }

    @Autowired
    Task task;

    @RequestMapping("/desk")
    public String items(Model model) throws SQLException {
        model.addAttribute("items", task.selectWholeTable());
        return "desk";
    }
}
