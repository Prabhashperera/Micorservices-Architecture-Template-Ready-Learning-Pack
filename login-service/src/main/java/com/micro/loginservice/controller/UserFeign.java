package com.micro.loginservice.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "user-service")
public interface UserFeign {

    @GetMapping("user/get-user")
    String getUserData();
}
