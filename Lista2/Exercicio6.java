package br.edu.ifcvideira.Lista2;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Exercicio6 {
    public static void main(String[] args){
        double valor1, valor2, valor3;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o primeiro numero: ");
        valor1 = ler.nextDouble();
        
        System.out.print("Digite o segundo numero: ");
        valor2 = ler.nextDouble();
        
        System.out.print("Digite o terceiro numero: ");
        valor3 = ler.nextDouble();
        
        if((valor1 > valor2) && (valor1 > valor3)){
            System.out.println(valor1 + " foi o maior numero digitado");
            return;
        }
        if((valor2 > valor1) && (valor2 > valor3)){
            System.out.println(valor2 + " foi o maior numero digitado");
            return;
        }
        if((valor3 > valor1) && (valor3 > valor2)){
            System.out.println(valor3 + " foi o maior numero digitado");
            return;
        }
        if((valor1 == valor2)||(valor2 == valor3)||(valor1 == valor3)){
            System.out.println("Existem valores iguais!!!");
        }
        
        
    }
}
