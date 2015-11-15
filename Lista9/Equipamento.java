/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifcvideira.Lista9;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Equipamento {
    private boolean ligado;

    public boolean isLigado() {
        return ligado;
    }
    
    public void liga(){
        ligado = true;
    }
    
    public void desliga(){
        ligado = false;
    }
}
