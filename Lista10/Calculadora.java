package br.edu.ifcvideira.Lista10;

/**
 * Created by root on 22/11/15.
 */
public class Calculadora extends PropriedadesAzulejo{
    private double areaParede, areaAzulejo;

    public Calculadora(String tipoAzulejo){
        this.setAreaParede();
        this.setAreaAzulejo(tipoAzulejo);
    }

    private void setAreaAzulejo(String tipoAzulejo) {
        if(tipoAzulejo.equals("quadrado")){
           this.areaAzulejo = this.getLarguraAzulejo() * this.getLarguraAzulejo();
        }
        else if(tipoAzulejo.equals("retangular")){
            this.areaAzulejo = this.getLarguraAzulejo() * this.getAlturaAzulejo();
        }
        else if (tipoAzulejo.equals("triangular de lados iguais")){
            this.areaAzulejo = (this.getLarguraAzulejo() * this.getLarguraAzulejo())/2;
        }
        else if(tipoAzulejo.equals("triangular de lados diferentes")){
            this.areaAzulejo = (this.getLarguraAzulejo() * this.getAlturaAzulejo())/2;
        }
    }

    private void setAreaParede(){
        this.areaParede = this.getAlturaParede() + this.getLarguraParede();
    }

    public double getQuantidadeAzulejos(){
        double quantidade = areaParede/areaAzulejo;
        return quantidade;
    }


}
