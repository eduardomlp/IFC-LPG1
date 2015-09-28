package br.edu.ifcvideira.Lista4;
import java.util.Scanner;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio9 {
    public static void main(String[] args){
        int vetor[][] = new int[2][2];
        int lowerValue = 500000000;
        
        Scanner ler = new Scanner(System.in);

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.print("Digite um valor para o array: ");
                vetor[i][j] = ler.nextInt();
                if(vetor[i][j] < lowerValue){
                    lowerValue = vetor[i][j];                        
                }
            }
        }
        System.out.println("O menor valor digitado = " + lowerValue);
    }
}
