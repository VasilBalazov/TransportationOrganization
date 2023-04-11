package com.softuni.mytransportationorganizationapplication.TransportationOrganization.web;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs.LTDetailsViewDTO;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.services.ApprovalService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class RequestProcessingController {

    private final ApprovalService approvalService;

    public RequestProcessingController(ApprovalService approvalService) {
        this.approvalService = approvalService;
    }

    @GetMapping("/action")
    private String motPendingPage() {
        return "mot-request-processing";
    }

    @GetMapping("/action/processing-land")
    private String landTransportToProcess(Model model) {
        List<LTDetailsViewDTO> allPending = approvalService.getAllUnapproved();

        model.addAttribute("transports", allPending);
        return "pending-land-requests";
    }



}
