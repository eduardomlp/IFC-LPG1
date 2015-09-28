package br.edu.ifcvideira.Lista2;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Exercicio1 {
    public static void main(String[] args){
        double valor;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        valor = ler.nextDouble();
        
        if(valor > 0){
            System.out.println("O numero digitado é positivo");
        }
        else if(valor < 0){
            System.out.println("O numero digitado é negativo");
        }
        else{
            System.out.println("O numero é 0");
        }
    }
}
