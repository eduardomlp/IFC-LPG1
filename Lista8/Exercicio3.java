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
public class Exercicio3 {
    public static void main(String[] args) {                
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Informe o tipo de ingresso(VIP/Normal): ");
        
        if(ler.next().toLowerCase().equals("vip")){
            System.out.println("É camarote?(I = inferior | S = superior | N = não)");
            String tipoCamarote = ler.next();
            if(tipoCamarote.toLowerCase().equals("i")){
                CamaroteInferior camarote = new CamaroteInferior();
                camarote.setLocalizacao(5);
                camarote.setValorIngresso(80);
                camarote.setNovoValor(25);
                System.out.println("Valor = " + camarote.getNovoValor()+ " Localização = " + camarote.getLocalizacao());
            }
            else if(tipoCamarote.toLowerCase().equals("s")){
                CamaroteSuperior camarote = new CamaroteSuperior();
                camarote.setLocalizacao(5);
                camarote.setValorIngresso(80);
                System.out.println("Valor = " + camarote.getValorCamarote() + " Localização = " + camarote.getLocalizacao());
            }
            else{
                VIP ingresso = new VIP();
                ingresso.setValorIngresso(80);
                ingresso.setNovoValor(25);
                System.out.println("Valor = " + ingresso.getNovoValor());
            }
        }else{
            Normal ingresso = new Normal();
            ingresso.setValorIngresso(80);
            System.out.println("Valor = " + ingresso.getIngressoNormal());
        }
    }
}
