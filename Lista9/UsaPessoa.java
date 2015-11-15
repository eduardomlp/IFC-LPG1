/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifcvideira.Lista9;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class UsaPessoa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Informe o nome da pessoa: ");
        String nome = ler.next();
        System.out.print("Informe o sobrenome da pessoa: ");
        Pessoa pessoa1 = new Pessoa(nome, ler.next());
        
        System.out.print("Informe o nome da pessoa: ");
        nome = ler.next();
        System.out.print("Informe o sobrenome da pessoa: ");
        String sobrenome  = ler.next();
        System.out.print("Informe o salário da pessoa: ");
        double salario = ler.nextDouble();
        Funcinario pessoa2 = new Funcinario();
        pessoa2.setNome(nome);
        pessoa2.setSobrenome(sobrenome);
        try{
            pessoa2.setSalario(salario);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        System.out.print("Informe o nome da pessoa: ");
        nome = ler.next();
        System.out.print("Informe o sobrenome da pessoa: ");
        sobrenome  = ler.next();
        System.out.print("Informe o salário da pessoa: ");
        salario = ler.nextDouble();
        Professor pessoa3 = new Professor();
        pessoa3.setNome(nome);
        pessoa3.setSobrenome(sobrenome);
        try{
            pessoa3.setSalario(salario);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        
        System.out.println();
        System.out.println("Pessoa 1 = " + pessoa1.getNomeCompleto());
        System.out.println("Pessoa 2 = " + pessoa2.getNomeCompleto() + "   Salário 1 = " + pessoa2.getSalarioPrimeiraParcela() + "   Salário 2 = " + pessoa2.getSalarioSegundaParcela());
        System.out.println("Pessoa 3 = " + pessoa3.getNomeCompleto() + "   Salário 1 = " + pessoa3.getSalarioPrimeiraParcela() + "   Salário 2 = " + pessoa3.getSalarioSegundaParcela());
    }
}
    