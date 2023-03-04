/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p2luisguilherme2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class P2LuisGuilherme2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);

        double num_voo[] = new double[10];
        int num[] = new int[10];
        String origem[] = new String[10];
        String destino[] = new String[10];
        double num_lugar[] = new double[10];
        int lugares[] = new int[10];
        Voo voos[] = new Voo[10];
        double mainopcao, opcaoconsulta, achou;
        int op, opcaovoo;
        int pesqvoo = 0;

        do {

            System.out.println("Selecione a ação que deseja executar: \n"
                    + "	 1 - Exibir voos cadastrados\n"
                    + "	 2 - Cadastrar voos\n"
                    + "  3 - Consultar\n"
                    + "	 4 - Fazer reserva\n"
                    + "  5 - Sair");

            System.out.println("Digite a opção");
            op = scan.nextInt();

            switch (op) {
                case 1:

                    lerDados(num, origem, destino, lugares);

                    break;

            

           
          case 2:
                     System.out.println("Cadastro de Voo");
                    for (int i = 0; i < 1; i++) {

                        System.out.println("Digite o Número do seu vôo");
                        num_voo[i] = scan.nextDouble();

                        System.out.println(" Escreva qual é a origem do seu vôo: ");
                        origem[i] = scan.next();

                        System.out.println(" Escreva qual o destino do seu vôo: ");
                        destino[i] = scan.next();

                        System.out.println("Digite qual o número do seu lugar:");
                        num_lugar[i] = scan.nextDouble();
                        
                          if (num_voo[i] == num[i]){                   
                        System.out.println("Voo já Cadastrado");
                          }else{
                              System.out.println("Voo cadastrado");
                          }
                        
                    }
                    

                    break;
                case 3:
                    
                    System.out.println("Consulta de Voo");

                    System.out.println("Selecione o que deseja consultar\n"
                            + "	 1 - Por número de vôo\n"
                            + "	 2 - Por origem\n"
                            + "	 3 - Por destimno");
                    opcaoconsulta = scan.nextInt();
                    
                    
if (opcaoconsulta == 1) {
System.out.println("núm voo: ");
    int consultaVoo = scan.nextInt();


System.out.println(consVoo(voos, consVoo));
    } else if (opcaoconsulta == 2) {
System.out.println("origem:");
String consultaOrig = scan.next();


System.out.println(consVoo(voos, consOr));
    } else if (opcaoconsulta == 3) {
System.out.println("destino:");


String consultaDest = scan.next();
System.out.println(consVoo(voos, consDes));
}
                    
                    
                  
                    break;
                case 4:
                    
//                    System.out.println("Qual o número do Voo que deseja viajar?");
//                   int pesqvoo = scan.nextInt();
//
//                   Confirmar(pesqvoo);
                    
                    
                    break;
                case 5:
                    System.out.println("Encerrando...");
break;
            }

        
    }
    while (op 
!= 5);

    }
    
    public static void lerDados(int num[], String origem[], String destino[], int lugares[])
            throws FileNotFoundException {

        File arq = new File("dados.txt");
        Scanner scan = new Scanner(arq);

        System.out.printf("%10s %10s %10s %10s\n", scan.next(), scan.next(), scan.next(), scan.next());

        for (int i = 0; i < num.length; i++) {
            num[i] = scan.nextInt();
            origem[i] = scan.next();
            destino[i] = scan.next();
            lugares[i] = scan.nextInt();

            System.out.printf("%10d %10s %10s %10d\n", num[i], origem[i], destino[i], lugares[i]);
        }

    }
    
   
    
    
    
    public static void ExDados(Voo voos[]) {
String saída = "";
System.out.printf("%14s %14s %14s %14s\n","NumVoo","OrigemVoo","DestinoVoo","LugaresVoo");

for (int i = 0; i < 10; i++) {

if (voos[i].getnum_voo() != 0) {

System.out.printf("%14d %14s %14s %14d\n",
voos[i].getnum_voo(),
voos[i].getOrigem(),
voos[i].getDestino(),
voos[i].getLugares());
}
}
    

    }
    
    
    
     public static String consVoo(Voo voos[], int numVoo) {
String volta = "";
        for (int i = 0; i < 10; i++) {
    
if (numVoo == voos[i].getnum_voo()) {
    
volta  += voos[i].toString() + "\n";
}



}
if (volta != "") {
return volta;
}
return "cadastrado!";



}
    
    
    public static String consOr(Voo voos[], String origemVoo) {
String volta = "";
for (int i = 0; i < 10; i++) {
    if (origemVoo.equalsIgnoreCase(voos[i].getOrigem())) { 
volta += voos[i].toString() + "\n";
}



}
if (volta != "") {
    return volta;
}
        return "não cadastrado";



}  
    
    public static String consDes(Voo voos[], String destinoVoo) {
        
        String volta = "";


for (int i = 0; i < 10; i++) {
    
if (destinoVoo.equalsIgnoreCase(voos[i].getDestino())) {
    
volta += voos[i].toString() + "\n";
}



}
if (volta != "") 
    
    
return volta;
        return "não cadastrado!";
}



}
    
    
    
    
//    public int Confirmar(opcaovoo(int pesqvoo)){
//    
//      for (int i = 0; i < 1; i++) {
//
//                        if (pesqvoo == num_voo[i] && num_lugar[i] < 10) {
//                            System.out.println("Reserva Confirmada");
//                        } else if (num_lugar[i] > 10) {
//                            System.out.println("Voo lotado");
//                        } else if (pesqvoo != num_voo[i]) {
//                            System.out.println("Voo Inexistente");
//                        } else {
//                            System.out.println("Opção Inválida");
//                        }
//
//                    }
//    
//    }return pesqvoo;
    
    
    
    
    
    
    
    
    
    
    //***EXEMPLO***
    
//    public void cadastrar (int numvoo, String orig, String dest, int atdlugares){
//       
//        
//       
//    numvoo = num;
//    orig = origem;
//    dest = destino;
//    this.qtdlugares = qtdlugares;
//    
//    
//    
//    }
//    
//    public String reservar(){
//        
//    qtdlugares--;
//    return "Reserva confirmada";
//
//}


