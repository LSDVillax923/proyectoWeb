package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.example.demo.entities.Cliente;
import com.example.demo.service.ClienteService;
import com.example.demo.service.ComidaService;

@Controller
public class NavegacionController {

    @Autowired
    private ComidaService comidaService;

    @Autowired
    private ClienteService clienteService;

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

    public String signInPage(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "sign_in";
    }

    @PostMapping("/sign_in")
    public String registrar(@ModelAttribute Cliente cliente) {
        clienteService.save(cliente);
        return "redirect:/inicio"; 
    }

    @GetMapping("/admin/login")
    public String adminLoginPage() {
        return "admin";
    }
}