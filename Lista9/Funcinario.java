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
public class Funcinario extends Pessoa{
    private int matricula;
    private double salario;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) throws Exception {
        if(salario < 0){
            throw new Exception("Salário não pode ser negativo!");
        }else{
            this.salario = salario;
        }
    }
    
    public double getSalarioPrimeiraParcela(){
        double parcela = (salario / 100) * 60;
        
        return parcela;
    }
 
    public double getSalarioSegundaParcela(){
        double parcela = (salario / 100) * 40;
        
        return parcela;
    }
}
