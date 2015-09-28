package br.edu.ifcvideira.Lista4;
import java.util.Scanner;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio11 {
    public static void main(String[] args){
        int matriz[][] = new int[5][5];
        int matrizCubica[][] = new int[5][5];
        
        Scanner ler = new Scanner(System.in);
        
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("Digite um valor para a matriz: ");
                matriz[i][j] = ler.nextInt();
            }
        }
        
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                matrizCubica[i][j] = ((matriz[i][j]*matriz[i][j])*matriz[i][j]);
            }
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("Matriz cúbica: ");
        
        for(int i = 0; i < 5; i++){
            System.out.println("");
            for(int j = 0; j < 5; j++){
                System.out.print(matrizCubica[i][j] + " ");
            }
        }   
        System.out.println("");
    }
}
