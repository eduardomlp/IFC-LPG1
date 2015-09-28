package br.edu.ifcvideira.Lista2;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Exercicio2 {
    public static void main(String[] args){
        double nota1, nota2, media;
        String aprovacao;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota do aluno: ");
        nota1 = ler.nextDouble();
        System.out.print("Digite a segunda nota do aluno: ");
        nota2 = ler.nextDouble();
        
        media = (nota1 + nota2)/2;
        
        if((nota1 > 10)||(nota1 < 0)||(nota2 > 10)||(nota2 < 0)){
           System.out.println("Notas inválidas");
           return;
        }
        
        if((media >= 0)&&(media < 7)){
            aprovacao = "Reprovado";       
        }
        
        else{
            aprovacao = "Aprovado";       
        }
        
        System.out.println("A média de notas do aluno é igual a " + media + ", o aluno foi " + aprovacao);
        
    }
    
}
