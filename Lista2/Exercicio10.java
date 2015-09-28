package br.edu.ifcvideira.Lista2;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Exercicio10 {
    public static void main(String[] args){
        int timeA, timeB;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de gols que o time A fez: ");
        timeA = ler.nextInt();
        System.out.print("Digite a quantidade de gols que o time B fez: ");
        timeB = ler.nextInt();
        
        if(timeA > timeB){
            System.out.println("O time A venceu o time B com " + timeA + " gols!");
        }
        else if(timeB > timeA){
            System.out.println("O time B venceu o time A com " + timeB + " gols!");
        }
        else{
            System.out.println("Houve um empate, time A com " + timeA + " gols e time B com " + timeB + " gols!");
        }
    }    
}
