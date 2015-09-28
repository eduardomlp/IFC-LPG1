package br.edu.ifcvideira.Lista3;
import java.util.Scanner;

/**
 * Use vírgula para declarar numeros quebrados!!!
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio9 {
    public static void main(String[] args){
        int[] aluno;
        double[] nota1, nota2, mediaAluno;
        double media = 0;
        int aprovados = 0, reprovados = 0, exame = 0;
        
        aluno = new int[255];
        mediaAluno = new double[255];
        nota1 = new double[255];
        nota2 = new double[255];
        
        Scanner ler = new Scanner(System.in);
        
        for(int i = 0; i < 6; i++){
            aluno[i] = i+1;
            System.out.print("Digite a primeira nota do aluno: ");
            nota1[i] = ler.nextDouble();
            System.out.print("Digite a segunda nota do aluno: ");
            nota2[i] = ler.nextDouble();
            mediaAluno[i] = (nota1[i]+nota2[i])/2;
        }
        
        for(int i = 0; i < 6; i++){
            if(mediaAluno[i] <= 5){
                System.out.println("\nO aluno " + aluno[i] + " reprovou!");
                reprovados++;
            }
            else if(mediaAluno[i] >= 7){
                System.out.println("\nO aluno " + aluno[i] + " esta aprovado!!");
                aprovados++;
            }
            else{
                System.out.println("\nO aluno " + aluno[i] + " entrou em recuperação!");
                exame++;
            }
            media += mediaAluno[i];
        }
        System.out.println("\n\nAo todo, tiveram " + aprovados + " alunos aprovado(s), " + reprovados + " aluno(s) reprovados e " + exame + " aluno(s) em recuperação"
        + "\nA média das notas de todos os alunos é igual a: " + media/6);
    }    
}
