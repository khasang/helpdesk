package io.khasang.helpdesk.controller;

import io.khasang.helpdesk.entities.User;
import io.khasang.helpdesk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class RestUserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Object getUser(@PathVariable(value = "id") String inputId, HttpServletResponse response) {
        try {
            int userId = Integer.valueOf(inputId);
            User user = userService.getUserById(userId);
            if (user != null) {
                return user;
            } else {
                response.setStatus(HttpServletResponse.SC_NOT_FOUND);
                return "User with id: " + userId + " not found.";
            }
        } catch (NumberFormatException e) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return "Bad user id format: " + inputId;
        }
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        return userService.getUserList();
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public Object addUser(@RequestBody User user, HttpServletResponse response) {
        try {
            userService.addUser(user);
            return user;
        } catch (Exception e) {
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            return "Error adding user: " + e.getMessage();
        }
    }

    @RequestMapping(method = RequestMethod.PUT, produces = "application/json")
    @ResponseBody
    public Object updateUser(@RequestBody User user, HttpServletResponse response) {
        try {
            userService.updateUser(user);
            return user;
        } catch (Exception e) {
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            return "Error updating user: " + e.getMessage();
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
    @ResponseBody
    public String deleteUser(@PathVariable(value = "id") String inputId, HttpServletResponse response) {
        try {
            int userId = Integer.valueOf(inputId);
            User user = userService.getUserById(userId);
            if (user != null) {
                userService.deleteUser(user);
                return "User #" + userId + " successfully deleted.";
            } else {
                response.setStatus(HttpServletResponse.SC_NOT_FOUND);
                return "User with id: " + userId + " not found.";
            }
        } catch (NumberFormatException e) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return "Bad user id format: " + inputId;
        }
    }
}
