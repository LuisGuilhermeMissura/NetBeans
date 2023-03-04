/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
 /*
Crie um programa que receba três valores (obrigatoriamente maiores que zero),
representando as medidas dos três lados de um triãngulo
    Elabore sub-rotinas para:

    *determinar se esses lador formam um triãngulo(sabe-se que, para sr um triângulo, a medida de um lado
deve ser inferior ou igual à soma das medidas de outros dois).
    *determinar e mostrar o tipo de triângulo (equilátero, isósceles ou escaleno), caso as medidas formem
um triângulo

Todas as mensagens deverão ser mostradas no programa principal

 */
package tresvalorestriangulo;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TresValoresTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scan = new Scanner(System.in);
        //nextTIPO
        //VARIAVEL = scan.nextDouble();
        
        double a, b, c;
        
        System.out.println("Digite os lados");
        System.out.print("a: ");
        a = scan.nextDouble();
        System.out.print("b: ");
        b = scan.nextDouble();
        System.out.print("c: ");
        c = scan.nextDouble();
        
        if(formaTri(a, b, c)){
            System.out.println("Formam Triângulos");
            
            System.out.println(classificaTri(a, b, c));
        }else{
            System.out.println("Não Forma");
        }

    }

    public static boolean formaTri(double a, double b, double c) {

        /*  if (a < b + c && b < a + c && c < a + b) {
            return true;
        } else {
            return false;
        }*/
        return a < b + c && b < a + c && c < a + b;

    }

    public static String classificaTri(double a, double b, double c) {

        if (a == b && b == c) {
            return "equilátero";
        } else if (a == b || b == c || a == c) {
            return "isóscele";
        } else {
            return "escaleno";
        }

    }

}
