/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

 /*Escreva um programa para gerenciar uma imobiliária que possui 5 imóveis. Os dados dos
imóveis são:
 • categoria: r para residencial, g para galpão e c para comercial
 • aluguel base
 • situação do imóvel: 1 para alugado e 2 para disponível
O programa deve ler a categoria, o valor do aluguel base e a situação do imóvel e realizar as
seguintes tarefas:
(2,0) (a) Calcular e exibir o aluguel final dos imóveis que estão alugados. O aluguel final é
calculado segundo a tabela abaixo:
categoria Porcentagem de acréscimo
r 5%
g 7%
c 10%
(1,0) (b) Calcular e escrever a média total dos aluguéis base.
(2,0) (c) Calcular e escrever a média dos aluguéis base dos imóveis residenciais.
(2,0) (d) Calcular e escrever a porcentagem de imóveis disponíveis.
(2,0) (e) Encontrar e escrever o valor do aluguel base do imóvel mais barato e escrever,
também, a sua categoria e a sua situação.
(1,0) (f) Quais são os 3 comandos de repetição do Java e para qual situação cada um deles é o
mais adequado?

=========================================================================================================

Se quiser, teste o seu programa com os seguintes dados:
categoria Aluguel base situação
g 800 1
r 700 2
c 4000 1
r 3000 1
c 2000 2
Tem que dar estas respostas:
a) 856.0 4400.0 3150.0
b) 2100.0
c) 1850.0
d) 40.0
e) 700.0 r 2
 */
package testeprovamicro;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TesteProvaMicro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scan = new Scanner(System.in);

        /*
            • categoria: r para residencial, g para galpão e c para comercial
            • aluguel base
            • situação do imóvel: 1 para alugado e 2 para disponível*/
        char categoria = 'r';
        double aluguelBase, alguguelFinal, somaSituacao;
        int situacao;

        for (int i = 0; i < 5; i++) {

// O programa deve ler a categoria, o valor do aluguel base e a situação do imóvel
            System.out.println("categoria: ");
            System.out.println(" R para residencial");
            System.out.println(" G para galpão");
            System.out.println(" C para comercial");
            System.out.println("Insira a categoria: ");
            categoria = scan.next().charAt(0);

            System.out.println("Insira o aluguel base: ");
            aluguelBase = scan.nextDouble();

            System.out.println("Situação do Imóvel: ");
            System.out.println("1 para alugado");
            System.out.println("2 para disponível");
            situacao = scan.nextInt();

            System.out.println("Categoria escolhida: " + categoria);
            System.out.println("Aluguel Base: " + aluguelBase);
            System.out.println("Situação: " + situacao);
            
            
            

        }
        /*
        categoria Porcentagem de acréscimo
        r 5%
        g 7%
        c 10%
        */
        
        if (situacao == 1 && 'r') {
          alguguelFinal = aluguelBase * 1.05;
        }

    }

}
