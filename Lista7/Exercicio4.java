package br.edu.ifcvideira.Lista7;
import java.util.Scanner;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Informe a velocidade do processador: ");
        int processador = ler.nextInt();
        System.out.print("Informe a quantidade de RAM: ");
        int ram = ler.nextInt();
        System.out.print("Informe o tamanho do HD: ");
        int hd = ler.nextInt();
        System.out.print("Informe o tamanho do monitor: ");
        int monitor = ler.nextInt();
        Computador pc = new Computador(processador, ram, hd, monitor);
        System.out.println("Valor total do computador = " + pc.calculaPreco());
    }
}
