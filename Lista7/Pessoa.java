package br.edu.ifcvideira.Lista7;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Pessoa {
    private String nome;
    private int idade;
    
    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public void fazAniversario(){
        idade++;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getIdade(){
        return idade;
    }
}
