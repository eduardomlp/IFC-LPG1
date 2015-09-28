package br.edu.ifcvideira.Lista5;
import java.lang.StringBuilder;
import java.util.*;

/**
 * 
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String fraseDigitada;
        StringBuilder finalString = new StringBuilder();
        
        System.out.print("Digite uma frase: ");
        fraseDigitada = ler.nextLine();
        String[] palavras = fraseDigitada.split(" ");
        String[] newString= new String[palavras.length];
        
        for(int i = palavras.length; i > 0; i--){
            finalString.append(" ").append(palavras[i-1]);
        }
        
        System.out.println("Frase ao contrário : " + finalString);
        
        
   }
}                                                   
