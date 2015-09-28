package br.edu.ifcvideira.Lista3;
import java.util.Scanner;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio4 {
    public static void main(String[] args){
        int jogador1, jogador2, valor, i, j;
        
        jogador1 = 0;
        jogador2 = 0;
        j=2;
        
        Scanner ler = new Scanner(System.in);
        
        repetidor:
        for(i=1; i<j; i++){
            j+=i;
                     
            System.out.print("Ponto do jogador: ");
            valor = ler.nextInt();

            if(valor == 1){
                jogador1++;
            } else if(valor == 2){
                jogador2++;
            } else{
                System.out.println("Jogador inválido!!!");
                return;
            }
            
            if(i >= 21){
                if ((jogador1 - jogador2) >= 2) {
                    System.out.println("Jogador 1 ganhou com " + jogador1 + " pontos!");
                    break repetidor;
                }
                if ((jogador2 - jogador1) >= 2) {
                    System.out.println("Jogador 2 ganhou com " + jogador2 + " pontos!");
                    break repetidor;
                }
            }
        }       
    }    
}
