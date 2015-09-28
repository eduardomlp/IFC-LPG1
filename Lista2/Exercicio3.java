package br.edu.ifcvideira.Lista2;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Exercicio3 {
    public static void main(String[] args){
        int anoAtual, anoNascimento, mediaAnos;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Informe o ano atual: ");
        anoAtual = ler.nextInt();
        System.out.print("Informe o ano de nascimento: ");
        anoNascimento = ler.nextInt();
        
        mediaAnos = anoAtual - anoNascimento;
        
        if((mediaAnos >= 18)&&(mediaAnos >= 0)){
            System.out.println("A pessoa pode votar!!!");
        }
        else if((mediaAnos < 18)&&(mediaAnos >= 0)){
            System.out.println("A pessoa não pode votar!!!");
        }
        else{
            System.out.println("Anos digitados são inválidos!!!");
        }
    }    
}
