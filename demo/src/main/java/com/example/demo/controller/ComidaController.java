package com.example.demo.controller;

import com.example.demo.entities.Comida;
import com.example.demo.service.ComidaService;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;


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

     @GetMapping("/info/{id}")
    public String infoComida(@PathVariable Integer id, Model model) {
        Comida comida = comidaService.searchById(id);
        model.addAttribute("comida", comida);
        return "infoComida";
    }

    @GetMapping(params = "id")
    public String infoComida2(@RequestParam Integer id, Model model) {
        Comida comida = comidaService.searchById(id);
        model.addAttribute("comida", comida);
        return "infoComida";
    }

    @GetMapping("/delete/{id}")
    public String deleteComida(@PathVariable Integer id) {
        comidaService.deleteById(id);
        return "redirect:/comida/lista";
    }


    @GetMapping("/add")
    public String mostrarFormularioCrear(Model model) {

        Comida nuevaComida = new Comida(null, "", "", 0, "");

        model.addAttribute("comida", nuevaComida);

        return "crearComida";
    }

    @PostMapping("/add")
    public String guardarComida(@ModelAttribute Comida comida) {
        comidaService.save(comida);
        return "redirect:/comida/lista";
    }


    @GetMapping("/update/{id}")
    public String getMethodName(@PathVariable("id") Integer id, Model model) {

        Comida comidaExistente = comidaService.searchById(id);

        model.addAttribute("comida", comidaExistente);

        return "crearComida";
    }

}