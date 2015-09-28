package br.edu.ifcvideira.Lista6;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Changer {
    private int number1;
    private int number2;
    private int temp;
    
    public void setFirstNumber(int n1){
        this.number1 = n1;
    }
    
    public void setSecondNumber(int n2){
        this.number2 = n2;
    }
    
    public void changeValues(){
        this.temp = this.number1;
        this.number1 = this.number2;
        this.number2 = this.temp;
    }
    
    public int getFirstNumber(){
        return this.number1;
    }
    
    public int getSecondNumber(){
        return this.number2;
    }
}
