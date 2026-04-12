/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainfunc;

/**
 *
 * @author gabri
 */
public class FuncHorista extends Funcionario{
    
    private double valorHora;
    private int horasTrabalho;

    public FuncHorista(double valorHora, int horasTrabalho, String nome, String cpf, String dataN, String email, String cargo, String formacao, double salarioBase) {
        super(nome, cpf, dataN, email, cargo, formacao, salarioBase);
        this.valorHora = valorHora;
        this.horasTrabalho = horasTrabalho;
    }

    public FuncHorista() {        
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabalho() {
        return horasTrabalho;
    }

    public void setHorasTrabalho(int horasTrabalho) {
        this.horasTrabalho = horasTrabalho;
    }
       
    @Override
    public double calcularSalario() {
        return getHorasTrabalho() * getValorHora();
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
        System.out.println("Valor por hora: " + getValorHora());
        System.out.println("Horas trabalhadas na semana: " + getHorasTrabalho());
        System.out.println("Salario semanal: " + calcularSalario() + ".");
        
    }
    
    
}
