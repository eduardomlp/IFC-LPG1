package br.edu.ifcvideira.Lista4;
import java.util.Scanner;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio12 {
    public static void main(String[] args){
        int matriz[][] = new int[3][4];
        
        Scanner ler = new Scanner(System.in);
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.print("Informe um valor para a matriz: ");
                matriz[i][j] = ler.nextInt();
            }
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("Matriz: ");
        
        for(int i = 0; i < 3; i++){
            System.out.println("");
            for(int j = 0; j < 4; j++){
                System.out.print(matriz[i][j]);
            }
        }
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("O valor do campo superior esquerdo = " + matriz[0][0]);
        System.out.println("O valor do campo inferior esquerdo = " + matriz[2][0]);
    }
}
