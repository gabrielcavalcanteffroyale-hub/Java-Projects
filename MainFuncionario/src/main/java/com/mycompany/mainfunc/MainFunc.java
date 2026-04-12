/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mainfunc;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class MainFunc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        FuncCLT f1 = new FuncCLT();
        FuncPJ p1 = new FuncPJ();
        FuncHorista h1 = new FuncHorista();
        
        f1.setNome("Gabriel");
        f1.setCpf("081.047.091-86");
        f1.setDataN("21/01/10");
        f1.setEmail("gabrielcavalcantesilva@gmail.com");
        f1.setCargo("Dev Junior");
        f1.setFormacao("Curso técnico em informática");
        f1.setSalarioBase(3000);
        f1.setBonus(350);
        f1.exibirDados();
               
        p1.setNome("Arthur");
        p1.setCpf("087.065.091-07");
        p1.setDataN("21/01/09");
        p1.setEmail("Arthurcavalcantefreitas@gmail.com");
        p1.setCargo("Dev Senior");
        p1.setFormacao("Doutorado em Eng de software");
        p1.setSalarioBase(5000);
        p1.setBonusP(0.15);
        p1.exibirDados();
        
        h1.setNome("Jorge");
        h1.setCpf("183.198.194-87");
        h1.setDataN("12/06/10");
        h1.setEmail("jorge830@gmail.com");
        h1.setCargo("Dev front-end");
        h1.setFormacao("Curso técnico Java Script");
        h1.setHorasTrabalho(100);
        h1.setValorHora(30);
        h1.exibirDados();
    }
}
