package com.example.demo.dto;

public class PedidoItemDTO {
    private Long comidaId;
    private int cantidad;

    // Getters y Setters
    public Long getComidaId() {
        return comidaId;
    }

    public void setComidaId(Long comidaId) {
        this.comidaId = comidaId;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
