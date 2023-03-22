package com.softuni.mytransportationorganizationapplication.TransportationOrganization.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/transports")
public class TransportsController {

    @GetMapping("/mot")
    private String motPage() {
        return "mot";
    }


}
