package br.edu.ifcvideira.Lista5;
import java.util.Scanner;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio1 {
    public static void main(String[] args){
        int j = 0,
            k = 0,
            lowerNumber = Integer.MAX_VALUE, 
            temp;
        int[] array = new int[20];
        int[] orderedArray = new int[20];
        Scanner ler = new Scanner(System.in);
        
        for(int i = 0; i < array.length; i++){
            System.out.print("Informe um valor: ");            
            array[i] = ler.nextInt();
        }
        
        while(j != 20){
            for(; k < array.length; k++){
                if(array[k] < lowerNumber){
                    orderedArray[j] = array[k];
                    temp = array[j];
                    array[j] = array[k];
                    lowerNumber = array[k];
                    array[k] = temp;
                }
            }
            j++;
            k = j;
            lowerNumber = Integer.MAX_VALUE;
        }
        
        System.out.println("Array em ordem crescente: ");
        for(int i = 0; i < orderedArray.length; i++){
            System.out.println(orderedArray[i]);
        }
    }
}
