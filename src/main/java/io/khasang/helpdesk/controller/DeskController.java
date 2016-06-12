package io.khasang.helpdesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeskController {

    public static final String ACTIVE_TASKS = "activeTasks";
    public static final String DESK = "desk";
    public static final String SOLVED_TASKS = "solvedTasks";
    public static final String ANSWER_TASK = "answerTask";

    @RequestMapping("/desk")
    public String deskPage(Model model){
        model.addAttribute("desk", "That's desk page");
        return DESK;
    }

    @RequestMapping("/desk/activeTasks")
    public String activeTasks(Model model){
        model.addAttribute("activeTasks");
        return ACTIVE_TASKS;
    }

    @RequestMapping("/desk/solvedTasks")
    public String solvedTasks(Model model){
        model.addAttribute("solvedTasks");
        return SOLVED_TASKS;
    }

    @RequestMapping("/desk/answerTask")
    public String answerTask(Model model){
        model.addAttribute("answerTask");
        return ANSWER_TASK;
    }
}
