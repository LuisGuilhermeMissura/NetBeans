
package aluno;

import java.util.ArrayList;
import java.util.List;

public class main {
    
    /*
    Crie uma classe que represente um pedido: código, nome do cliente e valor;
    
    Crie 2 instancias de objeto dessa classe em variáveis distintas, atribua valor arbitrários
    
    crie uma terceira variável que deverá receber a referencia da primeira
    
    mostre todas as variáveis
    
    altere o valor da ultima variável e reprima os valores
    
    ficaram iguais? explique
    */
    
    public static void main(String[] args){
        
        List<Integer> listaNumeros = new ArrayList<Integer>();
        
        for (int i = 0; i < 100000; i++) {
            listaNumeros.add(i + i *2);
        }
        
        System.out.println("Tamanho Lista: " + listaNumeros.size());
        
        listaNumeros.parallelStream().forEach(n -> {
            System.out.println(n);
        });
        
        /*
        listaNumeros.add(29);
        listaNumeros.add(88);
        listaNumeros.add(191919);
        */
        //Aluno a = new Aluno();
        
        for(Integer x : listaNumeros){
            System.out.println(x);
        }
        
        listaNumeros.forEach(x ->{System.out.println(x);});
        
        List<Aluno> listaAlunos = new ArrayList<>();
        Aluno a1 = new Aluno();
        
        a1.nome = "Cicala";
        a1.ra = 24;
        
        Aluno a2 = new Aluno();
        a2.nome = "Marcelo";
        a2.ra = 99;
        
        listaAlunos.add(a1);
        listaAlunos.add(a2);
        
        
        for(Aluno x : listaAlunos){
            System.out.println(x.nome);
            System.out.println(x.ra);
        }
        
        
  
        
        
    }
    /*
    Aluno a1;
    Aluno a2;
    
    a1 = new Aluno();
    
    a1.nome = "Fabio";
    a1.ra = 122;
    
    a2 = a1;
    
        System.out.println("Aluno: "+a1.nome + " Ra: "+a1.ra);
    
        System.out.printf("Aluno2: %s RA %d", a2.nome, a2.ra);
        
    }
    */
}

