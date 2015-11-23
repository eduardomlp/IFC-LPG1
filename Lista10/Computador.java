package br.edu.ifcvideira.Lista10;

/**
 * Created by root on 22/11/15.
 */
public class Computador extends Produto {
    private double garantiaEstendida;

    public void setGarantiaEstendida(double garantiaEstendida){
        this.garantiaEstendida = garantiaEstendida;
    }

    public double getGarantiaEstendida() {
        return garantiaEstendida;
    }
}
