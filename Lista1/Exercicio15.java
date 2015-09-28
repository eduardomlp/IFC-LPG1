package br.edu.ifcvideira.Lista1;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Exercicio15 {
    public static void main(String[] args){
        String nome;
        double distanciaPercorrida, tempo, velocidadeMedia;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o nome do piloto: ");
        nome = ler.nextLine();
        System.out.print("Digite a distância precorrida: ");
        distanciaPercorrida = ler.nextDouble();
        System.out.print("Digite o tempo gasto: ");
        tempo = ler.nextDouble();
        
        velocidadeMedia = distanciaPercorrida/tempo;
        
        System.out.println("A velocidade média do piloto foi de " + velocidadeMedia + "km/h");
        
    }
    
}
