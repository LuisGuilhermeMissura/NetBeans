/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template


Escreva um programa para controlar o estoque de uma loja com 6 produtos. Os dados do estoque
são: tipo do produto (p – perecível, l – limpeza e h – hogiene pessoal), quantidade
em estoque e preço unitário de compra. A tabela mostra o estoque atual.
Tipo qtdEstoque precoUnit
h 5 2,00q
l 40 1,00
h 9 10,00
p 60 3,00
p 0 4,00
l 50 5,00
O programa deve ler o tipo do produto, a quantidadde em estoque e o preço
unitário e realizar as seguintes tarefas:
(2,0) a) Se o estoque estiver acima 30 unidades exibir a mensagem “Estoque alto”.
Se estiver entre 10 e 30, exibir a mensagem “Estoque normal”. Se estiver abaixo
de 10 exibir a mensoagem “Estoque crítico”. Se o estoque for zero, exibir a
mensagem “Produto esgotado”.
(1,5) b) Calcular o valor total em estoque.
(1,5) c) Calcular a porcentagem de produtos com estoque crítico (não inclui
produto esgotado).
(2,0) d) Calcular o preço unitário médio do produtos do tipo p.
(2,0) e) Qual é a categoria e a quantidade em estoque do produto mais caro.
(1,0) f) Qual é a diferença entre laço de repetição definido e indefinido.

 */
package testeprovamicro2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TesteProvaMicro2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        
       // tipo do produto (p – perecível, l – limpeza e h – hogiene pessoal)
        char tipo;
        //quantidade em estoque
        int qtde;
        //preço unitário de compra
        double preco = 0;
        //Contador
        int cont;
        
        
        /*Tipo qtdEstoque precoUnit
            h   5           2,00
            l   40          1,00
            h   9           10,00
            p   60          3,00
            p   0           4,00
            l   50          5,00*/
        
        
        /*O programa deve ler o tipo do produto, a quantidadde em estoque e o preço
unitário e realizar as seguintes tarefas:*/
        
        for (int i = 0; i < 6; i++) {
         
        System.out.println("Insira o tipo do produto");
        System.out.println("tipo do produto (p – perecível, l – limpeza e h – higiene pessoal)");
        tipo = scan.next().charAt(0);
        
        System.out.println("Qual a quantidade em estoque: ");
        qtde = scan.nextInt();
        
        System.out.println("Qual o valor do produto: ");
        preco = scan.nextDouble();
        
            System.out.println(" ");
            System.out.println(" ");
        
            System.out.println("Tipo: " + tipo);
            System.out.println("Quantidade: " + qtde);
            System.out.println("Preço: " + preco);
            
            //=============================================================
            
            /*(2,0) a) Se o estoque estiver acima 30 unidades exibir a mensagem “Estoque alto”.
Se estiver entre 10 e 30, exibir a mensagem “Estoque normal”. Se estiver abaixo
de 10 exibir a mensoagem “Estoque crítico”. Se o estoque for zero, exibir a
mensagem “Produto esgotado”.
(1,5) b) Calcular o valor total em estoque.
(1,5) c) Calcular a porcentagem de produtos com estoque crítico (não inclui
produto esgotado).
(2,0) d) Calcular o preço unitário médio do produtos do tipo p.
(2,0) e) Qual é a categoria e a quantidade em estoque do produto mais caro.
(1,0) f) Qual é a diferença entre laço de repetição definido e indefinido.*/
            
            if(qtde > 30){
                System.out.println("Estoque alto!");
          
            }else if(qtde >= 10 && qtde <= 30){
                System.out.println("Estoque Normal");
            
            }else if(qtde < 10 && qtde > 0){
                System.out.println("Estoque Crítico");
                
            }else if(qtde == 0){
                System.out.println("Produto Esgotado");  
                
            }else{
            System.out.println("Valor Incorreto!");
            
            }
            
            preco = (preco * qtde);
          
            
            
            
        }
        
     
       
        
        
    }
    
}
