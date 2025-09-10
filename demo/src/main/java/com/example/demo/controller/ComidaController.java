package com.example.demo.controller;

import com.example.demo.entities.Comida;
import com.example.demo.service.ComidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/comida")
public class ComidaController {

    @Autowired
    private ComidaService comidaService;

    //http://localhost:8080/comida/lista
    @GetMapping("/lista")
    public String listaComidas(Model model) {
        model.addAttribute("comidas", comidaService.searchAll());
        return "listaComidas";
    }

    @GetMapping("/infoComida")
    public String infoComidaPage(Model model) {
         Comida comida = comidaService.searchById(1);
        model.addAttribute("comida", comida);
        return "infoComida";
    }

}