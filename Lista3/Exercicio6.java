package br.edu.ifcvideira.Lista3;
import java.util.Scanner;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio6 {
    public static void main(String[] args){
        double paisA, paisB;
        int ano;
        
        ano = 0;

        paisA = 90;
        paisB = 140;
        
        while(paisA < paisB){
            paisA += ((paisA*3.5)/100);
            paisB += ((paisB*1)/100);
            ano++;
        }
        
        System.out.println("O pais A vai demorar " + ano + " para passar o pais B");
    }    
}
