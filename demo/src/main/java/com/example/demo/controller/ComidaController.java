package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;

@RequestMapping("/comida")
@Controller
public class ComidaController {

    @GetMapping("/infoComida")
    public String infoComidaPage(Model model) {
        model.addAttribute("comida", new Comida(1, "Ejemplo", "Descripción de ejemplo", 9.99, "http://example.com/imagen.jpg"));
        return "infoComida";
    }

}
