package com.example.demo.controller;

import com.example.demo.dto.PedidoFormDTO;
import com.example.demo.dto.PedidoItemDTO;
import com.example.demo.entities.Cliente;
import com.example.demo.entities.Comida;
import com.example.demo.entities.DetallePedido; // Importa la nueva entidad
import com.example.demo.entities.Pedido;
import com.example.demo.service.ClienteService;
import com.example.demo.service.ComidaService;
import com.example.demo.service.DetallePedidoService; // Importa el nuevo servicio
import com.example.demo.service.PedidoService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private ComidaService comidaService;
    
    @Autowired
    private DetallePedidoService detallePedidoService; // Inyecta el nuevo servicio

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
        PedidoFormDTO pedidoForm = new PedidoFormDTO();
        pedidoForm.setPedido(new Pedido(null, ""));
        List<PedidoItemDTO> pedidoItems = new ArrayList<>();
        for (int i = 0; i < comidaService.searchAll().size(); i++) {
            pedidoItems.add(new PedidoItemDTO());
        }
        pedidoForm.setPedidoItems(pedidoItems);
        // ----------------------

        model.addAttribute("pedidoForm", pedidoForm);
        model.addAttribute("clientes", clienteService.searchAll());
        model.addAttribute("comidas", comidaService.searchAll());
        return "crearPedido";
    }

    @PostMapping("/add")
    public String guardarPedido(@ModelAttribute PedidoFormDTO pedidoForm) {

        System.out.println("Estoy guardando");

        // 1. Asignar el cliente
        Cliente clienteObj = clienteService.searchById(pedidoForm.getCliente());
        pedidoForm.getPedido().setCliente(clienteObj);

        // 2. Crear y asociar los detalles del pedido
        List<DetallePedido> detalles = new ArrayList<>();
        List<PedidoItemDTO> pedidoItems = pedidoForm.getPedidoItems();

        System.out.println("ITEMS: " + pedidoItems);

        if (pedidoItems != null && !pedidoItems.isEmpty()) {
            System.out.println("Cantidad de items en el pedido: " + pedidoItems.size());
            for (PedidoItemDTO item : pedidoItems) {
                System.out.println("ID DEL ITEM: " + item.getComidaId() + " - CANTIDAD: " + item.getCantidad());
                // Solo procesa los ítems que fueron seleccionados y tienen cantidad > 0
                if (item.getComidaId() != null && item.getCantidad() > 0) {
                    Comida comida = comidaService.searchById(item.getComidaId());
                    if (comida != null) {
                        DetallePedido detalle = new DetallePedido();
                        detalle.setPedido(pedidoForm.getPedido());
                        detalle.setComida(comida);
                        detalle.setCantidad(item.getCantidad());
                        detalles.add(detalle); // Añade el detalle a la lista
                    }
                }
            }
        }

        pedidoForm.getPedido().setDetalles(detalles);

        pedidoService.save(pedidoForm.getPedido());
        
        return "redirect:/pedido/lista";
    }

    @GetMapping("/update/{id}")
    public String mostrarFormularioActualizar(@PathVariable("id") Long id, Model model) {
        Pedido pedidoExistente = pedidoService.searchById(id);
        model.addAttribute("pedido", pedidoExistente);
        model.addAttribute("clientes", clienteService.searchAll());
        model.addAttribute("comidas", comidaService.searchAll());
        return "crearPedido";
    }
}