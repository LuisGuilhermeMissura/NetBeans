/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercaula07032022;

import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class ExercAula07032022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        
        
         double notaA, notaB;
        
        System.out.println("VAMOS SUBTRAIR!!! :D");
        
                 
        System.out.println("Digite o valor A: ");
        notaA = scan.nextDouble();
        
        System.out.println("Digite o valor B: ");
        notaB = scan.nextDouble();
        
         System.out.println("Resultado: "+ ( notaA - notaB ) );
        
        
        
    }
    
}
