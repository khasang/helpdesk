package io.khasang.helpdesk.controller;


import io.khasang.helpdesk.dao.daoimpl.JdbcUserDAO;
import io.khasang.helpdesk.model.User;
import io.khasang.helpdesk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/signup")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value="/registration", method=RequestMethod.GET)
    public String showRegistrationForm() {
        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String singUp(@ModelAttribute("signUp") User user,
                         RedirectAttributes redirectAttributes) {
        userService.regUser(user);
        return "redirect:/signup";
    }
}
