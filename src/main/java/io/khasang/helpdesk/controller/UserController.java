package io.khasang.helpdesk.controller;


import io.khasang.helpdesk.dao.Dao;
import io.khasang.helpdesk.dao.daoimpl.HibernateUserDao;
import io.khasang.helpdesk.entity.Users;
import io.khasang.helpdesk.model.User;
import io.khasang.helpdesk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.sql.SQLException;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;


@Controller
public class UserController {
//    @Autowired
//    HibernateUserDao hibernateUserDao;
//    @Autowired
//    private Dao dao;

//    @Autowired
//    private Users users;

//    @Autowired
//    JdbcUserDAO jdbcUserDAO;

    @Autowired
    UserService userService;

//    @RequestMapping(value="/registration", method = GET)
//    public String addUser(Model model){
//        model.addAttribute("users", new Users());
//        return "/registration";
//    }
//
//    @RequestMapping(value = "/registration", method = POST)
//    public String addUser(@ModelAttribute("users") Users users){
//        try {
//            userService.regUser(users);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return "redirect:/registration-result";
//    }
//
//    @RequestMapping(value="/registration", method=RequestMethod.GET)
//    public ModelAndView registrationForm() {
//        return new ModelAndView("registration", "users", new Users());
//    }
//
//    @RequestMapping(value="/registration-result", method = RequestMethod.POST)
//    public ModelAndView registrationResult(@ModelAttribute("users") Users users){
//        try {
//            jdbcUserDAO.regUser(users);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return new ModelAndView("registration-result", "users", users);
//    }

    @RequestMapping(value="/registration", method=RequestMethod.GET)
    public ModelAndView registrationForm() {

        return new ModelAndView("registration", "users", new Users());
}

    @RequestMapping(value="/registration", method = RequestMethod.POST)
    public ModelAndView registrationResult(@ModelAttribute("users") Users users){
        try {
            userService.addUser(users);
        } catch (Exception e) {
            e.printStackTrace();
        }
//        ModelAndView model = new ModelAndView();
//        model.setViewName("registration-result");
//        model.addObject("users", users);
//        return model;
        return new ModelAndView("registration-result", "users", users);
    }

//    @RequestMapping(value="/registration-result", method = RequestMethod.POST)
//    public String registrationResult(@ModelAttribute("registration") Users users, RedirectAttributes redirectAttributes){
//        try {
//            dao.regUser(users);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return "redirect:/registration-result";
//    }

}
