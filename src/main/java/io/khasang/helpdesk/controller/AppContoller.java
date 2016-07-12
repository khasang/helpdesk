package io.khasang.helpdesk.controller;


import io.khasang.helpdesk.dao.daoimpl.JdbcUserDAO;
import io.khasang.helpdesk.model.CreateTable;
import io.khasang.helpdesk.model.Tasks;
import io.khasang.helpdesk.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.sql.SQLException;

//import io.khasang.helpdesk.model.Message;

@Controller
public class AppContoller {

//    @Autowired
//    Message message;

    @Autowired
    CreateTable createTable;

    @Autowired
    Tasks tasks;

//    @Autowired
//    User user;

    @RequestMapping("/")
    public String hello(Model model) {
        model.addAttribute("index", "Welcome to Help Desk program!");
        return "index";
    }

    @RequestMapping("/admin")
    public String admin(Model model) {
        model.addAttribute("title", "This is Admin page");
        return "admin";
    }

    @RequestMapping("/desk")
    public String doMainPage(Model model) {
        model.addAttribute("link", "/desk/task");
        model.addAttribute("add", "/desk/add-task");
        return "desk";
    }

    @RequestMapping("/desk/task")
    public String taskId(Model model) {
        model.addAttribute("taskId", "Task number is");
        return "task";
    }

    @RequestMapping("/desk/add-task")
    public String addTask(Model model) {
        return "add-task";
    }

    @RequestMapping("/map")
    public String showpMap(Model model) {
        model.addAttribute("desc", "This is map");
        return "map";
    }

    @RequestMapping("/create")
    public String create(Model model) {
        model.addAttribute("create", createTable.result());
        return "create";
    }

    @RequestMapping("/confidential/secure")
    public String secure(Model model) {
        model.addAttribute("secure", "secure page with access encrypted");
        return "secure";
    }

    @RequestMapping(value = {"/hello/{name}"}, method = RequestMethod.GET)
    public ModelAndView hello(@PathVariable("name") String name) {
        ModelAndView model = new ModelAndView();
        model.setViewName("helloPage");
        model.addObject("crypt", new BCryptPasswordEncoder().encode(name));
        return model;
    }

    @RequestMapping(value={"/get-data"}, method=RequestMethod.GET)
    public String items(Model model) throws SQLException {
        model.addAttribute("items", tasks.selectWholeTable());
        return "get-data";
    }


}
