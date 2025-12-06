

package com.mycompany.calculadora;

import java.util.Scanner;


public class calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        
        //Código para solicitar o 1° número ao o usuário.
        System.out.println("Informe o 1° número:");
        double n1 = sc.nextDouble();
        
        //Código para solicitar o 2° número ao o usuário.
        System.out.println("Informe o 2° número:");
        double n2 = sc.nextDouble();
        
        //Código para solicitar a operação.
        System.out.println("Informe um sinal de operação. EX: +, -, * ou /.");
        char operação = sc.next().charAt(0);
        
        //Variável para armazenar o resultado.
        double result;
        
        //Código para analizar qual operação o usuário escolheu.
        switch (operação) {
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            case '/':
                result = n1 / n1;
                break;
            default:
                System.out.println("Operação inválida. Tente novamente.");
                return;
        }
        
        //Mostrando o resultado para o usuário.
        System.out.println("O resultado de "+n1+" "+operação+" "+n2+" é: "+result);
                
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
