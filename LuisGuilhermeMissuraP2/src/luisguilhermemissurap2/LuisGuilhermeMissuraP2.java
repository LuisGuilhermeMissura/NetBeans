/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package luisguilhermemissurap2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class LuisGuilhermeMissuraP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner scan = new Scanner(System.in);
        
        String[] nome = {"Rui", "Ivo", "Iumi", "Nei", "Susi", "Alan", "Ian", "Bia", "Gil"};
        int [] anoContrato = {2020, 2020, 2022, 2000, 2000, 2022, 2019, 2021, 2010};
        double [] salarioBase =  {1500.00, 2500.00, 3500.00, 3000.00, 1000.00, 800.00, 4000.00, 950.00, 2000.00};
        double somador[] = new double[9];
        double Varauxiliar = 0;
        String func;
        
       
        
        double max = salarioBase[0];
                   
        
         for (int i = 0; i < 9; i++) {
            System.out.println(nome[i] + " " + anoContrato[i] + " " + salarioBase[i] + " ");
        }
        
        System.out.println(" ");
         
         System.out.println("Salário base antes de 2020");
         for (int i = 0; i < 9; i++) {
             
            if(anoContrato[i] < 2020){
                
                int cont = 0;
                cont++;
//                somador = anoContrato[i];
//                
//                somador = Varauxiliar + somador;
                
                
                System.out.println(" ");
                
                System.out.println("Nome: " + nome[i]);
                System.out.println("Ano do contrato: " + anoContrato[i]);
                System.out.println("Salário Base: " + salarioBase[i]);
                
                System.out.println(" ");
                
                
//                somador[i] += salarioBase[i];

//                
//              
//                
//       
//  int soma = 0;
//        double media;
//        
//        soma = (int) (soma + salarioBase[i]);
//            media = soma / 4.0;
//               System.out.println("Média salário antes 2020: " + media);  
         
         }
         }
         
                 
      for (int m = 1; m < salarioBase.length; m++) {
          
          int max2;
                   String max3;  
                   
         if (salarioBase[m] > max) 
        	 max = salarioBase[m];
         max2 = anoContrato[m];
         max3 = nome[m];
         
         
         
      
         System.out.println("O maior salário é " + max);
               
          System.out.println("Ano contratado" + max2);
          System.out.println("nome" + max3);
      }
          
          System.out.println("---------------------");
          
          
        
        System.out.println("Insira um Funcionário: ");
        
            func = scan.next();
            int op;
            
            switch (func){
            
                case "Rui":
                    for (int i = 0; i < 1; i++) {
                        System.out.println("Ano contratado: " + anoContrato[0]);
                        System.out.println("Salario base: " + salarioBase[0]);
                        
                        System.out.println("Deseja Aumentar o salário? ");
                        op = scan.nextInt();
                        
                        if (op == 1) {
                            if (anoContrato[0] >= 2022) {
                                System.out.println("Novo salário: " + salarioBase[0]);}
                                else if (anoContrato[0] == 2022 && anoContrato[0] < 2021){
                                    
                                    System.out.println("Sem Ajuste");
                                    
                                }else if (anoContrato[0] < 2022 && anoContrato[0] >= 2021){
                                        salarioBase[0] += 0.05;
                                        
                                        System.out.println("Novo salário: " + salarioBase[0]);
                                        System.out.println("Nome " + nome[0]);
                                        
                                }else if(anoContrato[0] < 2022 &&  anoContrato[0] >= 2019){
                                                
                                                salarioBase[0] += 0.07;
                                        
                                        System.out.println("Novo salário: " + salarioBase[0]);
                                        System.out.println("Nome " + nome[0]); 
                                                
                                                
                                }else if(anoContrato[0] < 2022 && anoContrato[0] > 1600){
                                     salarioBase[0] += 0.10;
                                        
                                        System.out.println("Novo salário: " + salarioBase[0]);
                                        System.out.println("Nome " + nome[0]); 
                                    
                                    
                                    
                                    
                                }}else{
                                System.out.println("Não será Ajustado");
                            }
                        
                        
                    }
                    
                    break;
                    
                    
                    
                     case "Ivo":
                    for (int i = 0; i < 1; i++) {
                        System.out.println("Ano contratado: " + anoContrato[1]);
                        System.out.println("Salario base: " + salarioBase[1]);
                        
                        System.out.println("Deseja Aumentar o salário? ");
                        op = scan.nextInt();
                        
                        if (op == 1) {
                            if (anoContrato[1] >= 2022) {
                                System.out.println("Novo salário: " + salarioBase[1]);}
                                else if (anoContrato[1] == 2022 && anoContrato[1] < 2021){
                                    
                                    System.out.println("Sem Ajuste");
                                    
                                }else if (anoContrato[1] < 2022 && anoContrato[1] >= 2021){
                                        salarioBase[1] += 0.05;
                                        
                                        System.out.println("Novo salário: " + salarioBase[1]);
                                        System.out.println("Nome " + nome[0]);
                                        
                                }else if(anoContrato[1] < 2022 &&  anoContrato[1] >= 2019){
                                                
                                                salarioBase[1] += 0.07;
                                        
                                        System.out.println("Novo salário: " + salarioBase[1]);
                                        System.out.println("Nome " + nome[1]); 
                                                
                                                
                                }else if(anoContrato[1] < 2022 && anoContrato[1] > 1600){
                                     salarioBase[1] += 0.10;
                                        
                                        System.out.println("Novo salário: " + salarioBase[1]);
                                        System.out.println("Nome " + nome[1]); 
                                    
                                    
                                    
                                    
                                }}else{
                                System.out.println("Não será Ajustado");
                            }
                        
                        
                    }
                    
                    break;
                
                
                    
                    
                    
                    
                    
                     case "Iumi":
                    for (int i = 0; i < 1; i++) {
                        System.out.println("Ano contratado: " + anoContrato[2]);
                        System.out.println("Salario base: " + salarioBase[2]);
                        
                        System.out.println("Deseja Aumentar o salário? ");
                        op = scan.nextInt();
                        
                        if (op == 1) {
                            if (anoContrato[0] >= 2022) {
                                System.out.println("Novo salário: " + salarioBase[0]);}
                                else if (anoContrato[2] == 2022 && anoContrato[2] < 2021){
                                    
                                    System.out.println("Sem Ajuste");
                                    
                                }else if (anoContrato[2] < 2022 && anoContrato[2] >= 2021){
                                        salarioBase[2] += 0.05;
                                        
                                        System.out.println("Novo salário: " + salarioBase[2]);
                                        System.out.println("Nome " + nome[2]);
                                        
                                }else if(anoContrato[2] < 2022 &&  anoContrato[2] >= 2019){
                                                
                                                salarioBase[2] += 0.07;
                                        
                                        System.out.println("Novo salário: " + salarioBase[2]);
                                        System.out.println("Nome " + nome[2]); 
                                                
                                                
                                }else if(anoContrato[0] < 2022 && anoContrato[0] > 1600){
                                     salarioBase[2] += 0.10;
                                        
                                        System.out.println("Novo salário: " + salarioBase[2]);
                                        System.out.println("Nome " + nome[2]); 
                                    
                                    
                                    
                                    
                                }}else{
                                System.out.println("Não será Ajustado");
                            }
                        
                        
                    }
                    
                    break;
                    
                    
                    
                    
                    
                    
                     case "Nei":
                    for (int i = 0; i < 1; i++) {
                        System.out.println("Ano contratado: " + anoContrato[3]);
                        System.out.println("Salario base: " + salarioBase[3]);
                        
                        System.out.println("Deseja Aumentar o salário? ");
                        op = scan.nextInt();
                        
                        if (op == 1) {
                            if (anoContrato[0] >= 2022) {
                                System.out.println("Novo salário: " + salarioBase[3]);}
                                else if (anoContrato[3] == 2022 && anoContrato[3] < 2021){
                                    
                                    System.out.println("Sem Ajuste");
                                    
                                }else if (anoContrato[3] < 2022 && anoContrato[3] >= 2021){
                                        salarioBase[3] += 0.05;
                                        
                                        System.out.println("Novo salário: " + salarioBase[3]);
                                        System.out.println("Nome " + nome[3]);
                                        
                                }else if(anoContrato[3] < 2022 &&  anoContrato[3] >= 2019){
                                                
                                                salarioBase[3] += 0.07;
                                        
                                        System.out.println("Novo salário: " + salarioBase[3]);
                                        System.out.println("Nome " + nome[3]); 
                                                
                                                
                                }else if(anoContrato[3] < 2022 && anoContrato[3] > 1600){
                                     salarioBase[3] += 0.10;
                                        
                                        System.out.println("Novo salário: " + salarioBase[3]);
                                        System.out.println("Nome " + nome[3]); 
                                    
                                    
                                    
                                    
                                }}else{
                                System.out.println("Não será Ajustado");
                            }
                        
                        
                    }
                    
                    break;
                    
                    
                    
                    
                     case "Susi":
                    for (int i = 0; i < 1; i++) {
                        System.out.println("Ano contratado: " + anoContrato[4]);
                        System.out.println("Salario base: " + salarioBase[4]);
                        
                        System.out.println("Deseja Aumentar o salário? ");
                        op = scan.nextInt();
                        
                        if (op == 1) {
                            if (anoContrato[4] >= 2022) {
                                System.out.println("Novo salário: " + salarioBase[4]);}
                                else if (anoContrato[4] == 2022 && anoContrato[4] < 2021){
                                    
                                    System.out.println("Sem Ajuste");
                                    
                                }else if (anoContrato[4] < 2022 && anoContrato[4] >= 2021){
                                        salarioBase[4] += 0.05;
                                        
                                        System.out.println("Novo salário: " + salarioBase[4]);
                                        System.out.println("Nome " + nome[4]);
                                        
                                }else if(anoContrato[4] < 2022 &&  anoContrato[4] >= 2019){
                                                
                                                salarioBase[4] += 0.07;
                                        
                                        System.out.println("Novo salário: " + salarioBase[4]);
                                        System.out.println("Nome " + nome[4]); 
                                                
                                                
                                }else if(anoContrato[4] < 2022 && anoContrato[4] > 1600){
                                     salarioBase[4] += 0.10;
                                        
                                        System.out.println("Novo salário: " + salarioBase[4]);
                                        System.out.println("Nome " + nome[4]); 
                                    
                                    
                                    
                                    
                                }}else{
                                System.out.println("Não será Ajustado");
                            }
                        
                        
                    }
                    
                    break;
                    
                    
                    
                     case "Alan":
                    for (int i = 0; i < 1; i++) {
                        System.out.println("Ano contratado: " + anoContrato[5]);
                        System.out.println("Salario base: " + salarioBase[5]);
                        
                        System.out.println("Deseja Aumentar o salário? ");
                        op = scan.nextInt();
                        
                        if (op == 1) {
                            if (anoContrato[5] >= 2022) {
                                System.out.println("Novo salário: " + salarioBase[5]);}
                                else if (anoContrato[5] == 2022 && anoContrato[5] < 2021){
                                    
                                    System.out.println("Sem Ajuste");
                                    
                                }else if (anoContrato[5] < 2022 && anoContrato[5] >= 2021){
                                        salarioBase[5] += 0.05;
                                        
                                        System.out.println("Novo salário: " + salarioBase[5]);
                                        System.out.println("Nome " + nome[5]);
                                        
                                }else if(anoContrato[5] < 2022 &&  anoContrato[5] >= 2019){
                                                
                                                salarioBase[5] += 0.07;
                                        
                                        System.out.println("Novo salário: " + salarioBase[5]);
                                        System.out.println("Nome " + nome[5]); 
                                                
                                                
                                }else if(anoContrato[5] < 2022 && anoContrato[5] > 1600){
                                     salarioBase[5] += 0.10;
                                        
                                        System.out.println("Novo salário: " + salarioBase[5]);
                                        System.out.println("Nome " + nome[5]); 
                                    
                                    
                                    
                                    
                                }}else{
                                System.out.println("Não será Ajustado");
                            }
                        
                        
                    }
                    
                    break;
                    
                    
                     case "Ian":
                    for (int i = 0; i < 1; i++) {
                        System.out.println("Ano contratado: " + anoContrato[6]);
                        System.out.println("Salario base: " + salarioBase[6]);
                        
                        System.out.println("Deseja Aumentar o salário? ");
                        op = scan.nextInt();
                        
                        if (op == 1) {
                            if (anoContrato[6] >= 2022) {
                                System.out.println("Novo salário: " + salarioBase[6]);}
                                else if (anoContrato[6] == 2022 && anoContrato[6] < 2021){
                                    
                                    System.out.println("Sem Ajuste");
                                    
                                }else if (anoContrato[6] < 2022 && anoContrato[6] >= 2021){
                                        salarioBase[6] += 0.05;
                                        
                                        System.out.println("Novo salário: " + salarioBase[6]);
                                        System.out.println("Nome " + nome[6]);
                                        
                                }else if(anoContrato[6] < 2022 &&  anoContrato[6] >= 2019){
                                                
                                                salarioBase[6] += 0.07;
                                        
                                        System.out.println("Novo salário: " + salarioBase[6]);
                                        System.out.println("Nome " + nome[6]); 
                                                
                                                
                                }else if(anoContrato[6] < 2022 && anoContrato[6] > 1600){
                                     salarioBase[6] += 0.10;
                                        
                                        System.out.println("Novo salário: " + salarioBase[6]);
                                        System.out.println("Nome " + nome[6]); 
                                    
                                    
                                    
                                    
                                }}else{
                                System.out.println("Não será Ajustado");
                            }
                        
                        
                    }
                    
                    break;
                    
                    
                     case "Bia":
                    for (int i = 0; i < 1; i++) {
                        System.out.println("Ano contratado: " + anoContrato[7]);
                        System.out.println("Salario base: " + salarioBase[7]);
                        
                        System.out.println("Deseja Aumentar o salário? ");
                        op = scan.nextInt();
                        
                        if (op == 1) {
                            if (anoContrato[7] >= 2022) {
                                System.out.println("Novo salário: " + salarioBase[7]);}
                                else if (anoContrato[7] == 2022 && anoContrato[7] < 2021){
                                    
                                    System.out.println("Sem Ajuste");
                                    
                                }else if (anoContrato[7] < 2022 && anoContrato[7] >= 2021){
                                        salarioBase[7] += 0.05;
                                        
                                        System.out.println("Novo salário: " + salarioBase[7]);
                                        System.out.println("Nome " + nome[7]);
                                        
                                }else if(anoContrato[7] < 2022 &&  anoContrato[7] >= 2019){
                                                
                                                salarioBase[7] += 0.07;
                                        
                                        System.out.println("Novo salário: " + salarioBase[7]);
                                        System.out.println("Nome " + nome[7]); 
                                                
                                                
                                }else if(anoContrato[7] < 2022 && anoContrato[7] > 1600){
                                     salarioBase[7] += 0.10;
                                        
                                        System.out.println("Novo salário: " + salarioBase[7]);
                                        System.out.println("Nome " + nome[7]); 
                                    
                                    
                                    
                                    
                                }}else{
                                System.out.println("Não será Ajustado");
                            }
                        
                        
                    }
                    
                    break;
                    
                    
                    
                     case "Gil":
                    for (int i = 0; i < 1; i++) {
                        System.out.println("Ano contratado: " + anoContrato[8]);
                        System.out.println("Salario base: " + salarioBase[8]);
                        
                        System.out.println("Deseja Aumentar o salário? ");
                        op = scan.nextInt();
                        
                        if (op == 1) {
                            if (anoContrato[8] >= 2022) {
                                System.out.println("Novo salário: " + salarioBase[8]);}
                                else if (anoContrato[8] == 2022 && anoContrato[8] < 2021){
                                    
                                    System.out.println("Sem Ajuste");
                                    
                                }else if (anoContrato[8] < 2022 && anoContrato[8] >= 2021){
                                        salarioBase[8] += 0.05;
                                        
                                        System.out.println("Novo salário: " + salarioBase[8]);
                                        System.out.println("Nome " + nome[8]);
                                        
                                }else if(anoContrato[8] < 2022 &&  anoContrato[8] >= 2019){
                                                
                                                salarioBase[8] += 0.07;
                                        
                                        System.out.println("Novo salário: " + salarioBase[8]);
                                        System.out.println("Nome " + nome[8]); 
                                                
                                                
                                }else if(anoContrato[8] < 2022 && anoContrato[8] > 1600){
                                     salarioBase[8] += 0.10;
                                        
                                        System.out.println("Novo salário: " + salarioBase[8]);
                                        System.out.println("Nome " + nome[8]); 
                                    
                                    
                                    
                                    
                                }}else{
                                System.out.println("Não será Ajustado");
                            }
                        
                        
                    }
                    
                    break;
                    
                    
                    
                    
                    
            
            }
        
        
        
        
        
        
        
        
        
        
        
        
        
            
//           System.out.println("Média Salário " + media); 
    }
//        System.out.println("Média Salário " + media); 
        
}

         
        
        
                        
                
//                
//                double sBase = salarioBase[i];
//                
//                if (salarioBase[i] > sBase ) {
//                    
//                    System.out.println(salarioBase[i]);
//                    System.out.println(nome[i]);
//                    System.out.println(anoContrato[i]);
//                    
//                }
                
                
                
                
//                
//          

