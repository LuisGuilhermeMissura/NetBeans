/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
 /*crie um programa que receba os valores antigo e atual de um produto.
Chame uma sub-rotina que determine o percentual de acréscino entre
esses valores. O resultado deverá ser mostrado no programa principal*/
package precoantigoatual;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PrecoAntigoAtual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scan = new Scanner(System.in);

        double valor1, valor2, porc;

        System.out.println("Digite os preços");
        System.out.println("antigo: ");
        valor1 = scan.nextDouble();
        System.out.println("novo: ");
        valor2 = scan.nextDouble();

        System.out.println("porcentagem a mais: ");
        System.out.println(proporcao(porc));

    }

    public static double proporcao(double valor1, double valor2) {

        porc = ((valor1 / valor) * 100);

        return porc;
    }

}
