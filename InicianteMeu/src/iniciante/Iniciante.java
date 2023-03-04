/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iniciante;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Iniciante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        double peso[] = {4.4, 3.5, 8.7, 6.3};
        double altura[] = {0.9, 1.5, 2.0, 0.4, 1.7};
        double nota[] = {6.0, 5.5, 6.7, 9.8, 10.0, 8.1};
        double preco[] = {10.0, 12.5, 6.5, 14.5, 7.8, 15.0, 9, 5};  
      
       calcSoma(peso);
       calcSoma(altura);
       calcSoma(nota);
       calcSoma(preco);
       
       
       
     calcMedia(peso);
     calcMedia(altura);
     calcMedia(nota);
     calcMedia(preco);
   
     
     calcMaior(peso);
     calcMaior(altura);
     calcMaior(nota);
     calcMaior(preco);
     
        
    }
    
    
    
      public static void calcSoma(double vet[]){
      
          double soma = 0;
            for(int i=0; i<vet.length; i++){
        soma = soma + vet[i];
        }
        
        System.out.println("Soma: "+ soma);
          
      }
      
       public static void calcMedia(double vet[]){
      
          double soma = 0;
            for(int i=0; i<vet.length; i++){
        soma = soma + vet[i];
        }
        
        System.out.println("Média: "+ soma/vet.length);
          
      }
       
        
       
       
    public static void calcMaior(double v[]){
    
        double maior = v[0];
        for (int i=0; i<v.length; i++){
        if (v[0]> maior){
        maior = v[i];
        }
        }
        
        System.out.println("Maior: " + maior);
        
    }
       
       
       
    }
    

