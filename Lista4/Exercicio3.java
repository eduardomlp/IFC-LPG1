package br.edu.ifcvideira.Lista4;
import java.util.Scanner;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio3 {
    public static void main(String[] args){
        int vetorSize, soma = 0;
        int[] array;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de números que deseja escrever: ");
        vetorSize = ler.nextInt();
        array = new int[vetorSize];
        
        for(int i = 0; i < vetorSize; i++){
            System.out.print("Digite um valor: ");
            array[i] = ler.nextInt();
            if((array[i] % 2) == 0){
                soma += array[i];
            }
        }
        
        System.out.println("A soma dos valores pares é: " + soma);
    }    
}
