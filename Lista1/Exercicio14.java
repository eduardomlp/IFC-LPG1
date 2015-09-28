package br.edu.ifcvideira.Lista1;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Exercicio14 {
    public static void main(String[] args){
        String nome;
        double salarioFixo, totalVendas, percentualVendas, salarioLiquido;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o nome do funcionário: ");
        nome = ler.nextLine();
        System.out.print("Digite o salário fixo do funcionário: ");
        salarioFixo = ler.nextDouble();
        System.out.print("Digite o total de vendas do funcionário: ");
        totalVendas = ler.nextDouble();
        System.out.print("Digite o percentual de comissão de vendas do funcionário: ");
        percentualVendas = ler.nextDouble();
        
        percentualVendas /= 100;
        
        salarioLiquido = salarioFixo+(totalVendas*percentualVendas);
        
        System.out.println("O salário liquido do funcionário " + nome + " é de " + salarioLiquido + "reais");
    }
}
