package com.bacondeveight.dao;

import com.bacondeveight.modelo.Cliente;
import com.bacondeveight.modelo.Pedido;
import com.bacondeveight.modelo.Produto;

import javax.persistence.EntityManager;

public class ClienteDao {
    private EntityManager em;

    public ClienteDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Cliente cliente) {
        this.em.persist(cliente);
    }

    public Cliente buscarPorId(Long id) {
        return em.find(Cliente.class, id);
    }
}
