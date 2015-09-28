package br.edu.ifcvideira.Lista1;
import java.util.Scanner;
/**
 *
 * @author eduardo
 */
public class Exercicio12 {
    public static  void main(String[] args){
        int num1, num2, num3, num4, numeroFinal;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        num1 = ler.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = ler.nextInt();
        System.out.print("Digite o terceiro número: ");
        num3 = ler.nextInt();
        System.out.print("Digite o quarto número: ");
        num4 = ler.nextInt();
        
        numeroFinal = (num1+num2+num3+num4)/4;
        
        System.out.println("A média entre os 4 numeros digitados anteriormente foi de " + numeroFinal);
    }
}
