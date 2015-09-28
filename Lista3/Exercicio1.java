package br.edu.ifcvideira.Lista3;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio1 {
    public static void main(String[] args){
        int i, soma;
        
        soma = 0;
    
        for(i=0; i<101; i++){
            soma += i;
        }
        
        System.out.println("Soma dos 100 primeiros numeros naturais = " + soma);
    }
    
}
