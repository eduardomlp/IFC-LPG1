package br.edu.ifcvideira.Lista6;
import java.util.Scanner;
import br.edu.ifcvideira.Lista6.Changer;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Changer changer = new Changer();
        
        System.out.println("Informe o valor do primeiro número: ");
        changer.setFirstNumber(ler.nextInt());
        System.out.println("Informe o valor do segundo número: ");
        changer.setSecondNumber(ler.nextInt());
        
        changer.changeValues();
        
        System.out.println("Novos valores das variáveis: 1ª " + changer.getFirstNumber() + " 2ª " + changer.getSecondNumber());
    }
}
