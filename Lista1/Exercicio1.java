package br.edu.ifcvideira.Lista1;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Exercicio1 {
    public static void main(String[] args){
        double raio, altura, areaSuperficial;
        
        Scanner ler = new Scanner(System.in);   //Inicia novo scanner
        
        System.out.print("Informe o raio do cilindro: ");
        raio = ler.nextDouble();
            
        System.out.print("Informe a altura do cilindro: ");
        altura = ler.nextDouble();
        
        areaSuperficial = 2*Math.PI*raio*altura;
        
        System.out.println("A área superficial do cilindro é igual a: " + areaSuperficial);
    }
    
}