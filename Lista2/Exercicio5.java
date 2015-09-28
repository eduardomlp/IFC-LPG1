package br.edu.ifcvideira.Lista2;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Exercicio5 {
    public static void main(String[] args){
        double valor1, valor2;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        valor1 = ler.nextDouble();
        System.out.print("Digite o segundo valor: ");
        valor2 = ler.nextDouble();
        
        if(valor1 > valor2){
            System.out.println(valor1 + " > " + valor2);
        }
        
        else{
            System.out.println(valor2 + "< " + valor2);
        }
        
    }
    
}
