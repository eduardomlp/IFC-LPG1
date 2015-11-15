/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifcvideira.Lista9;

import java.util.Scanner;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Pessoa pessoa1 = new Pessoa();
        
        System.out.print("Informe o nome da pessoa: ");
        pessoa1.setNome(ler.next());
        System.out.print("Informe o sobrenome da pessoa: ");
        pessoa1.setSobrenome(ler.next());
        
        System.out.print("Informe o nome da segunda pessoa: ");
        String nome = ler.next();
        System.out.print("Informe o sobrenome da segunda pessoa: ");
        Pessoa pessoa2 = new Pessoa(nome, ler.next());
        
        System.out.println();
        System.out.println("Pessoa criada com construtor vazio = " + pessoa1.getNomeCompleto() + "\n" +
        "Pessoa criada com construtor contendo parametros = " + pessoa2.getNomeCompleto());
    }
}
    