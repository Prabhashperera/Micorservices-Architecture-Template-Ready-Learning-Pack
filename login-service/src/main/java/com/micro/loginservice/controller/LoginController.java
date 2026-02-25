package com.micro.loginservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login/")
@RequiredArgsConstructor
public class LoginController {
    private final UserFeign userFeign;

    @GetMapping("/validate-user")
    public String validateUser() {
        return userFeign.getUserData();
    }
}
