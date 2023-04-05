package com.bacondeveight.modelo;

import javax.persistence.*;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String Cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        Cpf = cpf;
    }

    public Cliente() {
    }

}
