package com.softuni.mytransportationorganizationapplication.TransportationOrganization.web;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs.LandTransportRequestDTO;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.LandTransportEntity;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.StatusOfTransport;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.enums.StatusOfTransportEnum;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.enums.UserRoleEnum;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.LandTransportRepository;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.StatusRepository;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.services.LandTransportService;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.security.access.method.P;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.enums.StatusOfTransportEnum.PENDING;

@Controller
public class RequestController {

    private final LandTransportService landTransportService;

    private final LandTransportRepository landTransportRepository;
    private final StatusRepository statusRepository;

    public RequestController(LandTransportService landTransportService, LandTransportRepository landTransportRepository, StatusRepository statusRepository) {
        this.landTransportService = landTransportService;

        this.landTransportRepository = landTransportRepository;
        this.statusRepository = statusRepository;
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
            RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("LandTransportRequestDTO", ltr);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.LandTransportRequestDTO",
                    bindingResult);
            return "redirect:/request/add-land";
        }else {
            landTransportService.saveLandTransport(ltr);
            return "redirect:/request";
        }
    }

    @GetMapping("/request/add-air")
    private String airTransport() {
        return "request-air";
    }

    @GetMapping("/request/add-sea")
    private String seaTransport() {
        return "request-sea";
    }

    @GetMapping("/request/add-rail")
    private String railTransport() {
        return "request-rail";
    }
}
