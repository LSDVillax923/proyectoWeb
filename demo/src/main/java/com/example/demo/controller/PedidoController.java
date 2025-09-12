package com.example.demo.controller;

import com.example.demo.entities.Pedido;
import com.example.demo.service.PedidoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/pedido")
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @GetMapping("/lista")
    public String listaPedidos(Model model) {
        model.addAttribute("pedidos", pedidoService.searchAll());
        return "listaPedidos";
    }

    @GetMapping("/info/{id}")
    public String infoPedido(@PathVariable Long id, Model model) {
        Pedido pedido = pedidoService.searchById(id);
        model.addAttribute("pedido", pedido);
        return "infoPedido";
    }

    @GetMapping(params = "id")
    public String infoPedido2(@RequestParam Long id, Model model) {
        Pedido pedido = pedidoService.searchById(id);
        model.addAttribute("pedido", pedido);
        return "infoPedido";
    }

    @GetMapping("/delete/{id}")
    public String deletePedido(@PathVariable Long id) {
        pedidoService.deleteById(id);
        return "redirect:/pedido/lista";
    }

    @GetMapping("/add")
    public String mostrarFormularioCrear(Model model) {
        Pedido nuevoPedido = new Pedido(null, "");
        model.addAttribute("pedido", nuevoPedido);
        return "crearPedido";
    }

    @PostMapping("/add")
    public String guardarPedido(@ModelAttribute Pedido pedido) {
        pedidoService.save(pedido);
        return "redirect:/pedido/lista";
    }

    @GetMapping("/update/{id}")
    public String mostrarFormularioActualizar(@PathVariable("id") Long id, Model model) {
        Pedido pedidoExistente = pedidoService.searchById(id);
        model.addAttribute("pedido", pedidoExistente);
        return "crearPedido";
    }
}