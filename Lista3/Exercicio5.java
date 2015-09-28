package br.edu.ifcvideira.Lista3;
import java.util.Scanner;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio5 {
    public static void main(String[] args){
        double alturaMax, media, valor, mediaAltura;
        int i, grandes;
        
        media = 0;
        alturaMax = 0;
        grandes = 0;
        
        Scanner ler = new Scanner(System.in);
        
        for(i=0; i<20; i++){
            System.out.print("Digite a altura da pessoa: ");
            valor = ler.nextDouble();
            media += valor;
            
            if(valor > alturaMax){
                alturaMax = valor;
            }
            
            if(valor >= 2){
                grandes++;
            }
        } 
        
        mediaAltura = media/20;
        
        System.out.println("\n\n\n" +
                           "Media de altura das pessoas = " + mediaAltura + 
                           "\nMaior altura do grupo =" + alturaMax +
                           "\nQuantidade de pessoas maiores que 2 metros: " + grandes
        );
    }
}
