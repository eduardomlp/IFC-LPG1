package br.edu.ifcvideira.Lista10;

/**
 * Created by root on 22/11/15.
 */
public class Automovel extends Veiculo {
    private double valorDepreciado;
    private int anosUso;

    public void setAnosUso(int anosUso){
        this.anosUso = anosUso;
    }

    public double getValorDepreciado() {
        this.calculateValorDepreciado();
        return valorDepreciado;
    }

    private void calculateValorDepreciado(){
        double valorOriginal = this.getValorVeiculoNovo();
        double valorPercentual = (valorOriginal/100) * 5;
        this.valorDepreciado = valorOriginal - (valorPercentual * anosUso);
    }
}
