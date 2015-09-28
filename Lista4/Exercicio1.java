package br.edu.ifcvideira.Lista4;
import java.util.Scanner;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio1 {
    public static void main(String[] args){
        int i, marking = 0;
        int[] array;
        array = new int[10];
        
        Scanner ler = new Scanner(System.in);
        
        for(i = 0; i < 10; i++){
            System.out.print("Digite um valor: ");
            array[i] = ler.nextInt();
        }
        
        for(i = 0; i < 10; i++){
            if(array[i] > 20){
                System.out.println(array[i] + " é maior que 20!");
                marking = 1;
            }
        }
        if(marking != 1){
            System.out.println("Os números digitados são menores que 20!");
        }
    }
}
