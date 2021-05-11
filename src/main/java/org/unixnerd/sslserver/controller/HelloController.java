package org.unixnerd.sslserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        Date d = new Date();
        return "hello from server, time is: " + d.toString();
    }

}

