
package maior;

import java.util.Scanner;

public class Maior {


    public static void main(String[] args) {
      
        
         Scanner scan = new Scanner(System.in);
         
         int num;
         int maior;
         int menor;
         
         System.out.println("Digite o valor: ");
         num = scan.nextInt();
         
         maior = num;
         menor = num;
         
         
         for (int i = 0; i < 6; i++) {
             System.out.println("Digite o valor: ");
             num = scan.nextInt();
             
             if(num > maior){
             maior = num;
             }
             
             if(num < menor){
             menor = num;
             }
        }
         
         
         System.out.println("O maior é: " + maior);
         System.out.println("O menor é: " + menor);
         
    }
    
}
