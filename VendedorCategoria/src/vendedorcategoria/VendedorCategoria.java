/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vendedorcategoria;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author Usuario
 */
public class VendedorCategoria {

    public static Scanner scan = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        /*nome categoria salarioBase vendas*/
        //declara vetores
        String nome[] = new String[9];
        char categoria[] = new char[9];
        double salBase[] = new double[9];
        double vendas[] = new double[9];

        int op;

        char cat;

        boolean achouCat = false;

        boolean achouVendedor = false;

        double meta;

        lerDados(nome, categoria, salBase, vendas);

        do {
            System.out.println("Menu\n"
                    + "1 – Salários\n"
                    + "2 – Meta\n"
                    + "3 – Sair");

            System.out.println("Digite a opção");
            op = scan.nextInt();

            switch (op) {
                case 1:
                    System.out.println("\nFolha de pagamento");
                    for (int i = 0; i < 9; i++) {
                        System.out.println(nome[i] + " " + calcSal(categoria[i], salBase[i], vendas[i]));
                    }
                    break;

                case 2:
                    System.out.println("Digite a categoria");
                    cat = scan.next().charAt(0);

                    for (int i = 0; i < 9; i++) {
                        if (cat == categoria[i]) {

                            achouCat = true;

                            if (cat != 'g') {
                                achouVendedor = true;
                            }
                        }

                    }

                    if (!achouCat) {
                        System.out.println("Categoria inexistente");
                    } else if (!achouVendedor) {
                        System.out.println("Gerente");

                    } else {

                        System.out.println("Digite a meta");
                        meta = scan.nextDouble();
                        listarMeta(nome, vendas, categoria, cat, meta);

                    }
                    break;
                case 3:
                    System.out.println("Encerrando");
                    break;
                default:
                    System.out.println("opção inválida");
                    break;
            }

        } while (op != 3);

    }

    public static void listarMeta(String nome[], double vendas[], char categoria[], char cat, double meta) {

        boolean achouMeta = false;

        for (int i = 0; i < 9; i++) {

            if (vendas[i] >= meta && categoria[i] == cat){     //!= 'g') {
                achouMeta = true;
                System.out.println(nome[i]);
            }

        }

        if (!achouMeta) {
            System.out.println("Meta não atingida");

        }
    }

    public static double calcSal(char categoria, double salBase, double vendas) {

        if (categoria == 'g') {
            return salBase;
        } else if (categoria == 'e') {
            return salBase + vendas * 0.07;
        } else {
            return salBase + vendas * 0.05;
        }

    }

    public static void lerDados(String nome[], char categoria[], double salBase[], double vendas[]) throws FileNotFoundException {

        File arq = new File("dados.txt");
        Scanner scanFile = new Scanner(arq);

        System.out.printf("%10s %10s %10s %10s\n", scanFile.next(), scanFile.next(), scanFile.next(), scanFile.next());

        for (int i = 0; i < 9; i++) {

            nome[i] = scanFile.next();
            categoria[i] = scanFile.next().charAt(0);
            salBase[i] = scanFile.nextDouble();
            vendas[i] = scanFile.nextDouble();

            System.out.printf("%10s %10c %10.2f %10.2f\n", nome[i], categoria[i], salBase[i], vendas[i]);

        }

    }

}
