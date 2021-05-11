package org.unixnerd.sslserver.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {

    private Logger log = LoggerFactory.getLogger(HelloController.class);
    @GetMapping("/hello")
    public String hello() {
        Date d = new Date();
        log.info("endpoint called at: " + d.toString());
        return "hello from server, time is: " + d.toString();
    }

}

