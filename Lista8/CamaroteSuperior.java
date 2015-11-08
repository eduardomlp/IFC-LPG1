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
public class CamaroteSuperior extends VIP{
    private int localizacao;

    public int getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(int localizacao) {
        this.localizacao = localizacao;
    }
    
    public double getValorCamarote(){
        return (this.getNovoValor() + 300); //300 = valor adicional do camarote 
    }
}
