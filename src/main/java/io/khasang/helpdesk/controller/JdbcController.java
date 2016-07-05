package io.khasang.helpdesk.controller;

import io.khasang.helpdesk.model.Users;
import io.khasang.helpdesk.model.dbUserAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Mike on 05.07.2016.
 */
@Controller
public class JdbcController {

@Autowired
dbUserAction userAction;

    @RequestMapping("/select")
    public ModelAndView select() {

        List<Users> users = userAction.getAllUserList();
        return new ModelAndView("select", "resultObject", users);
        // model.addAttribute("select",  testSelect.getAllUserList());



        //  model.addAttribute("select",  testSelect.getAllUserList());
        //model.addAllAttributes(testSelect.getAllUserList());

        // }
        // return "select";
    }

   /* @RequestMapping(value = "/jdbcQueryAllUsers", method = RequestMethod.GET)
    public ModelAndView jdbcSelectAllUsers() {
        System.out.println("JDBCController jdbcSelectAllUsers() is called");
        List<User> users =  jdbcExample.queryAllUsers();
        return new ModelAndView("/jdbc/jdbc", "resultObject", users);
    }**/

}


