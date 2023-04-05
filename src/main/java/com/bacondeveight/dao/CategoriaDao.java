package com.bacondeveight.dao;

import com.bacondeveight.modelo.Categoria;
import com.bacondeveight.modelo.Produto;

import javax.persistence.EntityManager;
import java.awt.*;

public class CategoriaDao {
    private EntityManager em;

    public CategoriaDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Categoria categoria) {
        this.em.persist(categoria);
    }

    public void atualizar(Categoria categoria) {
        this.em.merge(categoria);
    }

    public void remover(Categoria categoria) {
        categoria = this.em.merge(categoria);
        this.em.remove(categoria);
    }
}
