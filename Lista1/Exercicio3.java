package br.edu.ifcvideira.Lista1;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Exercicio3 {
    public static void main(String[] args){
        double raio, area;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Informe o raio da esfera: ");
        raio = ler.nextDouble();
        
        area = 4*Math.PI*Math.pow(raio, 2);
        
        System.out.println("A área da esfera é de: " + area);
    }
    
}
