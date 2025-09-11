package com.example.demo.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Controller;

import com.example.demo.repository.ComidaRepository;

import jakarta.transaction.Transactional;

@Controller
@Transactional
public class DatabaseInit implements ApplicationRunner{

    @Autowired
    ComidaRepository comidaRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        comidaRepository.save(new Comida(
                    "Hamburguesa Gourmet",
                    "Jugosa carne de res, queso maduro, cebolla caramelizada y pan artesanal.",
                    38000, "/images/platos/hamburguesa.png"));

            comidaRepository.save(new Comida(
                    "Salchipapa Especial",
                    "Papas fritas artesanales con salchicha  y salsas de la casa.",
                    28000, "/images/platos/salchiPapa.png"));

            comidaRepository.save(new Comida(
                    "Carne Asada",
                    "Corte de res a la parrilla acompañado de vegetales salteados.",
                    45000, "/images/platos/carneAsada.png"));

            comidaRepository.save(new Comida(
                    "Pollo Asado",
                    "Pechuga de pollo marinada y asada lentamente con hierbas frescas.",
                    32000, "/images/platos/pechugaAsada.png"));

            comidaRepository.save(new Comida(
                    "Ceviche",
                    "Pescado fresco marinado en jugo de limón con cebolla y cilantro",
                    45000, "/images/platos/ceviche.png"));

            comidaRepository.save(new Comida(
                    "Pasta Alfredo",
                    "Pasta fresca con salsa Alfredo cremosa y queso parmesano.",
                    38000, "/images/platos/pasta.png"));

            comidaRepository.save(new Comida(
                    "Pizza Gourmet",
                    "Masa artesanal, salsa de tomate fresco y ingredientes seleccionados.",
                    40000, "/images/platos/pizza.png"));
        }
}
