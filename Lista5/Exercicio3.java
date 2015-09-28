package br.edu.ifcvideira.Lista5;
import java.util.Scanner;

/**
 * 
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio3 {
    public static void main(String[] args){
        
    Scanner ler = new Scanner(System.in);
        
    int matriz[][] = new int[3][3];
    int soma;
        
    soma = 0;
        
    for (int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
            System.out.println("Informe um valor para a matriz: ");
            matriz[i][j] = ler.nextInt();
        }
    }
    
    for (int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
            
        soma = ((matriz[0][0] * matriz[1][1] * matriz[2][2]) + 
                    (matriz[0][1] * matriz[1][2] * matriz[2][0]) +
                    (matriz[0][2] * matriz[1][0] * matriz[2][1]) -
                    (matriz[0][2] * matriz[1][1] * matriz[2][0]) -
                    (matriz[0][0] * matriz[1][2] * matriz[2][1]) -
                    (matriz[0][1] * matriz[1][0] * matriz[2][2])
                );
        }
    }
    
    System.out.println("Determinante: " + soma);
}
}