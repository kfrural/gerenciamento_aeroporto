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
    private List<Voo> voo;

    public Aeroporto(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.voo =  new ArrayList<>();
    }

    public Aeroporto() {
        this.nome = "";
        this.localizacao = "";
        this.voo =  new ArrayList<>();
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
    
    public List<Voo> prejuizo(){
        //System.out.println("VOO COM PREJUIZO");
        List<Voo> voosPrejuizo = new ArrayList<>();
        for(Voo v : this.voo){
            if(v.capMinima())
                voosPrejuizo.add(v);
        }
        return voosPrejuizo;
    }
    
    public void iniciarVoo(String numVoo){
        //System.out.println("VOO INICIADO");
        for(Voo v: this.voo){
            if(v.getNumVoo().equals(numVoo) && v.getEstadoVoo() == Voo.EstadoVoo.QUASE_VOANDO){
                v.setEstadoVoo(Voo.EstadoVoo.VOANDO);
                System.out.println("O voo a frente foi iniciado: " + numVoo);
                return;
            }
        }
        System.out.println("nao achei o voo ou ele nao pode ser feito");
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
