/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmovetor;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class AlgoritmoVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scan = new Scanner(System.in);
    
    int op;
    int caso;
    double retirar;
    double depositar;
    double novosaldo;
    int valido = 999999999;
//    int i;
//    int conta;
//    int numconta[] = new int[10];
//    String tipconta[] = new String[10];
//    String nome[] = new String[10];
//    double cpf[] = new double[10];
//    double tel[] = new double[10];
//    double saldo[] = new double[10];
    
   int numconta[] = {1,2,3,4,5,6,7,8,9,10};
    String tipconta[] = {"c","c","c","p","p","p","p","c","c","p"};
    String nome[] = {"Luis","ana","maria","karol","pedro","joao","carlos","gustavo","tereza","luciana"};
    double cpf[] = {123.213,456.526,789.548,963.478,852.145,741.120,159.426,478.015,236.478,183.729};
    double tel[] = {183729,168943,426486,351759,147963,369147,159357,312654,312321,101010};
    double saldo[] = {100.1,200.2,300.3,400.4,500.5,600.6,700.7,800.8,900.9,1000.10};
        
        do {
            System.out.println("Menu\n"
                    + "1 – Cadastrar Conta\n"
                    + "2 – Visualizar conta\n"
                    + "3 – Realizar Saque\n"
                    + "4 - Realizar Depósito\n"
                    + "5 - Sair");

            System.out.println("Digite a opção");
            op = scan.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Cadastro de conta");
                    System.out.println(" --- ");
                    
                  
                    for (int i = 1; i < 10; i++) {
                        
                        while(numconta[i] == valido){
                    System.out.println("Digite o Número da conta: ");    
                    valido = scan.nextInt();
                    }
                        
                        System.out.println("Digite o Número da conta: ");    
                    valido = scan.nextInt();
                    
                     System.out.println("Digite o tipo da conta (C - corrente | P - Poupança): ");    
//                    tipconta[i] = scan.next().charAt(0);
                    tipconta[i] = scan.next();
                    
                     System.out.println("Digite o Nome: ");    
                    nome[i] = scan.next();
                    
                     System.out.println("Digite o CPF: ");    
                    cpf[i] = scan.nextDouble();
                    
                     System.out.println("Digite o Telefone: ");    
                    tel[i] = scan.nextDouble();
                    
                     System.out.println("Digite o Saldo: ");    
                    saldo[i] = scan.nextDouble();
                    
                    
                    
//                        
                    }
                    break;

                case 2:
                    System.out.println("Visualizar conta");
                    System.out.println(" --- ");
                    System.out.println("Qual conta visualizar (1 - 10)");
                    caso = scan.nextInt();
                    
                    switch(caso){
                        case 1:
                            
                             
                            System.out.println("Número da conta: " + numconta[0] + "\nTipo da conta: " + tipconta[1] + "\nNome:  " + nome[1] + "\nCPF " + cpf[1] + " \nTelefone: " + tel[1] + "\nSaldo: " + saldo[1]);
                            
                            break;
                            
                            case 2:
                            
                            System.out.println("Número da conta: " + numconta[1] + " \nTipo da conta: " + tipconta[2] + "\nNome:  " + nome[2] + "\nCPF " + cpf[2] + "\nTelefone:  " + tel[2] + "\nSaldo:  " + saldo[2]);
                            
                            break;
                            
                            case 3:
                            
                            System.out.println("Número da conta: " + numconta[3] + " \nTipo da conta: " + tipconta[3] + " \nNome: " + nome[3] + "\nCPF " + cpf[3] + " \nTelefone: " + tel[3] + " \nSaldo: " + saldo[3]);
                            
                            break;
                            
                            case 4:
                            
                            System.out.println("Número da conta: " + numconta[4] + " \nTipo da conta: " + tipconta[4] + " \nNome: " + nome[4] + "\nCPF " + cpf[4] + "\nTelefone:  " + tel[4] + "\nSaldo:  " + saldo[4]);
                            
                            break;
                            
                            
                            case 5:
                            
                            System.out.println("Número da conta: " + numconta[5] + " \nTipo da conta: " + tipconta[5] + " \nNome: " + nome[5] + " \nCPF" + cpf[5] + "\nTelefone:  " + tel[5] + "\nSaldo:  " + saldo[5]);
                            
                            break;
                            
                            
                            case 6:
                            
                            System.out.println("Número da conta: " + numconta[6] + " \nTipo da conta: " + tipconta[6] + "\nNome:  " + nome[6] + "\nCPF " + cpf[6] + " \nTelefone: " + tel[6] + "\nSaldo:  " + saldo[6]);
                            
                            break;
                            
                            case 7:
                            
                            System.out.println("Número da conta: " + numconta[7] + " \nTipo da conta: " + tipconta[7] + " \nNome: " + nome[7] + "\nCPF " + cpf[7] + "\nTelefone:  " + tel[7] + " \nSaldo: " + saldo[7]);
                            
                            break;
                            
                            case 8:
                            
                            System.out.println("Número da conta: " + numconta[8] + "\nTipo da conta:  " + tipconta[8] + "\nNome:  " + nome[8] + "\nCPF " + cpf[8] + "\nTelefone:  " + tel[8] + " \nSaldo: " + saldo[8]);
                            
                            break;
                            
                            case 9:
                            
                            System.out.println("Número da conta: " + numconta[9] + "\nTipo da conta:  " + tipconta[9] + "\nNome:  " + nome[9] + " \nCPF" + cpf[9] + " \nTelefone: " + tel[9] + " \nSaldo: " + saldo[9]);
                            
                            break;
                            
                            case 10:
                            
                            System.out.println("Número da conta: " + numconta[10] + "\nTipo da conta:  " + tipconta[10] + "\nNome: " + nome[10] + "\nCPF " + cpf[10] + "\nTelefone: " + tel[10] + " \nSaldo: " + saldo[10]);
                            
                            break;
                    
                           default:
                    System.out.println("Conta não encontrada");
                   
                    }while (op != 10);

                    break;
                case 3:
                    System.out.println("Saque");
                    System.out.println(" --- ");
                    System.out.println("Qual a conta que deseja alterar?: ");
                    caso = scan.nextInt();
                    
                    switch(caso){
                        case 1:
                            System.out.println("Seu saldo atual é de: " + saldo[1]);
                            System.out.println("Quanto deseja retirar?: ");
                            retirar = scan.nextDouble();
                            novosaldo = saldo[1] - retirar;
                            saldo[1] = novosaldo;
                            System.out.println("OK!, Seu Saldo agora é de: " + saldo[1]);
                            
//                            System.out.println("Número da conta: " + numconta[1] + "\nTipo da conta: " + tipconta[1] + "\nNome:  " + nome[1] + "\nCPF " + cpf[1] + " \nTelefone: " + tel[1] + "\nSaldo: " + saldo[1]);
                            
                            break;
                            
                            case 2:
                                System.out.println("Seu saldo atual é de: " + saldo[2]);
                            System.out.println("Quanto deseja retirar?: ");
                            retirar = scan.nextDouble();
                            novosaldo = saldo[2] - retirar;
                            saldo[2] = novosaldo;
                            System.out.println("OK!, Seu Saldo agora é de: " + saldo[2]);
                            
//                            System.out.println("Número da conta: " + numconta[2] + " \nTipo da conta: " + tipconta[2] + "\nNome:  " + nome[2] + "\nCPF " + cpf[2] + "\nTelefone:  " + tel[2] + "\nSaldo:  " + saldo[2]);
                            
                            break;
                            
                            case 3:
                                System.out.println("Seu saldo atual é de: " + saldo[3]);
                            System.out.println("Quanto deseja retirar?: ");
                            retirar = scan.nextDouble();
                            novosaldo = saldo[3] - retirar;
                            saldo[3] = novosaldo;
                            System.out.println("OK!, Seu Saldo agora é de: " + saldo[3]);
                            
//                            System.out.println("Número da conta: " + numconta[3] + " \nTipo da conta: " + tipconta[3] + " \nNome: " + nome[3] + "\nCPF " + cpf[3] + " \nTelefone: " + tel[3] + " \nSaldo: " + saldo[3]);
                            
                            break;
                            
                            case 4:
                                System.out.println("Seu saldo atual é de: " + saldo[4]);
                            System.out.println("Quanto deseja retirar?: ");
                            retirar = scan.nextDouble();
                            novosaldo = saldo[4] - retirar;
                            saldo[4] = novosaldo;
                            System.out.println("OK!, Seu Saldo agora é de: " + saldo[4]);
                            
//                            System.out.println("Número da conta: " + numconta[4] + " \nTipo da conta: " + tipconta[4] + " \nNome: " + nome[4] + "\nCPF " + cpf[4] + "\nTelefone:  " + tel[4] + "\nSaldo:  " + saldo[4]);
                            
                            break;
                            
                            
                            case 5:
                                System.out.println("Seu saldo atual é de: " + saldo[5]);
                            System.out.println("Quanto deseja retirar?: ");
                            retirar = scan.nextDouble();
                            novosaldo = saldo[5] - retirar;
                            saldo[5] = novosaldo;
                            System.out.println("OK!, Seu Saldo agora é de: " + saldo[5]);
                            
//                            System.out.println("Número da conta: " + numconta[5] + " \nTipo da conta: " + tipconta[5] + " \nNome: " + nome[5] + " \nCPF" + cpf[5] + "\nTelefone:  " + tel[5] + "\nSaldo:  " + saldo[5]);
                            
                            break;
                            
                            
                            case 6:
                            System.out.println("Seu saldo atual é de: " + saldo[6]);
                            System.out.println("Quanto deseja retirar?: ");
                            retirar = scan.nextDouble();
                            novosaldo = saldo[6] - retirar;
                            saldo[6] = novosaldo;
                            System.out.println("OK!, Seu Saldo agora é de: " + saldo[6]);
//                            System.out.println("Número da conta: " + numconta[6] + " \nTipo da conta: " + tipconta[6] + "\nNome:  " + nome[6] + "\nCPF " + cpf[6] + " \nTelefone: " + tel[6] + "\nSaldo:  " + saldo[6]);
                            
                            break;
                            
                            case 7:
                            System.out.println("Seu saldo atual é de: " + saldo[7]);
                            System.out.println("Quanto deseja retirar?: ");
                            retirar = scan.nextDouble();
                            novosaldo = saldo[7] - retirar;
                            saldo[7] = novosaldo;
                            System.out.println("OK!, Seu Saldo agora é de: " + saldo[7]);
//                            System.out.println("Número da conta: " + numconta[7] + " \nTipo da conta: " + tipconta[7] + " \nNome: " + nome[7] + "\nCPF " + cpf[7] + "\nTelefone:  " + tel[7] + " \nSaldo: " + saldo[7]);
                            
                            break;
                            
                            case 8:
                            System.out.println("Seu saldo atual é de: " + saldo[8]);
                            System.out.println("Quanto deseja retirar?: ");
                            retirar = scan.nextDouble();
                            novosaldo = saldo[8] - retirar;
                            saldo[8] = novosaldo;
                            System.out.println("OK!, Seu Saldo agora é de: " + saldo[8]);
//                            System.out.println("Número da conta: " + numconta[8] + "\nTipo da conta:  " + tipconta[8] + "\nNome:  " + nome[8] + "\nCPF " + cpf[8] + "\nTelefone:  " + tel[8] + " \nSaldo: " + saldo[8]);
                            
                            break;
                            
                            case 9:
                            System.out.println("Seu saldo atual é de: " + saldo[9]);
                            System.out.println("Quanto deseja retirar?: ");
                            retirar = scan.nextDouble();
                            novosaldo = saldo[9] - retirar;
                            saldo[9] = novosaldo;
                            System.out.println("OK!, Seu Saldo agora é de: " + saldo[9]);
//                            System.out.println("Número da conta: " + numconta[9] + "\nTipo da conta:  " + tipconta[9] + "\nNome:  " + nome[9] + " \nCPF" + cpf[9] + " \nTelefone: " + tel[9] + " \nSaldo: " + saldo[9]);
                            
                            break;
                            
                            case 10:
                            System.out.println("Seu saldo atual é de: " + saldo[10]);
                            System.out.println("Quanto deseja retirar?: ");
                            retirar = scan.nextDouble();
                            novosaldo = saldo[10] - retirar;
                            saldo[10] = novosaldo;
                            System.out.println("OK!, Seu Saldo agora é de: " + saldo[10]);
//                            System.out.println("Número da conta: " + numconta[10] + "\nTipo da conta:  " + tipconta[10] + "\nNome: " + nome[10] + "\nCPF " + cpf[10] + "\nTelefone: " + tel[10] + " \nSaldo: " + saldo[10]);
                            
                            break;
                    
                           default:
                    System.out.println("Conta não encontrada");
                    
                    }while (op != 10);

                    
                    
                    break;
                    case 4:
                    System.out.println("Depósito");
                        System.out.println(" --- ");
                        
                         System.out.println("Qual a conta que deseja alterar?: ");
                    caso = scan.nextInt();
                    
                    switch(caso){
                        case 1:
                            System.out.println("Seu saldo atual é de: " + saldo[1]);
                            System.out.println("Quanto deseja Depositar?: ");
                            depositar = scan.nextDouble();
                            novosaldo = saldo[1] + depositar;
                            saldo[1] = novosaldo;
                            System.out.println("OK!, Seu Saldo agora é de: " + saldo[1]);
                            
//                            System.out.println("Número da conta: " + numconta[1] + "\nTipo da conta: " + tipconta[1] + "\nNome:  " + nome[1] + "\nCPF " + cpf[1] + " \nTelefone: " + tel[1] + "\nSaldo: " + saldo[1]);
                            
                            break;
                            
                            case 2:
                                System.out.println("Seu saldo atual é de: " + saldo[2]);
                            System.out.println("Quanto deseja Depositar?: ");
                            depositar = scan.nextDouble();
                            novosaldo = saldo[2] + depositar;
                            saldo[2] = novosaldo;
                            System.out.println("OK!, Seu Saldo agora é de: " + saldo[2]);
                            
//                            System.out.println("Número da conta: " + numconta[2] + " \nTipo da conta: " + tipconta[2] + "\nNome:  " + nome[2] + "\nCPF " + cpf[2] + "\nTelefone:  " + tel[2] + "\nSaldo:  " + saldo[2]);
                            
                            break;
                            
                            case 3:
                                System.out.println("Seu saldo atual é de: " + saldo[3]);
                            System.out.println("Quanto deseja Depositar?: ");
                            depositar = scan.nextDouble();
                            novosaldo = saldo[3] + depositar;
                            saldo[3] = novosaldo;
                            System.out.println("OK!, Seu Saldo agora é de: " + saldo[3]);
                            
//                            System.out.println("Número da conta: " + numconta[3] + " \nTipo da conta: " + tipconta[3] + " \nNome: " + nome[3] + "\nCPF " + cpf[3] + " \nTelefone: " + tel[3] + " \nSaldo: " + saldo[3]);
                            
                            break;
                            
                            case 4:
                                System.out.println("Seu saldo atual é de: " + saldo[4]);
                            System.out.println("Quanto deseja Depositar?: ");
                            depositar = scan.nextDouble();
                            novosaldo = saldo[4] + depositar;
                            saldo[4] = novosaldo;
                            System.out.println("OK!, Seu Saldo agora é de: " + saldo[4]);
                            
//                            System.out.println("Número da conta: " + numconta[4] + " \nTipo da conta: " + tipconta[4] + " \nNome: " + nome[4] + "\nCPF " + cpf[4] + "\nTelefone:  " + tel[4] + "\nSaldo:  " + saldo[4]);
                            
                            break;
                            
                            
                            case 5:
                                System.out.println("Seu saldo atual é de: " + saldo[5]);
                            System.out.println("Quanto deseja Depositar?: ");
                            depositar = scan.nextDouble();
                            novosaldo = saldo[5] + depositar;
                            saldo[5] = novosaldo;
                            System.out.println("OK!, Seu Saldo agora é de: " + saldo[5]);
                            
//                            System.out.println("Número da conta: " + numconta[5] + " \nTipo da conta: " + tipconta[5] + " \nNome: " + nome[5] + " \nCPF" + cpf[5] + "\nTelefone:  " + tel[5] + "\nSaldo:  " + saldo[5]);
                            
                            break;
                            
                            
                            case 6:
                            System.out.println("Seu saldo atual é de: " + saldo[6]);
                            System.out.println("Quanto deseja Depositar?: ");
                            depositar = scan.nextDouble();
                            novosaldo = saldo[6] + depositar;
                            saldo[6] = novosaldo;
                            System.out.println("OK!, Seu Saldo agora é de: " + saldo[6]);
//                            System.out.println("Número da conta: " + numconta[6] + " \nTipo da conta: " + tipconta[6] + "\nNome:  " + nome[6] + "\nCPF " + cpf[6] + " \nTelefone: " + tel[6] + "\nSaldo:  " + saldo[6]);
                            
                            break;
                            
                            case 7:
                            System.out.println("Seu saldo atual é de: " + saldo[7]);
                            System.out.println("Quanto deseja Depositar?: ");
                            depositar = scan.nextDouble();
                            novosaldo = saldo[7] + depositar;
                            saldo[7] = novosaldo;
                            System.out.println("OK!, Seu Saldo agora é de: " + saldo[7]);
//                            System.out.println("Número da conta: " + numconta[7] + " \nTipo da conta: " + tipconta[7] + " \nNome: " + nome[7] + "\nCPF " + cpf[7] + "\nTelefone:  " + tel[7] + " \nSaldo: " + saldo[7]);
                            
                            break;
                            
                            case 8:
                            System.out.println("Seu saldo atual é de: " + saldo[8]);
                            System.out.println("Quanto deseja Depositar?: ");
                            depositar = scan.nextDouble();
                            novosaldo = saldo[8] + depositar;
                            saldo[8] = novosaldo;
                            System.out.println("OK!, Seu Saldo agora é de: " + saldo[8]);
//                            System.out.println("Número da conta: " + numconta[8] + "\nTipo da conta:  " + tipconta[8] + "\nNome:  " + nome[8] + "\nCPF " + cpf[8] + "\nTelefone:  " + tel[8] + " \nSaldo: " + saldo[8]);
                            
                            break;
                            
                            case 9:
                            System.out.println("Seu saldo atual é de: " + saldo[9]);
                            System.out.println("Quanto deseja Depositar?: ");
                            depositar = scan.nextDouble();
                            novosaldo = saldo[9] + depositar;
                            saldo[9] = novosaldo;
                            System.out.println("OK!, Seu Saldo agora é de: " + saldo[9]);
//                            System.out.println("Número da conta: " + numconta[9] + "\nTipo da conta:  " + tipconta[9] + "\nNome:  " + nome[9] + " \nCPF" + cpf[9] + " \nTelefone: " + tel[9] + " \nSaldo: " + saldo[9]);
                            
                            break;
                            
                            case 10:
                            System.out.println("Seu saldo atual é de: " + saldo[10]);
                            System.out.println("Quanto deseja Depositar?: ");
                            depositar = scan.nextDouble();
                            novosaldo = saldo[10] + depositar;
                            saldo[10] = novosaldo;
                            System.out.println("OK!, Seu Saldo agora é de: " + saldo[10]);
//                            System.out.println("Número da conta: " + numconta[10] + "\nTipo da conta:  " + tipconta[10] + "\nNome: " + nome[10] + "\nCPF " + cpf[10] + "\nTelefone: " + tel[10] + " \nSaldo: " + saldo[10]);
                            
                            break;
                    
                           default:
                    System.out.println("Conta não encontrada");
                   
                    }while (op != 10);

                    break;
                    case 5:
                    System.out.println("Encerrando");
                    break;
                default:
                    System.out.println("opção inválida");
                    break;
            }

        } while (op != 5);

    
        
    }
    
}

/*
            nome[i] = scanFile.next(); String
            categoria[i] = scanFile.next().charAt(0); Char
            salBase[i] = scanFile.nextDouble(); Double
            vendas[i] = scanFile.nextInt(); Int
*/

/*
switch(a){
      
     case 1: 
     for (int i = 0;i<clientes.length;i++)
     
     { 
      clientes[i] = new Cliente();   
     System.out.printf("Insira o nome: ");
     clientes[i].nome = ler.next();
     
     System.out.printf("Insira o endereço: ");
     clientes[i].endereco = ler.next();
     
     System.out.printf("Insira o telefone: ");
     clientes[i].telefone = ler.next();
     
     System.out.printf("Insira o CPF: ");
     clientes[i].cpf = ler.nextInt();
     
     System.out.printf("Insira o ID: ");
     clientes[i].id = ler.nextInt();
     
     System.out.printf("Insira saldo inicial da conta: ");
     saldos[i].saldo = ler.nextFloat();
     
     
     }
     
     
     break;
     case 2:
      
      
     
     
      System.out.println("-----QUAL SALDO DESEJA EXIBIR-----");
      System.out.println("1-Cliente 1");
      System.

*/