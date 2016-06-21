package io.khasang.helpdesk.controller;

import io.khasang.helpdesk.model.User;
import io.khasang.helpdesk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/admin/users")
    public String users(Model model) {
        model.addAttribute("users", userService.getUsersAsList());
        return "admin/users";
    }

    @RequestMapping(value = "/admin/registerUser", method = RequestMethod.POST)
    public String registerUser(@ModelAttribute("registerUser") User user,
                               Map<String, Object> model) {
        userService.addUser(user);
        return "redirect:/admin/users";
    }

    @RequestMapping(value = "/admin/changeUser", method = RequestMethod.POST)
    public String updateUser(@ModelAttribute("changeUser") User user,
                             Map<String, Object> model) {
        userService.updateUser(user);
        return "redirect:/admin/users";
    }

    @RequestMapping(value = "/admin/deleteUser", method = RequestMethod.POST)
    public String deleteUser(@ModelAttribute("deleteUser") User user,
                             Map<String, Object> model) {
        userService.deleteUser(user);
        return "redirect:/admin/users";
    }
}
