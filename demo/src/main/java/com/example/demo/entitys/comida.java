package com.example.demo.entitys;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class comida {
    private Integer id;
    private String nombre;
    private String descripcion;
    private Double precio;
    private String imagenUrl;
}

