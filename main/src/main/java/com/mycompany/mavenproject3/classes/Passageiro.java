package com.mycompany.mavenproject3.classes;

import java.util.Objects;


/**
 *
 * @author kfrural
 */
public class Passageiro {
    private String nome;
    private String cpf;
    private SistemaFidelidade sistemaFidelidade;

    public Passageiro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Passageiro() {
        this.nome = "";
        this.cpf = "";
        this.sistemaFidelidade = new SistemaFidelidade();
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public SistemaFidelidade getSistemaFidelidade() {
        return sistemaFidelidade;
    }

    public void setSistemaFidelidade(SistemaFidelidade sistemaFidelidade) {
        this.sistemaFidelidade = sistemaFidelidade;
    }
    
}
