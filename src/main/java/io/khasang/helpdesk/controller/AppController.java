package io.khasang.helpdesk.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

    @RequestMapping("/")
    public String hello(Model model) {
        model.addAttribute("hello", "Welcome to Help Desk program!");
        return "hello";
    }


    @RequestMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("registration", "Hiii");
        return "registration";
    }


    @RequestMapping("/confidential/secure")
    public String secure(Model model) {
        model.addAttribute("secure", "secure page with access encrypted");
        return "secure";
    }

    @RequestMapping(value = {"/hello/{name}"}, method = RequestMethod.GET)
    public ModelAndView hello(@PathVariable("name") String name) {
        ModelAndView model = new ModelAndView();
        model.setViewName("hello");
        model.addObject("crypt", new BCryptPasswordEncoder().encode(name));
        return model;
    }
}
