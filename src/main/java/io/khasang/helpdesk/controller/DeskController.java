package io.khasang.helpdesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeskController {

    private static final String ACTIVE_TASKS = "activeTasks";
    private static final String DESK = "desk";
    private static final String SOLVED_TASKS = "solvedTasks";
    private static final String ANSWER_TASK = "answerTask";

    @RequestMapping("/desk")
    public String deskPage(Model model) {
        model.addAttribute("desk", "That's desk page");
        return DESK;
    }

    @RequestMapping("/activeTasks")
    public String activeTasks(Model model) {
        model.addAttribute("activeTasks");
        return ACTIVE_TASKS;
    }

    @RequestMapping("/solvedTasks")
    public String solvedTasks(Model model) {
        model.addAttribute("solvedTasks");
        return SOLVED_TASKS;
    }

    @RequestMapping("/answerTask")
    public String answerTask(Model model) {
        model.addAttribute("answerTask");
        return ANSWER_TASK;
    }
}
