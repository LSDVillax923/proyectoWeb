package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;


@Entity
public class Pedido {

    @Id
    @GeneratedValue
    private Long id;
    private String estado;

    @ManyToMany
    private List<Comida> comidas = new ArrayList<>();

    public Pedido() {
    }

    public Pedido(Long id, String estado) {
        this.id = id;
        this.estado = estado;
    }

    public Pedido(String estado) {
        this.estado = estado;
 
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


    public List<Comida> getComidas() {
        return comidas;
    }

    public void setComidas(List<Comida> comidas) {
        this.comidas = comidas;
    }

}
