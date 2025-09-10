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
       comidas.put(1, new Comida(1, "Hamburguesa Gourmet", "Jugosa carne de res, queso maduro, cebolla caramelizada y pan artesanal.", 38000.0,
                "/images/platos/hamburguesa.png"));
        comidas.put(2, new Comida(2, "Salchipapa Especial", "Papas fritas artesanales con salchicha  y salsas de la casa.", 28000.0,
                "/images/platos/salchipapa.png"));
        comidas.put(3, new Comida(3, "Carne Asada", "Corte de res a la parrilla acompañado de vegetales salteados.", 45000.0,
                "/images/platos/carneAsada.png"));
        comidas.put(4, new Comida(4, "Pollo Asado", "Pechuga de pollo marinada y asada lentamente con hierbas frescas.", 32000.0,
                "/images/platos/pechugaAsada.png"));
        comidas.put(5, new Comida(5, "Ceviche", "Pescado fresco marinado en jugo de limón con cebolla y cilantro", 45000.0,
                "/images/platos/ceviche.png"));
        comidas.put(6, new Comida(6, "Pasta Alfredo", "Pasta fresca con salsa Alfredo cremosa y queso parmesano.", 38000.0,
                "/images/platos/pasta.png"));
        comidas.put(7, new Comida(7, "Pizza Gourmet", "Masa artesanal, salsa de tomate fresco y ingredientes seleccionados.", 40000.0,
                "/images/platos/pizza.png"));
    }
    
    public Comida findById(Integer id) {
        return comidas.get(id);
    }

    public Collection<Comida> findAll() {
        return comidas.values();
    }
}
