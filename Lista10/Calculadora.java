package br.edu.ifcvideira.Lista10;

/**
 * Created by root on 22/11/15.
 */
public class Calculadora extends PropriedadesAzulejo{
    private double areaParede, areaAzulejo;

    public Calculadora(){
    }

    public void setAreaAzulejo(String tipoAzulejo) {
        if(tipoAzulejo.equals("Quadrado")){
           this.areaAzulejo = this.getLarguraAzulejo() * this.getLarguraAzulejo();
        }
        else if(tipoAzulejo.equals("Retangular")){
            this.areaAzulejo = this.getLarguraAzulejo() * this.getAlturaAzulejo();
        }
        else if (tipoAzulejo.equals("Triangular de lados iguais")){
            this.areaAzulejo = (this.getLarguraAzulejo() * this.getLarguraAzulejo())/2;
        }
        else if(tipoAzulejo.equals("Triangular de lados diferentes")){
            this.areaAzulejo = (this.getLarguraAzulejo() * this.getAlturaAzulejo())/2;
        }
        setAreaParede();
    }

    private void setAreaParede(){
        this.areaParede = this.getAlturaParede() * this.getLarguraParede();
    }

    public double getQuantidadeAzulejos(){
        double quantidade = areaParede/areaAzulejo;
        return quantidade;
    }


}
