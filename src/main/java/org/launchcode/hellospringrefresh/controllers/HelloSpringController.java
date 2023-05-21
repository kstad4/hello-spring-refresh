package org.launchcode.hellospringrefresh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloSpringController {

    @GetMapping
    @ResponseBody
    public String helloForm() {
        String html = "<html>" +
                            "<body>" +
                                "<form method = 'get' action = '/hello'>" +
                                    "<input type = 'text' name = 'coder' />" +
                                    "<input type = 'submit' value = 'Greet Me!' />" +
                                "</form>" +
                            "</body>" +
                      "</html>";
        return html;

    };

    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String hello(@RequestParam String coder) {
        return "Hello " + coder + "!";
    }


};