// Ejemplo de DetallePedidoService
package com.example.demo.service;

import com.example.demo.entities.DetallePedido;
import com.example.demo.repository.DetallePedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetallePedidoService {

    @Autowired
    private DetallePedidoRepository detallePedidoRepository;

    public DetallePedido save(DetallePedido detalle) {
        return detallePedidoRepository.save(detalle);
    }
}