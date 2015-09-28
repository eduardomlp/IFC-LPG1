package br.edu.ifcvideira.Lista4;
import java.util.Scanner;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio6 {
    public static void main(String[] args){
        int[] vetor1, vetor2, vetorFinal;
        int j = 0;
        vetor1 = new int[10];        
        vetor2 = new int[10];        
        vetorFinal = new int[20];        
        
        Scanner ler = new Scanner(System.in);
        
        for(int i = 0; i < 10; i++){
            System.out.print("Digite um valor para o primeiro vetor: ");
            vetor1[i] = ler.nextInt();
        }
        for(int i = 0; i < 10; i++){
            System.out.print("Digite um valor para o segundo vetor: ");
            vetor2[i] = ler.nextInt();            
        }
        
        for(int i = 0; i < 20; i+=2){
            vetorFinal[i] = vetor1[j];
            vetorFinal[i+1] = vetor2[j];
            j++;            
        }
        
        for(int i = 0; i < 20; i++){
            System.out.println(vetorFinal[i]);
        }
    }
}
