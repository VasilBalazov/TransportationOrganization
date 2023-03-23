package com.softuni.mytransportationorganizationapplication.TransportationOrganization.web;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs.AppUserDetails;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller
//public class PageController {
//    @GetMapping("/")
//    public String home(@AuthenticationPrincipal AppUserDetails appUserDetails, Model model) {
//
//        if (appUserDetails != null) {
//            model.addAttribute("username", appUserDetails.getFullName());
//            model.addAttribute("country", appUserDetails.getCountry());
//        }
//
//        return "index";
//    }
//}
