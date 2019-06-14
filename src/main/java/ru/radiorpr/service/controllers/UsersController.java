package ru.radiorpr.service.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersController {

    @GetMapping("/registration")
    public String getUsersRegistrationPage() {
        return "registration";
    }
}
