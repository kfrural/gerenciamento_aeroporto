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
    private EstadoVoo estadoVoo;
    
    public enum EstadoVoo{
        QUASE_VOANDO, VOANDO, CHEGOU
    }

    public Voo(String numVoo, String destino, int capacidade) {
        this.numVoo = numVoo;
        this.destino = destino;
        this.capacidade = capacidade;
        this.estadoVoo = EstadoVoo.QUASE_VOANDO;
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
        System.out.println(estadoVoo);
    }
    
    public boolean capMinima(){
        int capMinima = (int) (0.5 * this.capacidade);
        return passageiros.size() < capMinima;
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
        return passageiros;
    }

    public void setPassageiro(List<Passageiro> passageiro) {
        this.passageiros = passageiro;
    }

    public List<String> getEscala() {
        return escala;
    }

    public void setEscala(List<String> escala) {
        this.escala = escala;
    }

    public List<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(List<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }

    public EstadoVoo getEstadoVoo() {
        return estadoVoo;
    }

    public void setEstadoVoo(EstadoVoo estadoVoo) {
        this.estadoVoo = estadoVoo;
    }
    
}
