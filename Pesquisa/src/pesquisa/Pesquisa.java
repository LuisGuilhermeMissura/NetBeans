package pesquisa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pesquisa {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here

        char sexo[] = new char[5];
        char olhos[] = new char[5];
        char cabelos[] = new char[5];
        int idade[] = new int[5];

        //há apenas uma maneira de chamar o método void
        leDados(sexo, olhos, cabelos, idade);

        System.out.printf("%8s %8s %8s %8s\n", "sexo", "olhos", "cabelos", "idade");

        for (int i = 0; i < sexo.length; i++) {
            System.out.printf("%8c %8c %8c %8d\n", sexo[i],
                    olhos[i],
                    cabelos[i],
                    idade[i]);
        }
        double resp = calcMedia(olhos, cabelos, idade);
        if (resp > 0) {
            System.out.println("Média: " + resp);
        } else {
            System.out.println("Não há ninguém");
        }

        if (calcMedia(olhos, cabelos, idade) > 0) {
            System.out.println("Média: " + calcMedia(olhos, cabelos, idade));
        } else {
            System.out.println("Não há ninguém");
        }
        //chamada de método não void
        System.out.println("Média: " + calcMedia(olhos, cabelos, idade));

        System.out.println("Maior: " + calcMaior(idade));

        System.out.println("QTD: " + qtd(sexo, olhos, cabelos, idade));

    }

    public static int qtd(char se[], char ol[], char ca[], int id[]) {

        int cont = 0;
        for (int i = 0; i < se.length; i++) {
            if (se[i] == 'f' && id[i] > 18 && id[i] <= 35 && ol[i] == 'a' && ca[i] == 'l') {
                cont++;
            }
        }
        return cont;
    }

    public static int calcMaior(int id[]) {

        int maior = id[0];

        for (int i = 0; i < id.length; i++) {
            if (id[i] > maior) {
                maior = id[i];
            }

        }
        return maior;
    }

    public static double calcMedia(char ol[], char ca[], int id[]) {

        int soma = 0, cont = 0;

        for (int i = 0; i < ol.length; i++) {
            if (ca[i] == 'p' && ol[i] == 'c') {
                soma += id[i];// soma + soma + id[i]
                cont++;// cont = cont +1

            }
        }
        if (soma == 0) {
            return 0;
        } else {
            return soma / cont;
        }
    }

    public static void leDados(char se[], char ol[], char ca[], int id[]) throws FileNotFoundException {

        File arq = new File("dados.txt");
        Scanner scan = new Scanner(arq);

        for (int i = 0; i < se.length; i++) {
            se[i] = scan.next().charAt(0);
            ol[i] = scan.next().charAt(0);
            ca[i] = scan.next().charAt(0);
            id[i] = scan.nextInt();

        }

        //  Scanner scan = new Scanner(System.in);
//        System.out.println("Digite os dados");
//
//        for (int i = 0; i < se.length; i++) {
//            System.out.print("Sexo: ");
//            se[i] = scan.next().charAt(0);
//
//            System.out.print("Olhos: ");
//            ol[i] = scan.next().charAt(0);
//
//            System.out.print("Cabelos: ");
//            ca[i] = scan.next().charAt(0);
//
//            System.out.print("Idade: ");
//            id[i] = scan.next().charAt(0);
//            
//            System.out.println(" ");
//        }
    }

}
