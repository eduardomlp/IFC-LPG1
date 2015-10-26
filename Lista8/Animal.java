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
public class Animal {
    protected String nome, raca;
    protected boolean estado = false;
    
    public void changeEstado(){
        this.estado = !this.estado;
    }

    public String getNome() {
        return nome;
    }
    
    public boolean getEstado(){
        return estado;
    }
}
