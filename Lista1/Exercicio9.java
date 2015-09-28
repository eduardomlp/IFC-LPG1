package br.edu.ifcvideira.Lista1;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Exercicio9 {
    public static void main(String[] args){
        double salarioAtual, salarioReajustado;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Informe o salário atual: ");
        salarioAtual = ler.nextDouble();
        
        salarioReajustado = salarioAtual+((salarioAtual*23.75)/100);
        System.out.println("O salário reajustado é de " + salarioReajustado + " reais");
        
    }
}
