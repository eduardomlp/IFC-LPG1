package br.edu.ifcvideira.Lista3;
import java.util.Scanner;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio3 {
    public static void main(String[] args){
        int i, par, impar, positivo, negativo;
        double valor;
        
        negativo = 0;
        par = 0;
        impar = 0;
        positivo = 0;
                
        Scanner ler = new Scanner(System.in);
        
        for(i=0; i<5; i++){
            System.out.print("Digite um número: ");
            valor = ler.nextDouble();
            
            if(valor >= 0){
                positivo++;
            }
            else{
                negativo++;
            }
            
            if((valor % 2) == 0){
                par++;
            }
            else{
                impar++;
            }
        }
        
        System.out.println("\n\n\n\n\n\n"
                            + "Quantidade de números positivos = " + positivo +
                           "\nQuantidade de números negativos = " + negativo + 
                           "\nQuantidade de números pares = " + par + 
                           "\nQuantidade de números ímpares = " + impar
        );
        
    }    
}
