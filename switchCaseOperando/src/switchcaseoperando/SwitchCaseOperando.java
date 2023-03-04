/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchcaseoperando;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class SwitchCaseOperando {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scan = new Scanner(System.in);

        double num1, num2, resultado;
        int operacao;

        System.out.println("DIGITE A SUA OPERAÇÃO: ");
        System.out.println("1 para somar");
        System.out.println("2 para subtrair");
        System.out.println("3 para multiplicar");
        System.out.println("4 para dividir");

        operacao = scan.nextInt();

        System.out.println("DIGITE O PRIMEIRO VALOR: ");
        num1 = scan.nextDouble();

        System.out.println("DIGITE O SEGUNDO VALOR: ");
        num2 = scan.nextDouble();

        switch (operacao) {
            case (1):
                resultado = num1 + num2;
                System.out.println("Somar");
                System.out.println("RESULTADO: " + resultado);
                break;
            case (2):
                if(num2 < 0){
                System.out.println("Negativo!!");
                }else{
                resultado = num1 - num2;
                System.out.println("Subtrair");
                System.out.println("RESULTADO: " + resultado);
                }
                break;
            case (3):
                resultado = num1 * num2;
                System.out.println("Multiplicar");
                System.out.println("RESULTADO: " + resultado);
                break;
            case (4):
                if(num2 == 0){
                System.out.println("Impossível dividir");
                }else{
                resultado = num1 / num2;
                System.out.println("Dividir");
                System.out.printf("RESULTADO: %.2f \n ", resultado);
                }
                break;
                
                

        }
    }

    }
