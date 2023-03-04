/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetorpapelariam1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class VetorPapelariam1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanFile = new Scanner(System.in);
        
        
         final int TOTAL_ALUNOS = 4;
    final int TOTAL_BIMESTRES = 4;
    final double NOTA_MINIMA = 70.0;

    Scanner input = new Scanner(System.in);
    String[] nomeAlunos = new String[TOTAL_ALUNOS];
    double[][] notaAlunos = new double[TOTAL_ALUNOS][TOTAL_BIMESTRES];
    double[] mediaAlunos = new double[TOTAL_ALUNOS];

    //Obter nome dos alunos
    for (int i = 0; i < TOTAL_ALUNOS; ++i) {
        System.out.println("Informe o nome do " + (i + 1) + "° aluno:");
        nomeAlunos[i] = input.nextLine();

        System.out.println("");

        //Obter notas dos alunos todos os bimetres
        for (int y = 0; y < TOTAL_ALUNOS; ++y) {
            for (int j = 0; j < TOTAL_BIMESTRES; ++j) {
                System.out.println("Informe a nota do aluno " + nomeAlunos[y]
                        + " para o " + (j + 1) + "° bimestre");
                notaAlunos[y][j] = input.nextDouble();
            }
        }
    }

    //calcular media alunos
    for (int i = 0; i < TOTAL_ALUNOS; ++i) {
        for (int j = 0; j < TOTAL_BIMESTRES; ++j) {
            mediaAlunos[i] += notaAlunos[i][j];
        }
        mediaAlunos[i] /= TOTAL_BIMESTRES;
    }

    //Mostrar situacao dos alunos
    System.out.println("======== RESULTADO FINAL =======");

    for (int i = 0; i < TOTAL_ALUNOS; ++i) {

        if (mediaAlunos[i] >= NOTA_MINIMA) {
            System.out.println("Nome: " + nomeAlunos[i] + " Media: " + mediaAlunos[i]
                    + " Situação: Aprovado");
            continue;
        }

        System.out.println("Nome: " + nomeAlunos[i] + " Media: " + mediaAlunos[i]
                + " Situação: Reprovado");
    }

}
        
        
    }
    

