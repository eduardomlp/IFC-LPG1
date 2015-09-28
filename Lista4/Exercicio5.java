package br.edu.ifcvideira.Lista4;
import java.util.Scanner;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio5 {
    public static void main(String[] args){
        int[] age;
        int counter = 5;
        double[] height;
        
        age = new int[counter];
        height = new double[counter];
        
        Scanner ler = new Scanner(System.in);
        
        for(int i = 0; i < counter; i++){
            System.out.print("Digite a idade da pessoa: ");
            age[i] = ler.nextInt();
            System.out.print("Digite a altura da pessoa: ");
            height[i] = ler.nextDouble();
        }
        
        //Quebras de linha
        System.out.println("");
        System.out.println("");
        
        for(int i = 4; i > -1; i--){
            System.out.println("Idade da " + (i+1) + "ª digitada é: " + age[i]);
            System.out.println("Altura da " + (i+1) + "ª digitada é: " + height[i]);
        }
    }
}
