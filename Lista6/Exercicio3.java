package br.edu.ifcvideira.Lista6;
import br.edu.ifcvideira.Lista6.Wallet;
import java.util.*;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner ler  = new Scanner(System.in);
        Wallet wallet = new Wallet();
        
        System.out.print("Informe o valor do salário mínimo: ");
        wallet.setSalarioMin(ler.nextDouble());
        System.out.print("Informe a quantidade de quilowatts gasta: ");
        wallet.setQuantidadeKW(ler.nextDouble());
        
        System.out.println("Valor a ser pago sem desconto: " + wallet.getToPayValue() + "\n" +
                            "Valor a ser pago com 10% de desconto: " + wallet.getNewToPayValue());
    }
}
