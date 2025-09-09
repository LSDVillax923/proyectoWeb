package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NavegacionController {


    @GetMapping("/inicio")
    public String inicioPage() {
        return "inicio";
    }


    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    
    @GetMapping("/menu")
    public String menuPage() {
        return "menu";
    }


    @GetMapping("/reservar")
    public String reservarPage() {
        return "reservar";
    }


    @GetMapping("/sign_in")
    public String signInPage() {
        return "sign_in";
    }
}

