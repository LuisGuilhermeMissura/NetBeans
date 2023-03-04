/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercifelse314032022;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ExercIfElse314032022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int notaA, notaB;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        notaA = scan.nextInt();

        System.out.println("Digite a nota 2: ");
        notaB = scan.nextInt();

        if (notaA != notaB) {

            if (notaA > notaB) {

                System.out.println(notaA + ">" + notaB);

            }

            if (notaA < notaB) {

                System.out.println(notaB + ">" + notaA);

            }

        } else {

            System.out.println("IGUAL");

        }

    }

}
