package com.bondesvick.JobApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobController {

    @RequestMapping({"/","/home"})
    public String home() {
        return "home";
    }
}