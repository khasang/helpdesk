package io.khasang.helpdesk.controller;

import io.khasang.helpdesk.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    public static final String SAVE_USER = "saveUser";
    public static final String ERROR_PAGE = "errorPage";
    public static final String ALL_USERS = "allUsers";
  /*  @Autowired
    private UserServiceImpl userService;*/

    /*@RequestMapping(value = "/admin/allUsers", method = RequestMethod.GET)
    public String allUsers(ModelMap model) {
        model.addAttribute("user", userService.getAll());
        return ALL_USERS;
    }

    @RequestMapping(value = "/admin/allUsers/saveUser", method = RequestMethod.GET)
    public String addUser() {
        return SAVE_USER;
    }

    @RequestMapping(value = "/admin/allUsers/saveUser/{id}", method = RequestMethod.GET)
    public String editUser(@PathVariable(value = "id") Long id, ModelMap model) {
        if (userService.getById(id) == null) {
            return ERROR_PAGE;
        }
        model.addAttribute("user", userService.getById(id));
        return SAVE_USER;
    }

    @RequestMapping(value = "/admin/allUsers/saveUser", method = RequestMethod.POST)
    public String saveUser(ModelMap model) {
        User user = new User();
        if (user.getId() == 0){
            userService.insert(new UserDTO(0, user.getFirstName(), user.getSecondName(), user.getRole_id(),
                    user.getRoles(), user.getLogin(), user.getPassword()));
        } else {
            userService.update(new UserDTO(user.getId(), user.getFirstName(), user.getSecondName(), user.getRole_id(),
                    user.getRoles(), user.getLogin(), user.getPassword()));
        }
        return allUsers(model);
    }

    @RequestMapping(value = "/delete/user/{id}", method = RequestMethod.GET)
    public RedirectView deleteUsers(@PathVariable(value = "id") Long id) {
        userService.deleteById(id);
        return new RedirectView("/");
    }*/
}
