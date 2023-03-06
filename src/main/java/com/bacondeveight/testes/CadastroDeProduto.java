package com.bacondeveight.testes;

import com.bacondeveight.dao.CategoriaDao;
import com.bacondeveight.dao.ProdutoDao;
import com.bacondeveight.modelo.Categoria;
import com.bacondeveight.modelo.Produto;
import com.bacondeveight.util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class CadastroDeProduto {
    public static void main(String[] args) {
        Categoria celulares = new Categoria("CELULARES");
        Produto celular = new Produto();
        celular.setNome("Xiaomi");
        celular.setDescricao("bacana");
        celular.setPreco(new BigDecimal("800"));
        celular.setCategoria(celulares);

        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDao produtoDao = new ProdutoDao(em);
        CategoriaDao categoriaDao = new CategoriaDao(em );

        em.getTransaction().begin();

        categoriaDao.cadastrar(celulares);
        produtoDao.cadastrar(celular);
        em.getTransaction().commit();
        em.close();
    }
}
