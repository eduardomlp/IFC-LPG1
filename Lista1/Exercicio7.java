package br.edu.ifcvideira.Lista1;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Exercicio7 {
   public static void main(String[] args){
       double raio, altura, volume;
       
       Scanner ler = new Scanner(System.in);
       
       System.out.print("Informe o raio do cone: ");
       raio = ler.nextDouble();
       System.out.print("Informe a altura do cone: ");
       altura = ler.nextDouble();
       
       volume = (Math.PI*Math.pow(raio, 2)*altura)/3;
       
       System.out.println("O volume do cone é de: " + volume);
   } 
}
