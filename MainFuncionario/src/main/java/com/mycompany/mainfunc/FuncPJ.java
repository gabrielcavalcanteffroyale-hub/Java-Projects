/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainfunc;

/**
 *
 * @author gabri
 */
public class FuncPJ extends Funcionario{
    
    private double bonusP;

    public FuncPJ(String nome, String cpf, String dataN, String email, String cargo, String formacao, double salarioBase, double bonusP) {
        super(nome, cpf, dataN, email, cargo, formacao, salarioBase);
        this.bonusP = bonusP;
    }

    public FuncPJ() {
    }

    public double getBonusP() {
        return bonusP;
    }

    public void setBonusP(double bonusP) {
        this.bonusP = bonusP;
    }
    
    
    
   
    @Override
    public double calcularSalario() {
       return getSalarioBase() + (getSalarioBase() * getBonusP());
    }
    
    @Override
     public void exibirDados() {
         System.out.println("");
        System.out.println("Nome: " + getNome() + ".");
        System.out.println("CPF: " + getCpf() + ".");
        System.out.println("Data de nascimento: " + getDataN() + ".");
        System.out.println("Email: " + getEmail() + ".");
        System.out.println("Cargo: " + getCargo() + ".");
        System.out.println("Formação: " + getFormacao() + ".");
        System.out.println("Salario base: " + getSalarioBase() + ".");
        System.out.println("Bonûs porcentual: " + getBonusP() + ".");
        calcularSalario();
        System.out.println("Salario final: " + calcularSalario() + ".");
    }
    
}
