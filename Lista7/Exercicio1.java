package br.edu.ifcvideira.Lista7;
import java.util.Scanner;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio1 {
    public static void main(String[]  args){
        String nomes[] = new String[3];
        int idade[] = new int[3];
        Pessoa pessoas[] = new Pessoa[3];
        Scanner ler = new Scanner(System.in);
        
        for(int i = 0; i < 3; i++){
            System.out.print("Informe o nome da " + (i+1) + " pessoa: ");
            nomes[i] = ler.next();
            System.out.print("Informe a idade dela: ");
            idade[i] = ler.nextInt();
            pessoas[i] = new Pessoa(nomes[i], idade[i]);
        } 
        
        pessoas[0].fazAniversario();
        pessoas[0].fazAniversario();
        pessoas[0].fazAniversario();
        pessoas[0].fazAniversario();
        pessoas[0].fazAniversario();
        pessoas[0].fazAniversario();
        pessoas[1].fazAniversario();
        pessoas[1].fazAniversario();
        pessoas[1].fazAniversario();
        pessoas[1].fazAniversario();
        pessoas[1].fazAniversario();
        pessoas[1].fazAniversario();
        pessoas[1].fazAniversario();
        pessoas[1].fazAniversario();
        pessoas[2].fazAniversario();
        pessoas[2].fazAniversario();
        pessoas[2].fazAniversario();
        pessoas[2].fazAniversario();
        pessoas[2].fazAniversario();
        pessoas[2].fazAniversario();
        pessoas[2].fazAniversario();       
        
        for(int i = 0; i < 3; i++){
            System.out.println("A pessoa " + pessoas[i].getNome() + " tem " + pessoas[i].getIdade());
        }
    }
}
