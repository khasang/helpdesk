package io.khasang.helpdesk.controller;


import io.khasang.helpdesk.dao.daoimpl.JdbcUserDAO;
import io.khasang.helpdesk.model.User;
import io.khasang.helpdesk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
//@RequestMapping("/signup")
public class UserController {
    @Autowired
    User user;

    @Autowired
    JdbcUserDAO jdbcUserDAO;

//    @Autowired
//    UserService userService;

    @RequestMapping(value="/registration", method=RequestMethod.GET)
    public ModelAndView registrationForm() {
        return new ModelAndView("registration", "user", new User());
    }

    @RequestMapping(value="/registration-result", method = RequestMethod.POST)
    public ModelAndView registrationResult(@ModelAttribute("user") User user){
        try {
            jdbcUserDAO.regUser(user);
        } catch (Exception e) {

        }
        return new ModelAndView("registration-result", "user", user);
    }


//    Спросить Диму Савицкого про redirect и метод get
//    @RequestMapping(value = "/registration-result", method = RequestMethod.POST)
//    public String singUp(@ModelAttribute("user") User user,
//                         RedirectAttributes redirectAttributes) {
//        String message;
//
//        try {
//            userService.regUser(user);
//            message = "User" + user.getLogin() + "successfully registered.";
//        } catch (Exception e) {
//            message = "Register error" + e.getMessage();
//        }
//        redirectAttributes.addFlashAttribute("message", message);
//        return "redirect:/signup";
//    }
}
