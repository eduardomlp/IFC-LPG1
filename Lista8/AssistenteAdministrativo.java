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
public class AssistenteAdministrativo extends Funcionario{
    private int matricula;
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }
    
    public double getSalarioEBonusNoturno(){
        double bonus = this.getSalario() + ((this.getSalario()/100)*30);
        
        return bonus;
    }

}
