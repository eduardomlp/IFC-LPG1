package br.edu.ifcvideira.Lista1;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Exercicio5 {
    public static void main(String[] args){
        double raio, altura, volume;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Informe o raio do cilindro: ");
        raio = ler.nextDouble();
        System.out.print("Informe a altura do cilindro: ");
        altura = ler.nextDouble();
        
        volume = Math.PI*Math.pow(raio, 2)*altura;
        
        System.out.println("O volume do cilindro é de: " + volume);
    
    }
    
}
