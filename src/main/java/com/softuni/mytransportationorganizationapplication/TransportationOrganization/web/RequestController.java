package com.softuni.mytransportationorganizationapplication.TransportationOrganization.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestController {

    @GetMapping("/request")
    private String motPage() {
        return "mot-choose";
    }
    @GetMapping("/request/add")
    private String landTransport() {
        return "request-land";
    }
}
