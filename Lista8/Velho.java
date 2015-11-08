/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifcvideira.Lista8;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Velho extends Imovel{
    private double desconto;
    
    public void setValorDesconto(double desconto){
        this.desconto = desconto;
        this.setPreco(this.getPreco() - desconto);
    }
    
    public double getValorDesconto(){
        return desconto;
    }
}
