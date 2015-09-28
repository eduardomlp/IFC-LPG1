package br.edu.ifcvideira.Lista1;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Exercicio4 {
    public static void main(String[] args){
        double raio, altura, area;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Informe o raio do cone: ");
        raio = ler.nextDouble();
        System.out.print("Informe o altura do cone: ");
        altura = ler.nextDouble();
        
        area = Math.PI*raio*altura;
        
        System.out.println("A área do cone é de: " + area);
    }
    
}
