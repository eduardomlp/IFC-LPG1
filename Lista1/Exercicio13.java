package br.edu.ifcvideira.Lista1;
import java.util.Scanner;
/**
 *
 * @author eduardo
 */
public class Exercicio13 {
    public static void main(String[] args){
        double chuvaPol, chuvaMM;
        
        Scanner ler = new Scanner(System.in);
                
        System.out.print("Digite a quantidade de chuva em polegadas: ");
        chuvaPol = ler.nextDouble();
        
        chuvaMM = chuvaPol*25.4;
        
        System.out.println("A quantidade de chuva em MM é de " + chuvaMM + "mm");
        
        
    }
}
