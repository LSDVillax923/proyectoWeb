package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import com.example.demo.service.ComidaService;

@Controller
public class NavegacionController {

@Autowired
private ComidaService comidaService;

@GetMapping("/inicio")
public String inicioPage() {
return "inicio";
}


@GetMapping("/login")
public String loginPage() {
return "login";
}


@GetMapping("/menu")
public String menuPage(Model model) {
model.addAttribute("comidas", comidaService.searchAll());
return "menu";
}

@GetMapping("/sign_in")

public String signInPage() {
return "sign_in";
}

@GetMapping("/admin/login")
public String adminLoginPage(){
    return "admin";
}
}


