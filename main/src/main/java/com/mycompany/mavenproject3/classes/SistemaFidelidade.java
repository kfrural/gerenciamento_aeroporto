package com.mycompany.mavenproject3.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author kfrural
 */
public class SistemaFidelidade {
    private int pontos;

    public SistemaFidelidade(int pontos) {
        this.pontos = pontos;
    }

    public SistemaFidelidade() {
        this.pontos = 0;
    }
    
    public void adicionarPontos(int pontos){
        if(pontos >0){
            this.pontos += pontos;
        }
    }
    
    public boolean resgatarPontos(int pontosParaResgate) {
        if (pontosParaResgate <= 0 || pontosParaResgate > this.pontos) {
            return false;
        } else {
            this.pontos -= pontosParaResgate;
            return true;
        }
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    
}
