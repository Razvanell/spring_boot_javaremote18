package com.sda.javaremote18.spring_boot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersController {
    @GetMapping("/users/welcome") // in acest caz dorim sa afisam continutul poaginii HTML welcome
    public String showWelcomePage(){
        return "welcome"; //Welcome se refera la adresa paginii
    }
}