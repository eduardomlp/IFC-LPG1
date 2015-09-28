package br.edu.ifcvideira.Lista2;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Exercicio4 {
    public static void main(String[] args){
        double valor1, valor2, valorMaior;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        valor1 = ler.nextDouble();
        System.out.print("Digite o segundo valor: ");
        valor2 = ler.nextDouble();
        
        if(valor1 > valor2){
            valorMaior = valor1;
        }        
        else if(valor2 > valor1){
            valorMaior = valor2;
        }
        else{
        System.out.println("Os dois valores são iguais!");
        return;
        }
        
        System.out.println("O maior valor digitado foi o: " + valorMaior);
        
    }    
}
