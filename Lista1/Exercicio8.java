package br.edu.ifcvideira.Lista1;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Exercicio8 {
    public static void main(String[] args){
        double grausF, grausC;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Informe a temperatura em graus Fahrenheit: ");
        grausF = ler.nextDouble();
        
        grausC = (grausF-32)/1.8;
        
        System.out.println("A temperatura em graus Celsius é: " + grausC);
    }    
}
