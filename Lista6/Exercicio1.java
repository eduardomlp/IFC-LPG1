package br.edu.ifcvideira.Lista6;
import java.util.Scanner;
import br.edu.ifcvideira.Lista6.Contador;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Contador counter = new Contador();
        
        for(int i = 0; i < Integer.MAX_VALUE; i++){
            System.out.print("Digite 1 para incrementar o contador, 2 para decrementar o contador, ou 0 para sair: ");
            int temp = ler.nextInt();
            if(temp == 1){
                counter.setIncrement();
                System.out.println(counter.getNumber());
            }
            else if(temp == 2){
                counter.setDecrement();
                System.out.println(counter.getNumber());
            }
            else{
                break;
            }
        }        
    }
}
