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
public class Cachorro extends Animal{
    private int latidas;

    public Cachorro(String nome){
        this.nome = nome;
    }
    
    public int getLatidas() {
        return latidas;
    }

    public void late() {
        this.latidas++;
    }
}
