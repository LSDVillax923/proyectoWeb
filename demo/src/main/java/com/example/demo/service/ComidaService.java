package com.example.demo.service;

import java.util.Collection;
import java.util.List;

import com.example.demo.entities.Comida;

public interface ComidaService {

    public Comida searchById(Long id);

    public Collection<Comida> searchAll();

    public void save(Comida comida);

    public void deleteById(Long id);

    public List<Comida> searchAllById(List<Long> ids);
    
}
