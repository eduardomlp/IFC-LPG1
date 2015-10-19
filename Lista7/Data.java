package br.edu.ifcvideira.Lista7;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Data {
    private int dia, mes, ano;
    
    Data(int dia, int mes, int ano)
    {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public String getData()
    {
        String data = dia + "/" + mes + "/" + ano;
        return data;
    }
}
