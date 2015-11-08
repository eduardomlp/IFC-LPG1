/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifcvideira.Lista8;

import java.util.Scanner;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Double preco;
        int endereco;
        
        System.out.print("Informe o valor do imóvel: ");
        preco = ler.nextDouble();
        System.out.print("Informe o endereço do imóvel: ");
        endereco = ler.nextInt();
        
        System.out.println("O imóvel é novo ou velho?");
        
        if(ler.next().toLowerCase().equals("novo")){
            Novo novo = new Novo();
            novo.setEndereco(endereco);
            novo.setPreco(preco);
            novo.setValorAdicional(300);
            System.out.println("Valor final do imóvel = " + novo.getPreco() + " Endereço = " + novo.getEndereco());
            System.out.println("O valor aumentou, pois teve um acréscimo de " + novo.getValorAdicional() + " reais, por ser novo!");
            
        }else{
            Velho velho = new Velho();
            velho.setEndereco(endereco);
            velho.setPreco(preco);
            velho.setValorDesconto(300);
            System.out.println("Valor final do imóvel = " + velho.getPreco() + " Endereço = " + velho.getEndereco());
            System.out.println("O valor diminuiu, pois teve um desconto de " + velho.getValorDesconto()+ " reais, por ser velho!");
            
        }
    }
}
