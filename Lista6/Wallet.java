package br.edu.ifcvideira.Lista6;
import br.edu.ifcvideira.Lista6.Wallet;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Wallet {
    private double salarioMin;
    private double quantidadeQuilowatts;
    private double KWValue;
    private double toPayValue;
    private double newToPayValue;
    
    public void setSalarioMin(double salario){
        this.salarioMin = salario;
    }
    
    public void setQuantidadeKW(double quantidade){
        this.quantidadeQuilowatts = quantidade;
    }
    
    private double getKWValue(){
        this.KWValue = this.salarioMin/7;
        this.KWValue /= 100;
        return this.KWValue;
    }
    
    public double getToPayValue(){
        getKWValue();
        this.toPayValue = this.KWValue * this.quantidadeQuilowatts;
        return this.toPayValue;
    }
    
    public double getNewToPayValue(){
        this.newToPayValue = this.toPayValue/100;
        this.newToPayValue *= 10;
        this.newToPayValue = this.toPayValue - this.newToPayValue;
        return this.newToPayValue;
    }
    
}
