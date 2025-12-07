

package com.mycompany.primo;

import java.util.Scanner;


public class Primo {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean primo;
        
        //Receber o número.
        System.out.println("Digite um número e veja se ele é primo ou não:");
        int n1 = sc.nextInt();
        
        //IF para saber se o número informado é menor ou igual a 1.
        if (n1 <= 1) {
            System.out.println(n1+" não é primo.");
        }
        
        //Loop para saber se o número é primo ou não.
        for (int i = 2; i <= n1-1; i++) {
            
            if (n1 % i == 0) {
                primo = false;
            }
            
            else {
                primo = true;
            }

        }
        
        //If para mostrar o resultado.
        if (primo = true) {
            System.out.println(n1+" é primo.");
        }
        
        else {
            System.out.println(n1+" não é primo.");
        }
        
        
        
        
        
        
        
    }
    
    
}
