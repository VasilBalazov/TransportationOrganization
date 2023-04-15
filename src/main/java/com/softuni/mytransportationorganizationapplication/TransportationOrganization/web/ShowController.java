package com.softuni.mytransportationorganizationapplication.TransportationOrganization.web;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs.LTDetailsViewDTO;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.services.AllTransportsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ShowController {

    private final AllTransportsService allTransportsService;

    public ShowController(AllTransportsService allTransportsService) {
        this.allTransportsService = allTransportsService;
    }

//    @GetMapping("/all")
//    private String getAllTransports(Model model) {
//        List<LTDetailsViewDTO> landTransports = allTransportsService.getAllLandTransports();
////        List<ATDetailsViewDTO> airTransports = allTransportsService.getAllAirTransports();
////        List<RTDetailsViewDTO> railTransports = allTransportsService.getAllRailTransports();
////        List<STDetailsViewDTO> seaTransports = allTransportsService.getAllSeaTransports();
//
//        model.addAttribute("lTransports", landTransports);
////        model.addAttribute("aTransports", airTransports);
////        model.addAttribute("rTransports", railTransports);
////        model.addAttribute("sTransports", seaTransports);
//        return "all-transports";
//    }


}
