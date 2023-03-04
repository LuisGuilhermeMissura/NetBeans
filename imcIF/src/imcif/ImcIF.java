/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imcif;

import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class ImcIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          Scanner scan = new Scanner(System.in);
           
           double peso, altura, imc;
           
           System.out.println("Digite o seu peso: ");
        
           peso = scan.nextDouble();
           
           System.out.println("Digite a sua altura: ");
        
           altura = scan.nextDouble();
           
           
           
           imc = (peso / (altura * altura)*100);
           
           imc = imc * 100;
           
           if(imc < 20) {
               
               System.out.println("Abaixo do peso");
           
           }else if(imc >= 20 && imc <=24){
           
               System.out.println("Normal");
               
           }else if(imc > 24 && imc <= 30){
           
               System.out.println("Excesso de peso");
               
           }else if(imc > 30 && imc <= 35){
           
               System.out.println("Obesidade");
               
           }else{
           
               System.out.println("Obesidade Mórbida");
               
           }
           
           
           
    }
    
}
