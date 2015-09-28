package br.edu.ifcvideira.Lista5;
import java.util.*;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio8 {
    private static Scanner ler = new Scanner(System.in);
    public static ArrayList<String> alunos = new ArrayList<>();
    
    public static void main(String[] args) {
        setName();
        System.out.println("Deseja adicionar mais alunos? (S/N)");
        String temp = ler.nextLine();
        if("s".equals(temp) || "S".equals(temp)){
            setName();
        }
        else{
            System.out.println("Deseja consultar se um aluno está presente na lista? (S/N)");
            String temporary = ler.nextLine();
            if("s".equals(temporary) || "S".equals(temporary)){
                getName();
            }
            else{
                System.out.println("Deseja inserir um aluno em uma posição específica do array? (S/N)");
                String tmp = ler.nextLine();
                if("s".equals(tmp) || "S".equals(tmp)){
                    updateName();
                }
                else{
                    System.out.println("Deseja excluir algum aluno do array? (S/N)");
                    String tmp2 = ler.nextLine();
                    if("s".equals(tmp2) || "S".equals(tmp2)){
                        deleteName();
                    }
                }
            }
        }
        
    }
    
    private static void setName(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o nome do aluno: ");
        alunos.add(ler.nextLine());
    }
    
    private static void getName(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o nome do aluno: ");
        String temp = ler.nextLine();
        String returnString;
        int verifier = 0;
        
        for(int i = 0; i < alunos.size(); i++){
            if(temp.equals(alunos.get(i))){
                verifier = 1;
            }
            else{
                verifier = 0;
            }
        }
        
        if(verifier == 1){
            System.out.println("Aluno está na lista!");
        }
        else{
            System.out.println("Aluno não está na lista!");
        }
    }
    
    private static void updateName(){
        System.out.print("Informe a posição que deseja alterar: ");
        Scanner ler = new Scanner(System.in);
        int temp = ler.nextInt();
        System.out.print("Informe o nome do aluno: ");
        String name = ler.nextLine();
        
        alunos.add(temp, name);
    }
    
    private static void deleteName(){
        System.out.print("Informe o nome do aluno que deseja excluir: ");
        Scanner ler = new Scanner(System.in);
        String name = ler.nextLine();
        
        alunos.remove(name);
    }
}
