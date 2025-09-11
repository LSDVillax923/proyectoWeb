package com.example.demo.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Comida;
import com.example.demo.repository.ComidaRepository;


@Service

public class ComidaServiceImpl implements ComidaService {

    @Autowired
    ComidaRepository comidaRepository;

    @Override
    public Comida searchById(Integer id) {
        return comidaRepository.findById(id);
    }

    @Override
    public Collection<Comida> searchAll() {
        return comidaRepository.findAll();
    }

    @Override
    public void save(Comida comida) {
        comidaRepository.save(comida);
    }

    @Override
    public void deleteById(Integer id) {
        comidaRepository.deleteById(id);
    }

}
