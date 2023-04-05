package com.softuni.mytransportationorganizationapplication.TransportationOrganization.web;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs.UserRegistrationDTO;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.UserEntity;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.services.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.apache.catalina.User;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.context.SecurityContextHolderStrategy;
import org.springframework.security.web.context.SecurityContextRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/users")
public class RegisterController {

    private final UserService userService;
    private final SecurityContextRepository securityContextRepository;

    public static final String BINDING_RESULT_PATH = "org.springframework.validation.BindingResult.";
    public RegisterController(UserService userService, SecurityContextRepository securityContextRepository) {
        this.userService = userService;
        this.securityContextRepository = securityContextRepository;
    }


    @GetMapping("register")
    public String getRegister () {
        return "auth-register";
    }

    @ModelAttribute(name = "UserRegistrationDTO")
    public UserRegistrationDTO initUserRegisterFormDto() {
        return new UserRegistrationDTO();
    }
    @PostMapping("/register")
    public String registerNewUser(
            @Valid UserRegistrationDTO registrationDTO,
            BindingResult bindingResult,
            RedirectAttributes redirectAttributes,
            HttpServletRequest request,
            HttpServletResponse response) {

        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("registrationDTO", registrationDTO);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.userModel",
                    bindingResult);
            return "redirect:/users/register";
        }else {
            userService.registerUser(registrationDTO, successfulAuth -> {
                // populating security context
                SecurityContextHolderStrategy strategy = SecurityContextHolder.getContextHolderStrategy();

                SecurityContext context = strategy.createEmptyContext();
                context.setAuthentication(successfulAuth);

                strategy.setContext(context);

                securityContextRepository.saveContext(context, request, response);
            });
            return "redirect:/";
        }



    }


}

