package br.edu.ifcvideira.Lista7;
import java.util.Scanner;

/**
 * 
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio3 {
    public static void main(String[] args) {
        int counter = 0;
        int finalizador = 0;
        
        Scanner ler = new Scanner(System.in);
        Professor professor[] = new Professor[50000];
        
        while(finalizador == 0)
        {
            System.out.println("Deseja adicionar um professor? (sim/nao)");
            String decisao = ler.next();
            decisao = decisao.toLowerCase();
            if("sim".equals(decisao))
            {
                System.out.println("Informe o nome do professor: ");
                String nome = ler.next();
                System.out.println("Informe o departamento dele: ");
                String departamento = ler.next();
                System.out.println("Informe o número de registro: ");
                int registro = ler.nextInt();
                System.out.println("Informe o dia de admissao: ");
                int dia = ler.nextInt();
                System.out.println("Informe o mes de admissao: ");
                int mes = ler.nextInt();
                System.out.println("Informe o ano de admissao: ");
                int ano = ler.nextInt();
                professor[counter] = new Professor(nome, departamento, registro, dia, mes, ano);
                counter++;
            }
            else
            {
                finalizador = 1;
            }
        }
        System.out.println("No total, foram cadastrados " + counter + " professores, sendo eles: ");
        for(int i = 0; i < counter; i++)
        {
            System.out.println("Nome: " + professor[i].getNome() + " Registro: " + professor[i].getRegistro() + " Admitido em: " + professor[i].getData());
        }
    }
}
