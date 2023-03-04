/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template


 */

 /*ALUNO: Luís Guilherme Butura Missura
Linguagem de Programação - CST em Análise e Desenvolvimento de Sistemas
Professora: Sandra Cristina Costa Prado
Primeira prova 17/05/2022
Escreva um programa para controlar o estoque de uma loja. Os dados do estoque são: código do produto, descrição
do produto, quantidade em estoque, preço unitário de compra. A tabela abaixo mostra o estoque atual.
System.out.printf("%14s %14s %14s %14s %14s %14s\n","codPro", "descricao", "qtdEstoque", "estoqueMinimo", "precoCompra", "precoVenda");
codPro descricao qtdEstoque estoqueMinimo precoCompra precoVenda
110 caneta 40 20 2,00 4,00
112 lapis 50 20 1,00 2,00
113 caderno 9 10 10,00 20,00
114 regua 20 5 4,00 8,00
115 apontador 35 8 5,00 10,00
116 borracha 10 15 3,00 6,00
O aplicativo deve conter métodos para:
1) Ler os dados em arquivo de texto. O arquivo de texto não deve conter o cabeçalho. Este método deve armazenar os
dados lidos em vetores recebidos do método main. 1,0
2) Receber os vetores com os dados do estoque e exibi-los, conforme a tabela, inclusive o cabeçalho. 1,0
3) Receber os vetores com os dados do estoque, exibir a mensagem “\n****** Estoque Crítico ******\n” e exibir
todos os dados dos produtos com estoque abaixo da quantidade mínima. 1,0
4) Atualizar preços de venda de produtos com estoque alto. Este método exibe a descrição e o preço de venda dos
produtos com estoque 3 vezes maior do que o estoque mínimo, abaixa o preço de venda em 10% e exibe o novo preço
de venda. Conclui retornando a mensagem “Promoção efetuada”. 1,0
5) Dar entrada de um produto adquirido pela loja. Este método deve receber o código do produto adquirido, o vetor
de códigos, o preço unitário de compra, o vetor de preços de compra, o vetor de preços de venda, a quantidade
adquirida e o vetor de quantidades em estoque. Este método deve procurar o código do produto adquirido e atualizar
a quantidade em estoque, o preço unitário de compra e o preço unitário de venda. O preço de venda deve ser o dobro
do preço de compra. Conclui retornando a mensagem “Estoque atualizado”. 1,0
No método main realize as seguintes tarefas:
6) Crie os vetores para armazenar os dados e invoque o método para ler e armazenar os dados. 1,0
7) Crie o seguinte menu de opções: 0,5
Menu
1 - Exibir estoque
2 - Estoque crítico
3 - Atualização de promoção
4 - Compra
5 - Sair
Na opção 1, exiba o estoque, conforme a tabela. 0,5
Na opção 2, exiba os produtos com quantidades abaixo da mínima. 0,5
Na opção 3, atualize os preços de venda de produtos com estoque alto. 0,5
Na opção 4, solicite que o usuário digite o código do produto, a quantidade comprada e o preço unitário de compra e
chame o método que dá entrada no estoque. 0,5
Na opção 5, exiba a mensagem “Encerrar”. 0,5
8)Qual é a diferença na forma de chamar um método void e um não void? 1,0*/
// Não é a linguagem de programação que define o programador, mas sim sua lógica...
// ...é mais que visível que eu não tenho...
//Algo poderoso que aprendi enquanto programador e que devemos aplicar na realidade é: ERRAR RÁPIDO!
package luisguilhermemissurap1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class LuisGuilhermeMissuraP1 {

    public static Scanner scan = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here

        int[] codPro = new int[6];
        int[] estoqueMinimo = new int[6];
        int[] qtdEstoque = new int[6];
        char[] descricao = new char[6];
        double[] precoCompra = new double[6];
        double[] precoVenda = new double[6];

        int qtdComp;
        int codDigit;
        
        
        String desc;
        double preco;

        // int num;
        int op;

        /*Receber os vetores com os dados do estoque e exibi-los, conforme a tabela, inclusive o cabeçalho. */
 /*Escreva um programa para controlar o estoque de uma loja. Os dados do estoque são: código do produto, descrição
do produto, quantidade em estoque, preço unitário de compra. A tabela abaixo mostra o estoque atual.*/
        System.out.printf("%14s %14s %14s %14s %14s %14s\n", "codPro", "estoqueMinimo", "qtdEstoque", "descricao", "precoCompra", "precoVenda");

        /*Ler os dados em arquivo de texto. O arquivo de texto não deve conter o cabeçalho. Este método deve armazenar os
dados lidos em vetores recebidos do método main. */
        
        
        
        lerDados(codPro, estoqueMinimo, qtdEstoque, descricao, precoCompra, precoVenda);
        
        
        
        do {
            System.out.println("Menu: \n"
                    + "1 – Exibir Estoque\n"
                    + "2 – Estoque Crítico\n"
                    + "3 – Atualização de promoção\n"
                    + "4 – Compra\n"
                    + "5 – Sair\n");

            System.out.println("Digite a opção desejada: ");
            op = scan.nextInt();

            switch (op) {
                case 1:
                    System.out.println("\n1 – Exibir Estoque");
                    System.out.println("----");
                    for (int i = 0; i < 6; i++) {
                        System.out.println(codPro[i] + (estoqueMinimo[i] + qtdEstoque[i] + descricao[i] + precoCompra[i] + precoVenda[i]));
                    }

                    break;

                case 2:
                    System.out.println("2 – Estoque Crítico");
                    System.out.println("----");
                    for (int i = 0; i < 6; i++) {

                        if (qtdEstoque[i] < estoqueMinimo[i]) {
                            System.out.println("Estoque Crítico" + codPro[i] + estoqueMinimo[i] + qtdEstoque[i] + descricao[i] + precoCompra[i] + precoVenda[i]);
                        }
                        // System.out.println(codPro[i] + (estoqueMinimo[i] + qtdEstoque[i] + descricao[i] + precoCompra[i] + precoVenda[i]));
                    }

                    break;
                    
                    /*) Dar entrada de um produto adquirido pela loja. Este método deve receber o código do produto adquirido, o vetor
de códigos, o preço unitário de compra, o vetor de preços de compra, o vetor de preços de venda, a quantidade
adquirida e o vetor de quantidades em estoque. Este método deve procurar o código do produto adquirido e atualizar
a quantidade em estoque, o preço unitário de compra e o preço unitário de venda. O preço de venda deve ser o dobro
do preço de compra. Conclui retornando a mensagem “Estoque atualizado”. */
                    
                case 3:
                    System.out.println("3 – Atualização de promoção");
                    System.out.println("----");

                    System.out.println("Desconto por estoque alto: ");
                    System.out.println("Qual o produto?");
                    codPro[] = scan.nextInt();

                    if (qtdEstoque[] > estoqueMinimo[i] * 3) {

                        qtdEstoque[] = qtdEstoque[i] - 0,03;
                        System.out.println("Preço Novo: " + qtdEstoque[i] + codPro);
                        System.out.println("Estoque Atualizado!");

                    }

                    break;
                case 4:
                    System.out.println("4 – Compra");
                    System.out.println("----");

                    /*, solicite que o usuário digite o código do produto, a quantidade comprada e o preço unitário de compra e
chame o método que dá entrada no estoque. */
                    System.out.println("Qual o código do produto?");
                    codDigit = scan.nextInt();

                    System.out.println("Qual a quantidade comprada?");
                    qtdComp = scan.nextInt();

                    System.out.println("Qual o preço unitário?");
                    precoCompra[] = scan.nextDouble();

                    if (codDigit == codPro[]) {

                        System.out.println("Compra do produto: ", codPro[i] + (estoqueMinimo[i] + qtdEstoque[i] + descricao[i] + precoCompra[i] + precoVenda[i]);
                    }
                    break;
                case 5:
                    System.out.println("5 – Sair");
                    System.out.println("Encerrar");
                    System.out.println("----");
                    break;
                default:
                    System.out.println("opção inválida");
                    break;
            }

        } while (op != 5);

    }

    /* Ler os dados em arquivo de texto. O arquivo de texto não deve conter o cabeçalho. Este método deve armazenar os
dados lidos em vetores recebidos do método main.
 Receber os vetores com os dados do estoque e exibi-los, conforme a tabela, inclusive o cabeçalho*/
    public static void lerDados(int codPro[], int qtdEstoque[], int estoqueMinimo[], char descricao[], double precoCompra[], double precoVenda[]) throws FileNotFoundException {

        File arq = new File("dados.txt");
        Scanner scanFile = new Scanner(arq);

        System.out.printf("%10s %10s %10s %10s %10s %10s\n", scanFile.next(), scanFile.next(), scanFile.next(), scanFile.next(), scanFile.next(), scanFile.next());

        for (int i = 0; i < 6; i++) {

            codPro[i] = scanFile.nextInt();
            qtdEstoque[i] = scanFile.nextInt();
            estoqueMinimo[i] = scanFile.nextInt();
            descricao[i] = scanFile.next().charAt(0);
            precoCompra[i] = scanFile.nextDouble();
            precoVenda[i] = scanFile.nextDouble();

            System.out.printf("%10d %10d %10d %10c %10.2f %10.2f\n", codPro[i], qtdEstoque[i], estoqueMinimo[i], descricao[i], precoCompra[i], precoVenda[i]);
//%10s -> s é string
        }

    }
    
    
     public static void reajustarPreco(int codPro[], String desc[], double preco[]) {

        int codPro, tipoReajuste;
        double perc = 0,01;
        int achou = 0;

        System.out.println("Digite o código: ");
        codPro = scan.nextInt();

        for (int i = 0; i < 6; i++) {
            int[] cod = null;
            if (codPro == cod[i]) {
                achou = 1;
               
              

              
                }
                System.out.println("\nNovo Preço");
                System.out.println("Descrição: " + desc[i]);
                System.out.println("Novo preço: " + preco[i]);
            }
        }

        if (achou == 0) {
            System.out.println("Código inexistente");
        }

    }
    
    
    
    


