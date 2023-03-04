/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p2voo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class P2Voo {
    
     public static Scanner scan = new Scanner(System.in);

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
//         Scanner scan = new Scanner(System.in);
       
        String numero[] = new String[10];
        String origem[] = new String[10];
        String destino[] = new String[10];
        String lugares[] = new String[10];

//        int opcao;

     lerDados(numero, origem, destino, lugares);
        
        
        
        
       
    }
    
     
     
     
    public static void lerDados(String numero[], String origem[], String destino[], String lugares[])
            throws FileNotFoundException {

        
        
        File arq = new File("dados.txt");
        Scanner scan = new Scanner(arq);
       
        System.out.printf("%10s %10s %10s %10s\n", scan.next(), scan.next(), scan.next(), scan.next());

        for (int i = 0; i < numero.length; i++) {
            numero[i] = scan.next();
            origem[i] = scan.next();
            destino[i] = scan.next();
            lugares[i] = scan.next();

            System.out.printf("%10S %10S %10S %10S\n", numero[i], origem[i], destino[i], lugares[i]);
        }

    }
    
    
}
