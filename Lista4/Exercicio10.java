package br.edu.ifcvideira.Lista4;
import java.util.Scanner;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio10 {
    public static void main(String[] args){
        int matriz[][] = new int[5][5];
        int soma4 = 0, soma2 = 0, diagonalPrincipal = 0, diagonalSecundaria = 0, somaTotal = 0;
        
        Scanner ler = new Scanner(System.in);
        
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("Informe um valor para a matriz: ");
                matriz[i][j] = ler.nextInt();
            }
        }
        
        //Soma dos valores da linha 4
        for(int i = 0; i < 5; i++){
            soma4 += matriz[3][i];
        }
        
        //Soma dos valores da coluna 2
        for(int i = 0; i < 5; i++){
            soma2 += matriz[i][1];
        }
        
        //Soma da diagonal principal
        for(int i = 0; i < 5; i++){
            diagonalPrincipal += matriz[i][i];
        }
        
        //Soma da diagonal secundaria
        for(int i = 4; i > -1; i--){
                diagonalSecundaria += matriz[i][i];
        }
        
        //Soma de todos os valores
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                somaTotal += matriz[i][j];
            }
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("Matriz:");
        for(int i = 0; i < 5; i++){
            System.out.println("");
            for(int j = 0; j < 5; j++){
                System.out.print(matriz[i][j] + "  ");
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Soma da linha 4: " + soma4);
        System.out.println("Soma coluna 2: " + soma2);
        System.out.println("Soma diagonal principal: " + diagonalPrincipal);
        System.out.println("Soma diagonal secundária: " + diagonalSecundaria);
        System.out.println("Soma total: " + somaTotal);
    }
}
