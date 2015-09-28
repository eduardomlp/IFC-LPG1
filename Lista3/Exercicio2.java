package br.edu.ifcvideira.Lista3;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio2 {
    public static void main(String[] args){
        int i;
        
        i = 100;
        
        System.out.println("100 a -100 em ordem decrescente( numeros multiplos de 5 )");
        
        while (i > (-101)){
            System.out.println(i);
            i -= 5;            
        }
    }
}
