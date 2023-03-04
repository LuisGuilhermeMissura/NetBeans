/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetores;

import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Vetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scan = new Scanner(System.in);
         
        String descricao[] = new String[6];
        int qtdestoque[] = new int[6];
        double precounit[] = new double[6];
        
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a descrição: ");
            descricao[i] = scan.next();
            
            System.out.println("Digite a Quantidade em estoque: ");
            qtdestoque[i] = scan.nextInt();
            
            System.out.println("Difite o Preço: ");
            precounit[i] = scan.nextDouble();
            
            
        }
      
        
        System.out.println("Descricao   QtdEstoque    PrecoUnnit");
        for (int i = 0; i < 6; i++) {
     
        //System.out.println(descricao[0] + "      " + qtdestoque[0]);
        System.out.printf("%-12s %-12d %-12.2f\n", descricao[i], qtdestoque[i], precounit[i]);
        
        }
        
    }
    
}
