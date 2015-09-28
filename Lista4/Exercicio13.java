package br.edu.ifcvideira.Lista4;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio13 {
    public static void main(String[] args){
        int matriz[][] = new int[7][8];
        
        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 8; j++){
                matriz[i][j] = i+j;
            }
        }
        
        for(int i = 0; i < 7; i++){
            System.out.println("");
            for(int j = 0; j < 8; j++){
                System.out.print(matriz[i][j] + "    ");
            }
        }
        System.out.println("");
    }
}
