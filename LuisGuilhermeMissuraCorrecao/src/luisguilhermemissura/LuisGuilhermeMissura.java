/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package luisguilhermemissura;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class LuisGuilhermeMissura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);

        String nome_ = "";
        int cat_ = 0;
        double valorV_;
        double sal = 0;
        double vendaB = 0;
        double mediaGeral = 0;
        double mediaGeral2 = 0;
        double mediaGeral3 = 0;
        double mediaExterna = 0;
//        int maiorVCAT = 0;
//        String maiorVNOME;
        double maiorV = 0;

        String nome[] = {"Ana", "Ivo", "Bia", "Leo", "Lia"};
        int cat[] = {2, 1, 3, 3, 2};
        double valorV[] = {40000, 60000, 20000, 30000, 50000};

        for (int i = 0; i < 5; i++) {

//            System.out.println("Digite seu nome: ");
//            nome = scan.next();
//
//            System.out.println("Digite a sua categoria: ");
//            System.out.println("1 - BALCÃO / 2 - EXTERNO / 3 - ONLINE");
//            cat = scan.nextInt();
//
//            System.out.println("Qual o Valor da Venda: ");
//            valorV = scan.nextDouble();

            mediaGeral2 = valorV[i] + 0;
            mediaGeral3 = mediaGeral2 + mediaGeral2 / 2;

            //dando valor errado!
//            
//            if(cat == 1){
//            valorV = valorV * 0.05;
//            
//            
//            }else if( cat == 2){
//            valorV = valorV * 0.07;
//            
//            }else if(cat == 3){
//            valorV = valorV * 0.04;
//            }
//            
            if (valorV[i] > maiorV) {
                maiorV = valorV[i];

                mediaGeral = valorV[i];
            }
            

            System.out.println(" ");

            System.out.println("Nome: " + nome[i]);

            System.out.println("Categoria: " + cat[i]);

            System.out.println("Valor de vendas: " + valorV[i]);

            System.out.println(" ");

            if (cat[i] == 2) {
                mediaExterna = valorV[i];
            }

            /*
            1 - Balcão
            2 -  Externo
            3 - Online
             */
        }

        mediaGeral2 = mediaGeral2 / 5;

//************        System.out.println("Maior Venda é de: " + nome);
        System.out.println("Maior Venda é de: " + maiorV);
//***********        System.out.println("Sua categoria é: " + cat);
        System.out.println(" ");

        System.out.println("Média Geral de vendas é: " + mediaGeral3);

        //média de vendedor externo
        mediaExterna = mediaExterna / 5;

        System.out.println("Média de vendas de Vendedores externos: " + mediaExterna);

    }

}
