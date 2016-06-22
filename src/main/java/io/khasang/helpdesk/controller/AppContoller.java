package io.khasang.helpdesk.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import io.khasang.helpdesk.model.CreateTable;
import io.khasang.helpdesk.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppContoller {
    @Autowired
    Message message;
    @Autowired
    CreateTable createTable;

    //4to to sdelal
    @RequestMapping("/")
    public String hello(Model model){
        model.addAttribute("hello", "Welcome to Help Desk program!");
        return "hello";
    }

    @RequestMapping("/hello")
    public String by(Model model){
        model.addAttribute("hello", message.getInfoMess());
        return "by";
    }

    @RequestMapping("/create")
    public String create(Model model){
        model.addAttribute("create", createTable.result());
        return "create";
    }

    @RequestMapping("/confidential/secure")
    public String secure(Model model){
        model.addAttribute("secure", "secure page with access encrypted");
        return "secure";
    }

    @RequestMapping(value = {"/hello/{name}"}, method = RequestMethod.GET)
    public ModelAndView hello(@PathVariable("name") String name) {
        ModelAndView model = new ModelAndView();
        model.setViewName("helloPage");
        model.addObject("crypt", new BCryptPasswordEncoder().encode(name));
        return model;
    }
}
