package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Comida {
    private Integer id;
    private String nombre;
    private String descripcion;
    private Integer precio;
    private String imagenUrl;
}

