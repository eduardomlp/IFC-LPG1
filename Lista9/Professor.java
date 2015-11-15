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
public class Professor extends Funcinario{
    @Override
    public double getSalarioPrimeiraParcela(){
        return getSalario();
    }
 
    @Override
    public double getSalarioSegundaParcela(){
        return 0;
    }
}
