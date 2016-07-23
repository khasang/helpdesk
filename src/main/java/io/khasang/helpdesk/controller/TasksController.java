package io.khasang.helpdesk.controller;

import io.khasang.helpdesk.entity.Task;
import io.khasang.helpdesk.model.Tasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;

@Controller
public class TasksController {

    @Autowired
    Tasks tasks;

    @RequestMapping("/desk")
    public String items(Model model) throws SQLException {
        model.addAttribute("items", tasks.selectWholeTable());
        return "desk";
    }

    @RequestMapping("/desk/task")
    public String task(Model model) throws SQLException {
        model.addAttribute("task", tasks.selectWholeTable());
        return "task";
    }

    @RequestMapping("/desk/task/foundtask")
    public String foundtask(Model model) throws SQLException {
        model.addAttribute("found", tasks.foundDescription());
        return "foundtask";
    }
}
