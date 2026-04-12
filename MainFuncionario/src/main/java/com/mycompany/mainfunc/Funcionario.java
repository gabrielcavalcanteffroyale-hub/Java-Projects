/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainfunc;

/**
 *
 * @author gabri
 */
public class Funcionario {
    
    private String nome;
    private String cpf;
    private String dataN;
    private String email;
    private String cargo;
    private String formacao;
    private double salarioBase;

    public Funcionario(String nome, String cpf, String dataN, String email, String cargo, String formacao, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataN = dataN;
        this.email = email;
        this.cargo = cargo;
        this.formacao = formacao;
        this.salarioBase = salarioBase;
    }

    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataN() {
        return dataN;
    }

    public void setDataN(String dataN) {
        this.dataN = dataN;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public double calcularSalario() {
        return getSalarioBase();
    }
    
    public void exibirDados() {
        System.out.println("");
        System.out.println("Nome: " + getNome() + ".");
        System.out.println("CPF: " + getCpf() + ".");
        System.out.println("Data de nascimento: " + getDataN() + ".");
        System.out.println("Email: " + getEmail() + ".");
        System.out.println("Cargo: " + getCargo() + ".");
        System.out.println("Formação: " + getFormacao() + ".");
        System.out.println("Salario base: " + getSalarioBase() + ".");
    }
}
