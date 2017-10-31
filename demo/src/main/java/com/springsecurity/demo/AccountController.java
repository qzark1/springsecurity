package com.springsecurity.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

@RestController
@RequestMapping("/")
public class AccountController {
    @RequestMapping("/1")
    public ModelAndView index(){
        return new ModelAndView("home", new HashMap<String, String >());
    }
    @RequestMapping("/home")
    public ModelAndView indexhome(){
        return new ModelAndView("home", new HashMap<String, String >());
    }
    @RequestMapping("/hello")
    public ModelAndView hello(){
        return new ModelAndView("hello", new HashMap<String, String >());
    }
    @RequestMapping("/username")
    public ModelAndView login(){
        return new ModelAndView("username", new HashMap<String, String >());
    }
}