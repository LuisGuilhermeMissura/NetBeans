/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scan;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Scan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner scan = new Scanner(System.in);
       
       double notaA, notaB, notaC, media;
       
        System.out.println("Digite a nota A: ");
        notaA = scan.nextDouble();
        
        System.out.println("Digite a nota B: ");
        notaB = scan.nextDouble();
        
        System.out.println("Digite a nota C: ");
        notaC = scan.nextDouble();
        
        System.out.println("Média: "+ (notaA+notaB+notaC)/3);
        
        
    }
    
}
