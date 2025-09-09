package com.example.demo.controller;

import com.example.demo.entities.Comida;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import com.example.demo.entities.Comida;

@RequestMapping("/comida")
@Controller
public class ComidaController {

    @GetMapping("/infoComida")
    public String infoComidaPage(Model model) {

        Comida comida = new Comida(1, "Ejemplo", "Descripción de ejemplo", 9.99, "http://example.com/imagen.jpg");

        model.addAttribute("comida", comida);

        return "infoComida";
    }


}
