/*
1. Faça um programa que receba 5 números inteiros e calcule e mostre:

a) a soma dos números digitados
b) a média dos números digitados  
c) o maior e o menor número digitado
d) a qtde  de números pares digitados
e) a soma de números ímpares digitados
*/

package lacoforexemplo1;
import java.util.Scanner;
public class LacoForExemplo1 {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int num, soma = 0;
       double media;
       int contPar = 0;
       
       int maior = -1;
       int menor = -1;
       
       int somaImpar = 0;
       
       for(int i=0; i<5; i++){
           System.out.print("Digite o número: ");
           num = scan.nextInt();
           
           //item a
           soma = soma + num;
           
           //item b
           if( i==0 ){
           maior = num;
           menor = num;
           }
           if(num > maior){
               maior = num;
           }
           if(num < menor){
           menor = num;
           }
           
           //item d
           if(num % 2 == 0){
               contPar = contPar + 1;
           } 
               //item e
               if(num % 2 == 1){
               somaImpar = somaImpar + num;
               }
           }
       
       
       //item a
        System.out.println("Soma: " + soma);
        
        //item b
        media = (double)soma / 5;// O comando (double) converte o valor 
                                 // armazenado pela variável soma de int para double
        System.out.println("Média: " + media);
        
        //item c
        System.out.println("O maior é: " + maior);
        System.out.println("O menor é: " + menor);
        
        //item d
        System.out.println("A quantidade de valores pares é: " + contPar);
        
        //item e
        System.out.println("A soma dos ímpares é: " + somaImpar);
    }

}