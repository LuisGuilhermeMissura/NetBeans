/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package papelariaclasse;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class PapelariaClasse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
       

      Estoque stq[] = new Estoque[6];
      
        lerDados(stq);
        
        exibirDados(stq);
        
        for (int i = 0; i < 6; i++) {
            
            stq[i] = new Estoque();
            
        }
 
    }
    
    public static void lerDados(Estoque stq[]) throws FileNotFoundException{
        
        File arq = new File("dados.txt");
        Scanner scanFile = new Scanner(arq);
    
        for (int i = 0; i < 6; i++) {
             stq[i] = new Estoque();
             stq[i].cod = scanFile.nextInt();
             stq[i].descricao = scanFile.next();
             stq[i].qtdEstoque = scanFile.nextInt();
             stq[i].estoqueMinimo = scanFile.nextInt();
             stq[i].precoCompra = scanFile.nextDouble();
             stq[i].precoVenda = scanFile.nextDouble();
            
             
        }
        
       
    
    }
    
     public static void exibirDados(Estoque stq[]) {
     
     String saida = "";
     
     saida += String.format("%14s %14s %14s %14s %14s %14s\n", "Codigo", "Descrição", "Qtd Estoque", "EstoqueMinimo", "PreçoCompra", "PreçoVenda");
     
         for (int i = 0; i < 6; i++) {
             
           saida += String.format("%14d %14s %14d %14d %14.2f %14.2f\n", stq[i].cod, stq[i].descricao, stq[i].qtdEstoque, stq[i].estoqueMinimo, stq[i].precoCompra, stq[i].precoVenda);
             
             
         }
         
         JOptionPane.showMessageDialog(null, saida);
     
     }

}
/*

 Estoque estq1;
  // System.out.println(estql.);
        Estoque estq2 = new Estoque();
        System.out.println(estq2.cod);
        System.out.println(estq2.descricao);

        double vetDou[] = new double[3];
        Estoque estqVet[] = new Estoque[3];

        System.out.println("vetDou[2] " + vetDou[2]);
        System.out.println("estqVet[2] " + estqVet[2]);
        //System.out.println("estqVet[2] " + estqVet[2].cod);
        
        //String nome;
        
        estqVet[2] = new Estoque();
        
        String saida;
        
        saida = String.format("%14d %14s\n", estqVet[2].cod, estqVet[2].descricao);
        
        System.out.println(saida);
        
        //JOptionPane.showConfirmDialog(null, saida);
        JOptionPane.showMessageDialog(null, saida);
        
        
              System.out.println("\n\n\n");
*/