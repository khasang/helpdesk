package io.khasang.helpdesk.controller;

import io.khasang.helpdesk.model.Tasks;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLException;

@Controller
public class TasksController {

    public static final Logger logger = org.slf4j.LoggerFactory.getLogger(TasksController.class);

    @Autowired
    private Tasks tasks;

    JdbcTemplate jdbcTemplate;

    @RequestMapping("/get-data")
    public String items(Model model) throws SQLException {
        model.addAttribute("items", tasks.selectWholeTable());
        return "get-data";
    }

//    @RequestMapping(value ="/desk", method = RequestMethod.GET)
//    public ModelAndView task(){
//        return new ModelAndView("task")
//    }
}
