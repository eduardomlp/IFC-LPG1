package br.edu.ifcvideira.Lista5;
import java.util.*;

/**
 * 
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String palindromo = new String();
        char[] charArray;
        char[] palindromoReverso;
        int j = 0, temp = 0;
        
        System.out.println("Informe um palavra: ");
        palindromo = ler.next();
        charArray = new char[palindromo.length()];
        palindromoReverso = new char[palindromo.length()];
        charArray = palindromo.toCharArray();
        for(int i = palindromo.length(); i > 0; i--){
            palindromoReverso[i-1] = charArray[j];
            j++;
        }
        
        for(int i = 0; i < palindromo.length(); i++){
            if(palindromoReverso[i] == charArray[i]){
                temp = 1;
            }
            else{
                temp = 0;
                break;
            }
        }
        
        if(temp == 1){
            System.out.println(palindromo + " é um palíndromo!");
        }
        else{
            System.out.println(palindromo + " não é um palíndromo!");
        }
    }    
}
