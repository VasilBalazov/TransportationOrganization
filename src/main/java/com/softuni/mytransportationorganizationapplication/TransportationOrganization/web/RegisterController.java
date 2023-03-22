package com.softuni.mytransportationorganizationapplication.TransportationOrganization.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class RegisterController {
    @GetMapping("register")
    public String getRegister () {
        return "auth-register";
    }
}
