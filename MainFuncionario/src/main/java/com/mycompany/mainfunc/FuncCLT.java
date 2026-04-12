/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainfunc;

/**
 *
 * @author gabri
 */
public class FuncCLT extends Funcionario {
    
    private double bonus;

    public FuncCLT(double bonus, String nome, String cpf, String dataN, String email, String cargo, String formacao, double salarioBase) {
        super(nome, cpf, dataN, email, cargo, formacao, salarioBase);
        this.bonus = bonus;
    }

   

    public FuncCLT() {
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    
    
    
    @Override
    public double calcularSalario() {
        return getSalarioBase() + getBonus();     
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
        System.out.println("Bonûs salárial: " + getBonus() + ".");
        calcularSalario();
        System.out.println("Salario final: " + calcularSalario() + ".");
    }
    
}
