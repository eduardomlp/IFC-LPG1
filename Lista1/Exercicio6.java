package br.edu.ifcvideira.Lista1;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Exercicio6 {
    public static void main(String[] args){
        double raio, volume;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Informe o raio da esfera: ");
        raio = ler.nextDouble();
        
        volume = (4*Math.PI*Math.pow(raio, 3))/3;   //O '/3' passou para o final da fórmula, pois ele tem que dividir toda a conta
        System.out.println("O volume da esfera é de: " + volume);
    }
}
