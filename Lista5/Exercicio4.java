package br.edu.ifcvideira.Lista5;
import static java.lang.Integer.parseInt;
import java.util.*;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio4 {
    public static void main(String[] args) {
        int lowerNumber = Integer.MAX_VALUE,
                highestNumber = Integer.MIN_VALUE;
        String numeros = new String();
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Informe valores inteiros separados por ponto e vírgula(;): ");
        numeros = ler.next();
        
        List<String> finalList = Arrays.asList(numeros.split(";"));
        for(String temp : finalList){
            System.out.println(temp);
            int tempInt = parseInt(temp);
            if(tempInt > highestNumber){
                highestNumber = tempInt;
            }
            if(tempInt < lowerNumber){
                lowerNumber = tempInt;
            }
        }
        System.out.println("Menor número digitado: " + lowerNumber + "\nMaior número digitado: " + highestNumber);
    }
}
