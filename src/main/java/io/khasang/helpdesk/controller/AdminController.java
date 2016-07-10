package io.khasang.helpdesk.controller;

import io.khasang.helpdesk.entity.Users;
import io.khasang.helpdesk.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AdminController {

    private static final String ADMIN = "admin";
    private static final String SAVE_USER = "saveUser";
    private static final String ERROR_PAGE = "errorPage";
    private static final String ALL_USERS = "allUsers";

    @Autowired
    private UserService userService;

    @Autowired
    private Users users;

    @RequestMapping("/admin")
    public String adminPage(Model model) {
        model.addAttribute("admin");
        return ADMIN;
    }

    @RequestMapping(value = "/admin/allUsers", method = RequestMethod.GET)
    public String allUsers(ModelMap model) {
        model.addAttribute("user", userService.getAll());
        return ALL_USERS;
    }

    @RequestMapping(value = "/admin/allUsers/save/user", method = RequestMethod.GET)
    public String addUser() {
        return SAVE_USER;
    }

    @RequestMapping(value = "/admin/allUsers/save/user/{id}", method = RequestMethod.GET)
    public String editUser(@PathVariable(value = "id") Long id, ModelMap model) {
        if (userService.getById(id) == null) {
            return ERROR_PAGE;
        }
        model.addAttribute("user", userService.getById(id));
        return SAVE_USER;
    }

    @RequestMapping(value = "/admin/allUsers/save/user", method = RequestMethod.POST)
    public String saveUser(ModelMap model) {
        if (users.getId() == 0) {
            userService.insert(new Users(0, users.getFirstName(), users.getSecondName(), users.getRole_id(),
                    users.getRole(), users.getLogin(), users.getPassword()));
        } else {
            userService.update(new Users(users.getId(), users.getFirstName(), users.getSecondName(), users.getRole_id(),
                    users.getRole(), users.getLogin(), users.getPassword()));
        }
        return allUsers(model);
    }

    @RequestMapping(value = "/delete/user/{id}", method = RequestMethod.GET)
    public RedirectView deleteUsers(@PathVariable(value = "id") Long id) {
        userService.deleteById(id);
        return new RedirectView("/admin/allUsers");
    }
}
