package com.softuni.mytransportationorganizationapplication.TransportationOrganization.web;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs.*;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.services.TransportService;
import jakarta.validation.Valid;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RequestController {

    private final TransportService transportService;


    public RequestController(TransportService transportService) {
        this.transportService = transportService;

    }


    @GetMapping("/request")
    private String motPage() {
        return "mot-choose";
    }

    @GetMapping("/request/add-land")
    private String landTransport() {
        return "request-land";
    }
    @ModelAttribute(name = "LandTransportRequestDTO")
    public LandTransportRequestDTO initLandTransportRequestDTO() {
        return new LandTransportRequestDTO();
    }
    @PostMapping("/request/add-land")
    public String registerRequest(
            @Valid @ModelAttribute(name = "LandTransportRequestDTO") LandTransportRequestDTO ltr,
            BindingResult bindingResult,
            RedirectAttributes redirectAttributes,
            @AuthenticationPrincipal AppUserDetails appUserDetails) {
        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("LandTransportRequestDTO", ltr);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.LandTransportRequestDTO",
                    bindingResult);
            return "redirect:/request/add-land";
        }else {
            transportService.saveLandTransport(ltr, appUserDetails);
            return "redirect:/request";
        }
    }

    @GetMapping("/request/add-air")
    private String airTransport() {
        return "request-air";
    }
    @ModelAttribute(name = "AirTransportRequestDTO")
    public AirTransportRequestDTO initAirTransportRequestDTO() {
        return new AirTransportRequestDTO();
    }
    @PostMapping("/request/add-air")
    public String registerAirRequest(
            @Valid @ModelAttribute(name = "AirTransportRequestDTO") AirTransportRequestDTO atr,
            BindingResult bindingResult,
            RedirectAttributes redirectAttributes,
            @AuthenticationPrincipal AppUserDetails appUserDetails) {
        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("AirTransportRequestDTO", atr);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.AirTransportRequestDTO",
                    bindingResult);
            return "redirect:/request/add-air";
        }else {
            transportService.saveAirTransport(atr, appUserDetails);
            return "redirect:/request";
        }
    }
    @GetMapping("/request/add-sea")
    private String seaTransport() {
        return "request-sea";
    }
    @ModelAttribute(name = "SeaTransportRequestDTO")
    public SeaTransportRequestDTO initSeaTransportRequestDTO() {
        return new SeaTransportRequestDTO();
    }
    @PostMapping("/request/add-sea")
    public String registerSeaRequest(
            @Valid @ModelAttribute(name = "SeaTransportRequestDTO") SeaTransportRequestDTO str,
            BindingResult bindingResult,
            RedirectAttributes redirectAttributes,
            @AuthenticationPrincipal AppUserDetails appUserDetails) {
        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("SeaTransportRequestDTO", str);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.SeaTransportRequestDTO",
                    bindingResult);
            return "redirect:/request/add-sea";
        }else {
            transportService.saveSeaTransport(str, appUserDetails);
            return "redirect:/request";
        }
    }

    @GetMapping("/request/add-rail")
    private String railTransport() {
        return "request-rail";
    }
    @ModelAttribute(name = "RailTransportRequestDTO")
    public RailTransportRequestDTO initRailTransportRequestDTO() {
        return new RailTransportRequestDTO();
    }
    @PostMapping("/request/add-rail")
    public String registerRailRequest(
            @Valid @ModelAttribute(name = "RailTransportRequestDTO") RailTransportRequestDTO rtr,
            BindingResult bindingResult,
            RedirectAttributes redirectAttributes,
            @AuthenticationPrincipal AppUserDetails appUserDetails) {
        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("RailTransportRequestDTO", rtr);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.RailTransportRequestDTO",
                    bindingResult);
            return "redirect:/request/add-rail";
        }else {
            transportService.saveRailTransport(rtr, appUserDetails);
            return "redirect:/request";
        }
    }
}
