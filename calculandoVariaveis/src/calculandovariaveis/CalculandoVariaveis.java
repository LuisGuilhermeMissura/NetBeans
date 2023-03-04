/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculandovariaveis;

import java.util.Scanner;

/**
 *
 * @author guibm
 */
public class CalculandoVariaveis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        
        
     //item 2
//sout((8*4+9*5+10)/(4.0+5+1));


double p1, p2, ac; // em algoritmos p1, p2, ac: real
double media;

        System.out.println("Digite as notas: ");
        System.out.println("P1: ");
        p1 = leia.nextDouble();
        
        System.out.println("P2: ");
        p2 = leia.nextDouble();
        
        System.out.println("AC: ");
        ac = leia.nextDouble();
        
        

media = (p1*4+p2*5+ac) / (4 + 5 + 1);

System.out.println("Média: " + media);
        
        
        
    }
    
}
