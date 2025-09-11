package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Tabla_pedidos")
public class Pedido {

    @Id
    @GeneratedValue
    private Long id;
    private String estado;
    private String fecha;
    private Integer total;

    public Pedido() {
    }

    public Pedido(Long id, String estado, String fecha, Integer total) {
        this.id = id;
        this.estado = estado;
        this.fecha = fecha;
        this.total = total;
    }  

     public Pedido(String estado, String fecha, Integer total) {
        this.estado = estado;
        this.fecha = fecha;
        this.total = total;
    }

     public Long getId() {
         return id;
     }

     public void setId(Long id) {
         this.id = id;
     }

     public String getEstado() {
         return estado;
     }

     public void setEstado(String estado) {
         this.estado = estado;
     }

     public String getFecha() {
         return fecha;
     }

     public void setFecha(String fecha) {
         this.fecha = fecha;
     }

     public Integer getTotal() {
         return total;
     }

     public void setTotal(Integer total) {
         this.total = total;
     }  

    
    
}


