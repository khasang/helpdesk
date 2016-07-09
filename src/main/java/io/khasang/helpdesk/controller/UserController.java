package io.khasang.helpdesk.controller;

import io.khasang.helpdesk.entities.User;
import io.khasang.helpdesk.enums.Role;
import io.khasang.helpdesk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/admin/users")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping
    public String users(Model model) {
        model.addAttribute("users", userService.getUsersAsList());
        return "admin/users";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerUser(@ModelAttribute("registerUser") User user,
                               RedirectAttributes redirectAttributes) {
        String message;
        try {
            userService.addUser(user);
            message = "User " + user.getLogin() + " successfully registered.";
        } catch (Exception e) {
            message = "Registration error " + e.getMessage();
        }
        redirectAttributes.addFlashAttribute("message", message);
        return "redirect:/admin/users";
    }

    @RequestMapping(value = "/change", method = RequestMethod.POST)
    public String updateUser(@ModelAttribute("changeUser") User user,
                             RedirectAttributes redirectAttributes) {
        String message;
        try {
            userService.updateUser(user);
            message = "User " + user.getLogin() + " successfully updated.";
        } catch (Exception e) {
            message = "Error!" + e.getMessage();
            e.printStackTrace();
        }
        redirectAttributes.addFlashAttribute("message", message);
        return "redirect:/admin/users";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String deleteUser(@ModelAttribute("deleteUser") User user,
                             RedirectAttributes redirectAttributes) {
        String message;
        try {
            userService.deleteUser(user);
            message = "User successfully deleted.";
        } catch (Exception e) {
            message = "Error!" + e.getMessage();
        }
        redirectAttributes.addFlashAttribute("message", message);
        return "redirect:/admin/users";
    }

    @RequestMapping(value = "/filter", method = RequestMethod.POST)
    public String filterUsers(HttpServletRequest request,
                              @RequestParam(value = "filter", required = true) String filter, Model model) {
        try {
            model.addAttribute("users", userService.getUsersByRole(Role.valueOf(filter)));
        } catch (IllegalArgumentException e) {
            model.addAttribute("users", userService.getUsersAsList());
        }

        model.addAttribute("filter", filter);
        return "admin/users";
    }
}
