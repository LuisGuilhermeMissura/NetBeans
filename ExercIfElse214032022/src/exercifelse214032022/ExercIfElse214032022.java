/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercifelse214032022;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ExercIfElse214032022 {

      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner scan = new Scanner(System.in);
         
         
         //EXERCICIO 3
         
        
        int notaA, notaB, notaC, media;
         
           System.out.println("Digite a nota 1: ");
        notaA = scan.nextInt();
        
        System.out.println("Digite a nota 2: ");
        notaB = scan.nextInt();
        
        System.out.println("Digite a nota 3: ");
        notaC = scan.nextInt();
        
        
        
        if((notaA<notaB+notaC)&&(notaB<notaC+notaA)&&(notaC<notaA+notaB)){
            System.out.println("É um Triângulo");
        
        }
        else{
            System.out.println("Não é um Triângulo");
        
        }
        
        
        
        
        
    }
    
}
