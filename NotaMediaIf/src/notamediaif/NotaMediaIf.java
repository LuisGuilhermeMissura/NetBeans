/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notamediaif;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class NotaMediaIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
           Scanner scan = new Scanner(System.in);
           
           double nota;
           
           System.out.println("Digite a sua nota: ");
        
           nota = scan.nextDouble();
        
           if(nota <= 3){
               System.out.println("Reprovado!");
               
           }else if(nota >3 && nota <=7){
              
        System.out.println("Exame!");
               
                             
           }else if(nota >7 && nota <= 10){
                   
                System.out.println("Aprovado");   
                   
                   }
           else{
           
               System.out.println("Nota INVÀLIDA!!!!");
           }
          
           
           
           
        
        
        
    }
    
}
