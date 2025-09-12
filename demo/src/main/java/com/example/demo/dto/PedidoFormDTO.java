// Archivo: com/example/demo/dto/PedidoFormDTO.java
package com.example.demo.dto;

import com.example.demo.entities.Pedido;
import java.util.List;

public class PedidoFormDTO {
    
    private Pedido pedido;
    private Long cliente;
    private List<PedidoItemDTO> pedidoItems;

    // Getters y Setters
    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Long getCliente() {
        return cliente;
    }

    public void setCliente(Long cliente) {
        this.cliente = cliente;
    }

    public List<PedidoItemDTO> getPedidoItems() {
        return pedidoItems;
    }

    public void setPedidoItems(List<PedidoItemDTO> pedidoItems) {
        this.pedidoItems = pedidoItems;
    }
}