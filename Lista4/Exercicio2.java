package br.edu.ifcvideira.Lista4;
import java.util.Scanner;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio2 {
    public static void main(String[] args){
        int i, marking = 0;
        int[] array;
        array = new int[20];
        
        Scanner ler = new Scanner(System.in);
        
        for(i = 0; i < 20; i++){
            System.out.print("Digite um valor: ");
            array[i] = ler.nextInt();
        }
        
        for(i = 0; i < 20; i++){
            if(array[i] == 10){
                System.out.println("O número 10 esta na posição " + i + " do vetor e foi o " + (i+1) + "º número a ser digitado!");
                marking = 1;
            }
        }
        if(marking != 1){
            System.out.println("Não foi digitado nenhum número '10'!");
        }
    }
}
