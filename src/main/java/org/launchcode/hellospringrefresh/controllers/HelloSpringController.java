package org.launchcode.hellospringrefresh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloSpringController {

    @GetMapping("form")
    public String helloForm() {
        return "form";
    };

    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String hello(@RequestParam String name) {
        return "Hello, " + name + "!";
    }


};