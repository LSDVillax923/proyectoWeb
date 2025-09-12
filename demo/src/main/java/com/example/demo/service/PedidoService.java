package com.example.demo.service;

import com.example.demo.entities.Pedido;

import java.util.Collection;

public interface PedidoService {

    public Pedido searchById(Long id);

    public Collection<Pedido> searchAll();

    public void save(Pedido pedido);

    public void deleteById(Long id);
}