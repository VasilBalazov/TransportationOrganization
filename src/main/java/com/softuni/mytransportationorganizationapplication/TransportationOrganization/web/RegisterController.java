package com.softuni.mytransportationorganizationapplication.TransportationOrganization.web;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs.UserRegistrationDTO;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.services.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.context.SecurityContextHolderStrategy;
import org.springframework.security.web.context.SecurityContextRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class RegisterController {

    private final UserService userService;
    private final SecurityContextRepository securityContextRepository;

    public RegisterController(UserService userService, SecurityContextRepository securityContextRepository) {
        this.userService = userService;
        this.securityContextRepository = securityContextRepository;
    }


    @GetMapping("register")
    public String getRegister () {
        return "auth-register";
    }


    @PostMapping("/users/register")
    public String registerNewUser(
            UserRegistrationDTO registrationDTO,
            HttpServletRequest request,
            HttpServletResponse response) {

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
//    @PostMapping("/register")
//    public String postRegister(@Valid @ModelAttribute(name = "userRegisterForm") UserRegistrationDTO userRegisterInfo,
//                               BindingResult bindingResult,
//                               RedirectAttributes redirectAttributes) {
//        if (bindingResult.hasErrors()) {
//            redirectAttributes.addFlashAttribute("userRegisterForm", userRegisterInfo)
//                    .addFlashAttribute(BINDING_RESULT_PATH + "userRegisterForm", bindingResult);
//
//            return "redirect:register";
//        }
//        User user = new User()
//
//        return "redirect:/";
//    }



    // Model attributes

    @ModelAttribute(name = "userRegisterForm")
    public UserRegistrationDTO initUserRegisterFormDto() {
        return new UserRegistrationDTO();
    }

}

