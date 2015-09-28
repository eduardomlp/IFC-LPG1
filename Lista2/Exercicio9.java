package br.edu.ifcvideira.Lista2;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Exercicio9 {
    public static void main(String[] args){
        int numero;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        numero = ler.nextInt();
        
        if((numero % 2) == 0){
            System.out.println("O número " + numero + " é par");
        }
        else{
            System.out.println("O número " + numero + " é impar");
        }
    }
}
