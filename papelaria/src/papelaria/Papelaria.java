package papelaria;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Papelaria {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {

        int cod[] = new int[6];
        String desc[] = new String[6];
        int estoque[] = new int[6];
        double precoUnit[] = new double[6];

        int opcao;

        lerDados(cod, desc, estoque, precoUnit);

        do {
            System.out.println("\nMenu\n"
                    + "1 – Menor estoque\n"
                    + "2 – Alterar preço\n"
                    + "3 – Venda\n"
                    + "4 – Sair");

            System.out.println("Digite a opção");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    calcMenor(desc, estoque, precoUnit);
                    break;

                case 2:
                    reajustarPreco(cod, desc, precoUnit);
                    break;
                    
                case 3:
                    System.out.println("\nVENDA");
                    System.out.println("Digite o código");
                    int codDig = scan.nextInt();
                    
                    System.out.println(vender(codDig, cod, estoque, precoUnit));
                    break;
                    
                case 4:
                    System.out.println("Encerrar");
                    break;
                default:
                    System.out.println("Valor Inválido");
                    break;
            }

            break;

        } while (opcao != 4);
    }

    public static void lerDados(int cod[], String desc[], int estoque[], double preco[])
            throws FileNotFoundException {

        File arq = new File("dados.txt");
        Scanner scan = new Scanner(arq);

        System.out.printf("%10s %10s %10s %10s\n", scan.next(), scan.next(), scan.next(), scan.next());

        for (int i = 0; i < cod.length; i++) {
            cod[i] = scan.nextInt();
            desc[i] = scan.next();
            estoque[i] = scan.nextInt();
            preco[i] = scan.nextDouble();

            System.out.printf("%10d %10s %10d %10.2f\n", cod[i], desc[i], estoque[i], preco[i]);
        }

    }

    public static void calcMenor(String desc[], int estoque[], double preco[]) {

        int menor = estoque[0];

        for (int i = 0; i < 6; i++) {

            if (estoque[i] < menor) {
                menor = estoque[i];
            }

        }

        System.out.println("\nMenor estoque");
        for (int i = 0; i < 6; i++) {

            if (estoque[i] == menor) {

                System.out.println("Descrição: " + desc[i]);
                System.out.println("Estoque: " + estoque[i]);
                System.out.println("Preço unitário: " + preco[i]);
            }

        }

    }

    public static void reajustarPreco(int cod[], String desc[], double preco[]) {

        int codDig, tipoReajuste;
        double perc;
        int achou = 0;

        System.out.println("Digite o código: ");
        codDig = scan.nextInt();

        for (int i = 0; i < 6; i++) {
            if (codDig == cod[i]) {
                achou = 1;
                System.out.println("DIgite a porcentagem");
                perc = scan.nextDouble();
                System.out.println("Digite 1 para aumentar ou 2 para diminuir");
                tipoReajuste = scan.nextInt();

                if (tipoReajuste == 1) {

                    preco[i] = preco[i] + preco[i] * perc / 100;
                } else {
                    preco[i] -= preco[i] * perc / 100;
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

    public static String vender(int codDig, int cod[], int estoque[], double preco[]) {

        double valor;
        String mensagem = "";
        boolean achou = false;
        int qtd;

        for (int i = 0; i < 6; i++) {

            if (codDig == cod[i]) {

                achou = true;
                System.out.println("Digite a quantidade");
                qtd = scan.nextInt();
                if (qtd <= estoque[i]) {
                    valor = preco[i] * qtd;
                    mensagem = "Valor da compra: " + valor;
                    mensagem = String.format("Valor da compra: R$ %.2f\n" + valor);
                } else {

                    mensagem = "estoque insuficiente";
                }

            }

        }
        
        if(!achou){ // ! é o operador de NÂO : if não achou
        
            mensagem = "Código inexistente";
            
        }
return mensagem;
        
    }
    
}
