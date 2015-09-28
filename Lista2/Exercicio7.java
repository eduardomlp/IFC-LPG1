package br.edu.ifcvideira.Lista2;
import java.util.Scanner;
/**
 *
 * @author eduardo
 */
public class Exercicio7 {
    public static void main(String[] args){
        double valor1, valor2, valor3, soma;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        valor1 = ler.nextDouble();
        System.out.print("Digite o segundo valor: ");
        valor2 = ler.nextDouble();
        System.out.print("Digite o terceiro valor: ");
        valor3 = ler.nextDouble();
        
        soma = 5; //Inicio da variavel, se a linha for excluida, dará erro na linha 29
        
        if((valor1 > valor2)&&(valor3 > valor2)){
            soma = valor1+valor3;
        }        
        if((valor2 > valor1)&&(valor3 > valor1)){
            soma = valor3+valor2;
        }
        if((valor2 > valor3)&&(valor1 > valor3)){
            soma = valor1+valor2;
        }
            System.out.println("A soma dos 2 valores é igual a: " + soma);
    }
}
