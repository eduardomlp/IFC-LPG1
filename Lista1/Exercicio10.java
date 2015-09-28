package br.edu.ifcvideira.Lista1;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Exercicio10 {
    public static void main(String[] args){
        double salarioBruto, salarioLiquido, quantidadeHoras, valorHora, INSS;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de horas trabalhadas: ");
        quantidadeHoras = ler.nextDouble();
        System.out.print("Digite o valor de cada hora trabalhada: ");
        valorHora = ler.nextDouble();
        System.out.print("Digite o percentual do INSS: ");
        INSS = ler.nextDouble();
        
        salarioBruto = quantidadeHoras * valorHora;
        INSS /= 100;
        salarioLiquido = salarioBruto - (salarioBruto * INSS);
        
        System.out.println("Salário Liquido: " + salarioLiquido);
        
        
    }
    
}
