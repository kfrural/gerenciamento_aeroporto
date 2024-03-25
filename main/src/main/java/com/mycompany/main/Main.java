/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import com.mycompany.mavenproject3.classes.Aeroporto;
import com.mycompany.mavenproject3.classes.Passageiro;
import com.mycompany.mavenproject3.classes.Voo;

/**
 *
 * @author kfrural
 */
public class Main {

    public static void main(String[] args) {
    Aeroporto aeroporto = new Aeroporto("Aeroporto Internacional de Brasília", "Brasília");
    Voo voo1 = new Voo("BR123", "Nova York", 100);
    Passageiro passageiro1 = new Passageiro("João Silva", "12345678900");

    // Adicionando escalas ao voo
    voo1.addEscala("Miami");
    voo1.addEscala("Orlando");

    aeroporto.adicionarVoo(voo1);
    voo1.addPassageiro(passageiro1);
    
    // Passageiro acumula pontos após completar um voo
    passageiro1.getSistemaFidelidade().adicionarPontos(500);

    // Iniciar voo
    //aeroporto.iniciarVoo("BR123");

    // Verificar voos com prejuízo
//    System.out.println("Voos com prejuízo:");
//    List<Voo> voosPrejuizo = aeroporto.calcularVoosComPrejuizo();
//    for (int i = 0; i < voosPrejuizo.size(); i++) {
//        System.out.println(voosPrejuizo.get(i).getNumeroDoVoo());
//    }
}
}
