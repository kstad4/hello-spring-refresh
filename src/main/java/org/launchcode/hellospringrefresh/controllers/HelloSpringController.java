package org.launchcode.hellospringrefresh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloSpringController {

    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
    public String helloForm() {
        return "hello";

    };

//    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
//    @ResponseBody
//    public String hello(@RequestParam String coder) {
//        return "Hello " + coder + "!";
//    }


};