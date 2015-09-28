package br.edu.ifcvideira.Lista2;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Exercicio8 {
    public static void main(String[] args){
        double valor1, valor2, valor3, menor, medio, maior;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        valor1 = ler.nextDouble();
        System.out.print("Digite o segundo valor: ");
        valor2 = ler.nextDouble();
        System.out.print("Digite o terceiro valor: ");
        valor3 = ler.nextDouble();
        
        //inicio das variaveis para nao exibir erro nas linhas abaixo
        menor = 0;
        medio = 0; 
        maior = 0;        
        
        if((valor1 >= valor2)&&(valor1 >= valor3)){
            maior = valor1;
            if(valor2 > valor3){
                medio = valor2;
                menor = valor3;
            }
            else{
                medio = valor3;
                menor = valor2;
            }
        }
        
        if((valor2 >= valor1)&&(valor2 >= valor3)){
            maior = valor2;
            if(valor1 > valor3){
                medio = valor1;
                menor = valor3;
            }
            else{
                medio = valor3;
                menor = valor1;
            }
        }
        
        if((valor3 >= valor1)&&(valor3 >= valor2)){
            maior = valor3;
            if(valor1 > valor2){
                medio = valor1;
                menor = valor2;
            }
            else{
                medio = valor2;
                menor = valor1;
            }
        }
        
        System.out.println("Os valores em ordem crescente são: " + menor + " | " + medio + " | " + maior);
    }
}
