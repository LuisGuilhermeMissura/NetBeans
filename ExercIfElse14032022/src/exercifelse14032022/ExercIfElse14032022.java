/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercifelse14032022;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ExercIfElse14032022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scan = new Scanner(System.in);

        //EXERCICIO 1
        int notaA, notaB, media;

        System.out.println("Digite a nota 1: ");
        notaA = scan.nextInt();

        System.out.println("Digite a nota 2: ");
        notaB = scan.nextInt();

        media = (notaA + notaB) / 2;

        if (media >= 6) {
            System.out.println("Aprovado");

        } else {
            System.out.println("Reprovado");

        }

    }

}
