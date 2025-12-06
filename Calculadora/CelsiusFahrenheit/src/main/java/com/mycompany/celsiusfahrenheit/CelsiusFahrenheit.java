

package com.mycompany.celsiusfahrenheit;

import java.util.Scanner;


public class CelsiusFahrenheit {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //Informar a temperatura em celsius.
        System.out.println("Informe uma temperatura em celsius:");
        double celsius = sc.nextDouble();
        
        //Chamar o metodo.
        double fahrenheit = converter(celsius);
        
        //Exibir a temperatura em celsiuconvertida para fahrenheit.
        System.out.println("Concluído com sucesso!!\n"+celsius+" graus em celsius é exatamente "+fahrenheit+" graus em fahrenheits");
    }
    
    public static double converter(double celsius) {
        
        return (celsius * 9.0/5.0) + 32;
        
        
    }
}
