package br.edu.ifcvideira.Lista4;
import java.util.Scanner;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio7 {
    public static void main(String[] args){
        double[] nota1, nota2, nota3;
        double notaMax = 0, notaMin = 500000000;
        String[] name;
        int alunos, j = 0, k = 0;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Informe a quantidade de alunos: ");
        alunos = ler.nextInt();
        
        nota1 = new double[alunos];
        nota2 = new double[alunos];
        nota3 = new double[alunos];
        name = new String[alunos];
        
        for(int i = 0; i < alunos; i++){
            System.out.print("Informe o nome do aluno: ");
            name[i] = ler.next();
            System.out.print("Informe a primeira nota do aluno " + name[i] + ": ");
            nota1[i] = ler.nextDouble();
            System.out.print("Informe a segunda nota do aluno " + name[i] + ": ");
            nota2[i] = ler.nextDouble();
            System.out.print("Informe a terceira nota do aluno " + name[i] + ": ");
            nota3[i] = ler.nextDouble();
        }
        
        for(int i = 0; i < alunos; i++){
            if(nota1[i] > notaMax){
                notaMax = nota1[i];
                j = i;
            }
            if(nota2[i] > notaMax){
                notaMax = nota2[i];
                j = i;
            }
            if(nota3[i] > notaMax){
                notaMax = nota3[i];
                j = i;
            }
            
            if(nota1[i] < notaMin){
                notaMin = nota1[i];
                k = i;
            }
            if(nota2[i] < notaMin){
                notaMin = nota2[i];
                k = i;
            }
            if(nota3[i] < notaMin){
                notaMin = nota3[i];
                k = i;
            }
        }
        
        System.out.println("A maior nota é " + notaMax + " e o aluno que tirou essa nota foi " + name[j]);
        System.out.println("A menor nota é " + notaMin + " e o aluno que tirou essa nota foi " + name[k]);
    }
}
