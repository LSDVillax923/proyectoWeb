package com.example.demo.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.demo.entities.Comida;

@Repository
public class ComidaRepository {
    private Map<Integer, Comida> comidas = new HashMap<>();

    public ComidaRepository() {
        comidas.put(1, new Comida(1, "Ejemplo", "Descripción de ejemplo", 9.99, "http://example.com/imagen.jpg"));
        comidas.put(2, new Comida(2, "Ejemplo 2", "Descripción de ejemplo 2", 19.99, "http://example.com/imagen2.jpg"));
        comidas.put(3, new Comida(3, "Ejemplo 3", "Descripción de ejemplo 3", 29.99, "http://example.com/imagen3.jpg"));
        comidas.put(4, new Comida(4, "Ejemplo 4", "Descripción de ejemplo 4", 39.99, "http://example.com/imagen4.jpg"));

    }
    
    public Comida findById(Integer id) {
        return comidas.get(id);
    }

    public Collection<Comida> findAll() {
        return comidas.values();
    }
}
