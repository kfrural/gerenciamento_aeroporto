package com.mycompany.mavenproject3.classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class Aeroporto {
    private String nome;
    private String localizacao;
    private List<Voo> voo = new ArrayList<>();

    public Aeroporto(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
    }

    public Aeroporto() {
        this.nome = "";
        this.localizacao = "";
    }
    
    public void adicionarVoo(Voo voo){
        this.voo.add(voo);
    }   
    
    public void removerVoo(Voo voo){
        this.voo.remove(voo);
    }
    
    public void listarVoo(){
        for(Voo v: this.voo)
            System.out.println(v);
    }
    
    public void prejuizo(){
        System.out.println("VOO COM PREJUIZO");
        //TEM Q FAZER
    }
    
    public void iniciarVoo(){
        System.out.println("VOO INICIADO");
        //TEM Q FAZER
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public List<Voo> getVoo() {
        return voo;
    }

    public void setVoo(List<Voo> voo) {
        this.voo = voo;
    }
    
}
