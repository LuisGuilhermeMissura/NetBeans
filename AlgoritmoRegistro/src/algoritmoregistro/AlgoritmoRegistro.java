/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
 /*
Faça um programa que controle as entradas e saídas de produtos (total de 10). Este programa deverá controlar
os dados do produto e da movimentação do mesmo. Os dados do produto são: Código do produto, Descrição do Produto,
Categoria do produto(limpeza, lataria,...), Preço Unitário, Qtde em estoque. O programa deverá realizar as seguintes operações:
1) cadastrar produtos (um de cada vez)
2) consultar produto por categoria (mostrando todos os dados do produto)
3) Entrada e Saída no estoque (retirar e adicionar produtos), atualizando os dados no vetor
4) Sair
OBS:
	O código do produto não pode ser repetido no cadastro
	Nas consultas se não encontrar o código do produto mostrar uma mensagem “Produto não encontrado” 
	Idem para a opção 3 ( verificar o código do produto)
 */
package algoritmoregistro;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class AlgoritmoRegistro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);

        int op;
        int escolha;
//        int cod[] = new int[10];
//         String descricao[] = new String[10];
//          String categoria[] = new String[10];
//           double preco[] = new double[10];
//            int qtde[] = new int[10];

        int cod[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String descricao[] = {"detergente", "manteiga", "açúcar", "vinho", "cerveja", "carne", "FolhaSulfite", "pilha", "tapete", "vassoura"};
        String categoria[] = {"limpeza", "comida", "comida", "bebida", "bebida", "comida", "outros", "outros", "outros", "limpeza"};
        double preco[] = {10.1, 10.2, 10.3, 10.4, 10.5, 10.6, 10.7, 10.8, 10.9, 10.10};
        int qtde[] = {4, 8, 12, 60, 32, 20, 1, 40, 10, 9};


        /*
            1) cadastrar produtos (um de cada vez)
2) consultar produto por categoria (mostrando todos os dados do produto)
3) Entrada e Saída no estoque (retirar e adicionar produtos), atualizando os dados no vetor
4) Sair

         */
        do {
            System.out.println("Menu\n"
                    + "1 – Cadastrar produtos\n"
                    + "2 – Consultar produto por categoria\n"
                    + "3 – Realizar Entrada e Saída no Estoque\n"
                    + "4 - Sair");

            System.out.println("Digite a opção");
            op = scan.nextInt();

            switch (op) {
                case 1:
                    /*
                     int cod[] = new int[10];
//         int descricao[] = new int[10];
//          int categoria[] = new int[10];
//           int preco[] = new int[10];
//            int qtde[] = new int[10];
                     */

                    System.out.println("Cadastrar produtos");
                    System.out.println(" --- ");
                    for (int i = 0; i < 1; i++) {

                        System.out.println("Insira o código:");
                        cod[i] = scan.nextInt();

                        System.out.println("Insira a descrição");
                        descricao[i] = scan.next();

                        System.out.println("Insira a categoria");
                        categoria[i] = scan.next();

                        System.out.println("Insira o Preço");
                        preco[i] = scan.nextDouble();

                        System.out.println("Insira a Quantidade");
                        qtde[i] = scan.nextInt();

                    }
                    break;

                case 2:

                    /*
                    
                    Exemplo tamanho de array
                    public class Main {
   public static void main(String[] args) {
           int contador = 0;
           String[] carros = {"Fusca", "Kombi", "Gol", "Ferrari"};
               for (String i : carros) {
                       contador = ++contador;
}
       System.out.println(contador);
               }
    
}
                    
                     */
                    System.out.println("Consultar");
                    System.out.println(" --- ");

                    System.out.println("Digite a categoria que deseja consultar: ");
                    System.out.println("bebida | comida | outros | limpeza");
                    escolha = scan.nextInt();

                    for (int i = 0; i < 1; i++) {

                        if (escolha == categoria[i]) {
                            System.out.println(" ");
                        }

                        Se(cat_pesquisada = produto[X].categoria) entao Inicio
                    Escreva "Categoria do Produto =", produto[X].categoria
                    Escreva "Código do Produto =", produto[X].cod
                    Escreva "Descrição do Produto =", produto[X].descricao
                    Escreva "Preço do Produto =", produto[X].preco
                    Escreva "Estoque do Produto =", produto[X].estoque
                    achou<
                        -- 1
Fim Fim
                        Se(achou = 0) entao Escreva 
                    "Produto não Encontrado"
                    
                    
                    }
                        
                        
                        

//                    if(escolha == 1){
//                        System.out.println("Produtos com categoria de Bebida");
//                        for (int i = 0; i < 10; i++) {
//                        System.out.println("Código: " + cod[i] + "\nDescrição: " + descricao[i] +
//                                "\nCategoria: " + categoria[i] + "\nPreço: " + preco[i] + "\nQuantidade: " + qtde[i]);
//                        }
//                    }else if(escolha == 2){
//                        for (int i = 0; i < 10; i++) {
//                        System.out.println("Código: " + cod[i] + "\nDescrição: " + descricao[i] +
//                                "\nCategoria: " + categoria[i] + "\nPreço: " + preco[i] + "\nQuantidade: " + qtde[i]);
//                        
//                        }
//                         System.out.println(Arrays.toString(descricao));
//                         
//                         Arrays.stream(descricao).forEach(System.out::println); 
//                        
//                    }else{
//                        System.out.println("Errado");
//                    }
//                    
                    
                    
                    
                    
                    break;
                case 3:
                    System.out.println("Realizar Entrada e Saída no Estoque");
                    break;
                case 4:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (op != 4);

    }

}
