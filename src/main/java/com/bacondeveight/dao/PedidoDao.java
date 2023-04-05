package com.bacondeveight.dao;

import com.bacondeveight.modelo.Categoria;
import com.bacondeveight.modelo.Pedido;

import javax.persistence.EntityManager;

public class PedidoDao {
    private EntityManager em;

    public PedidoDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Pedido pedido) {
        this.em.persist(pedido);
    }

    public void atualizar(Pedido pedido) {
        this.em.merge(pedido);
    }

    public void remover(Pedido pedido) {
        pedido = this.em.merge(pedido);
        this.em.remove(pedido);
    }
}
