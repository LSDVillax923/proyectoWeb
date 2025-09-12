package com.example.demo.controller;

import com.example.demo.entities.Cliente;
import com.example.demo.service.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
    

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/lista")
    public String listaClientes(Model model) {
        model.addAttribute("clientes", clienteService.searchAll());
        return "listaClientes";
    }

    @GetMapping("/info/{id}")
    public String infoCliente(@PathVariable Long id, Model model) {
        Cliente cliente = clienteService.searchById(id);
        model.addAttribute("cliente", cliente);
        return "infoCliente";
    }

    @GetMapping("/add")
    public String mostrarFormularioCrear(Model model) {
        Cliente nuevoCliente = new Cliente();
        model.addAttribute("cliente", nuevoCliente);
        return "crearCliente";
    }

    @PostMapping("/add")
    public String guardarCliente(@ModelAttribute Cliente cliente) {
        clienteService.save(cliente);
        return "redirect:/cliente/lista";
    }

    @GetMapping("/update/{id}")
    public String mostrarFormularioActualizar(@PathVariable Long id, Model model) {
        Cliente existente = clienteService.searchById(id);
        model.addAttribute("cliente", existente);
        return "crearCliente";
    }

    @PostMapping("/update/{id}")
    public String actualizarCliente(@PathVariable Long id, @ModelAttribute Cliente cliente) {
        cliente.setId(id);
        clienteService.save(cliente);
        return "redirect:/cliente/lista";
    }

    @GetMapping("/delete/{id}")
    public String eliminarCliente(@PathVariable Long id) {
        clienteService.deleteById(id);
        return "redirect:/cliente/lista";
    }
}