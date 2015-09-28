package br.edu.ifcvideira.Lista4;
import java.util.Scanner;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio8 {
    public static void main(String[] args){
        int count = 0;
        double media = 0;
        int pares[] = new int[25];
        int vetor[][] = new int[5][5];
        
        Scanner ler = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("Digite um valor para o array: ");
                vetor[i][j] = ler.nextInt();
                if((vetor[i][j] % 2) == 0){
                    pares[count] = vetor[i][j];
                    media += vetor[i][j];
                    count++;
                }
            }
        }
        System.out.println("");
        media /= (count+1);
        System.out.println("A média de valores pares na matriz = " + media);
        for(int i = 0; i < 25; i++){
            if(pares[i] != 0){
                System.out.println(pares[i] + " é par");
            }
        }
    }    
}
