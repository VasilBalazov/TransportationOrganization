package com.softuni.mytransportationorganizationapplication.TransportationOrganization.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/request")
public class RequestController {
    @GetMapping("/add")
    private String motPage() {
        return "request-add";
    }
}
