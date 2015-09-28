package br.edu.ifcvideira.Lista4;
import java.util.Scanner;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio4 {
    public static void main(String[] args){
        int[] pares, impares, numeros;
        int j = 0, k = 0;
        numeros = new int[12];
        pares = new int[12];
        impares = new int[12];
        
        Scanner ler = new Scanner(System.in);
        
        for(int i = 0; i < 12; i++){
            System.out.print("Digite um número: ");
            numeros[i] = ler.nextInt();
            if(((numeros[i] % 2) ==  0) && ((numeros[i] % 3) == 0)){
                pares[j] = numeros[i];
                j++;
            }
            if(((numeros[i] % 2) !=  0) && ((numeros[i] % 5) == 0)){
                impares[k] = numeros[i];
                k++;
            }
        }
        
        for(int count = 0; count < pares.length; count++){
            if(pares[count] != 0){
                System.out.println(pares[count] + " é um número par divisível por 3!");
            }
        }
            
        for(int count = 0; count < impares.length; count++){
            if(impares[count] != 0){
                System.out.println(impares[count] + " é um número ímpar divisível por 5!");
            }
        }
        
        if((j == 0) && (k == 0)){
            System.out.println("Não existem números pares divisíveis por 3, nem ímpares divisíveis por 5!");
        }
    }
}
