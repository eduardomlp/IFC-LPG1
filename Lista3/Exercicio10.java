package br.edu.ifcvideira.Lista3;
import java.util.Scanner;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio10 {
    public static void main(String[] args){
        String[] time, jogador;
        double[] peso;
        int[] idade;
        int idadeM = 0, idadeMTotal = 0, idadeMFinal = 0;
        double pesoM = 0, pesoMTotal = 0, pesoMFinal = 0;
        time = new String[40];
        jogador = new String[23];
        peso = new double[23];
        idade = new int[23];
        int times = 40, jogadores = 23;
        
        Scanner ler = new Scanner(System.in);
        
        for(int i = 0; i < times; i++){
            System.out.print("Digite o nome do time: ");
            time[i] = ler.next();
            for(int j = 0; j < jogadores; j++){
                System.out.print("Digite o nome do jogador: ");
                jogador[j] = ler.next();
                System.out.print("Digite o peso do jogador: ");
                peso[j] = ler.nextDouble();
                System.out.print("Digite a idade do jogador: ");
                idade[j] = ler.nextInt();
                idadeM += idade[j];
                pesoM += peso[j];
                
                if(j+1 == jogadores){
                    pesoM /= jogadores;
                    idadeM /= jogadores;
                    System.out.println("\nMédia de peso do time: " + pesoM);
                    System.out.println("Média de idade do time: " + idadeM + "\n");
                    pesoMFinal = pesoM;
                    idadeMFinal = idadeM;
                    pesoM = 0;
                    idadeM = 0;
                }
            }
            pesoMTotal += pesoMFinal;
            idadeMTotal += idadeMFinal;
        }
        pesoMTotal /= times;
        idadeMTotal /= times;
        System.out.println("Média de peso de todos os jogadores: " + pesoMTotal);
        System.out.println("Média de idade de todos os jogadores: " + idadeMTotal);
    }
}
