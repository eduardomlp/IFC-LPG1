package br.edu.ifcvideira.Lista5;   

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio2 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.print((matriz[i][j] = i+j) + "   ");
            }
            System.out.println("");
        }
    }
}
