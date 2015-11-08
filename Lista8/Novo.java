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
public class Novo extends Imovel{
    private double adicional;
    
    public void setValorAdicional(double adicional){
        this.adicional = adicional;
        this.setPreco(this.getPreco() + adicional);
    }
    
    public double getValorAdicional(){
        return adicional;
    }
}
