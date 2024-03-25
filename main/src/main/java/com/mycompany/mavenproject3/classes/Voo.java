package com.mycompany.mavenproject3.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author kfrural
 */
public class Voo {
    private String numVoo;
    private String destino;
    private int capacidade;
    private List<Passageiro> passageiros = new ArrayList<>();
    private List<String> escala = new ArrayList<>();

    public Voo(String numVoo, String destino, int capacidade) {
        this.numVoo = numVoo;
        this.destino = destino;
        this.capacidade = capacidade;
    }
    
    public void addPassageiro(Passageiro passageiro){
        if(passageiros.size() < capacidade)
            passageiros.add(passageiro);
        else
            System.out.println("nao tem mais lugar");
    }
    
    public void removerPassageiro(Passageiro passageiro){
        this.passageiros.remove(passageiro);
    }
    
    public void addEscala(String escala){
        this.escala.add(escala);
    }
    
    public void removerEscala(String escala){
        this.escala.remove(escala);
    }

    public void estadoVoo(){
        System.out.println("TEM Q FAZER");
    }
    
    public boolean capMinima(int capMinima){
        return passageiros.size() < capMinima;
        //O USUARIO TEM Q FALAR A CPACIDADE MINIMA, NAO ACHO Q SEJA ISSO
    }
    
    public String getNumVoo() {
        return numVoo;
    }

    public void setNumVoo(String numVoo) {
        this.numVoo = numVoo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public List<Passageiro> getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(List<Passageiro> passageiro) {
        this.passageiro = passageiro;
    }

    public List<String> getEscala() {
        return escala;
    }

    public void setEscala(List<String> escala) {
        this.escala = escala;
    }
    
}
