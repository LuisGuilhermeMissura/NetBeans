/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

 /*
1) Implemente um método que receba um número inteiro e verifique se 
ele é positivo ou negativo.

2) Implemente um método que receba um número inteiro e retorne 1 se 
ele for positivo ou -1 se ele for negativo. No método main, exiba a 
mensagem “ número positivo” ou “número negativo”, conforme for o 
caso.

3) Implemente um método que receba um número inteiro e retorne o 
caractere + se ele for positivo ou retorne o caractere - se ele for 
negativo. No método main, exiba a mensagem “ número positivo” ou 
“número negativo”, conforme for o caso.

3) Implemente um método que receba um número inteiro e retorne a 
palavra positivo se ele for positivo ou retorne negativo se ele for 
negativo. Exiba a resposta no método main.

4) Implemente um método que receba um número inteiro e retorne o 
booleano true se ele for positivo ou retorne false se ele for negativo. No 
método main, exiba a mensagem “ número positivo” ou “número 
negativo”, conforme for o caso.
 */
package exerciciosmetodos;

/**
 *
 * @author Usuario
 */
public class ExerciciosMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        sinal_1(10);
        //sinal_1(-5);
        int num = 9;

        if (sinal_2(num) == 1) {

            System.out.println("\nMétodo 2: " + num + " é positivo");

        } else {

            System.out.println("\nMétodo 2: " + num + " é negativo");

        }

        num = -2;

        if (sinal_3(num) == '+') {

            System.out.println("\nMétodo 3: " + num + " é positivo");

        } else {

            System.out.println("\nMétodo 3: " + num + " é negativo");

        }

        if (sinal_4(num) == "Positivo") {

            System.out.println("\nMétodo 4: " + num + " é positivo");

        } else {

            System.out.println("\nMétodo 4: " + num + " é negativo");

        }
        
         if (sinal_5(num)) {

            System.out.println("\nMétodo 5: " + num + " é positivo");

        } else {

            System.out.println("\nMétodo 5: " + num + " é negativo");

        }
        
        

    }
//exerc 1

    public static void sinal_1(int num) {

        if (num > 0) {

            //System.out.println("\nMétodo 1: Número positivo");
            System.out.println("\nMétodo 1: " + num + " é positivo");
        } else {
            //System.out.println("\nMétodo 2: Número negativo");
            System.out.println("\nMétodo 1: " + num + " é negativo");
        }

    }

    //exerc 2
    public static int sinal_2(int num) {

        /*  int n;
        if (num > 0) {
            n = 1;
        } else {
            n = -1;
        }

        return n;*/
        //-------------------------------------------------
        if (num > 0) {

            return 1;

        } else {

            return -1;

        }

    }
//exerc 3

    public static char sinal_3(int num) {

        if (num > 0) {

            return '+';

        } else {

            return '-';

        }

    }

    //exerc 4
    public static String sinal_4(int num) {

        if (num > 0) {

            return "Positivo";

        } else {

            return "Negativo";

        }

    }
    
    public static boolean sinal_5(int num){
    
      if (num > 0) {

            return true;

        } else {

            return false;

        }
    
    
    
    }

}
