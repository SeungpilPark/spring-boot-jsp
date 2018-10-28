package com.lg.sample.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/api/v1")
public class ApiController {

    @GetMapping(value = "/test", produces = "application/json")
    public Object test(HttpSession session) throws Exception {
        return session.getAttribute("my-session");
    }
}
