package br.edu.ifcvideira.Lista1;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Exercicio11 {
    public static void main(String[] args){
        double prestacaoAtrasada, prestacao, taxa, diasAtraso;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o valor da prestação: ");
        prestacao = ler.nextDouble();
        System.out.print("Digite o percentual da taxa por cada dia de atraso: ");
        taxa = ler.nextDouble();
        System.out.print("Digite a quantidade de dias atrasados: ");
        diasAtraso = ler.nextDouble();
        
        prestacaoAtrasada = prestacao+(prestacao*(taxa/100)*diasAtraso);
        
        System.out.println("O valor da prestção atrasada é de: " + prestacaoAtrasada);
    }
    
}
