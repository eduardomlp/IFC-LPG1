package br.edu.ifcvideira.Lista5;
import java.util.*;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio7 {
    public static void main(String[] args) {
        String fraseDigitada;
        Scanner ler = new Scanner(System.in);
        StringBuilder finalString = new StringBuilder();
        
        System.out.print("Digite uma frase: ");
        fraseDigitada = ler.nextLine();
        String[] palavras = fraseDigitada.split("a");
        
        for(int i = 0; i < palavras.length; i++){
            if(i == 0){
                finalString.append(palavras[i]);
            }else{
                finalString.append("*").append(palavras[i]);
            }
        }
        
        System.out.println("Frase refeita: " + finalString);
    }
}
