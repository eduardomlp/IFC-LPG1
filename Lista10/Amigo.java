package br.edu.ifcvideira.Lista10;

/**
 * Created by root on 23/11/15.
 */
public class Amigo extends Pessoa {
    private String telefonePessoal;

    public String getTelefonePessoal() {
        return telefonePessoal;
    }

    public void setTelefonePessoal(String telefonePessoal) {
        this.telefonePessoal = telefonePessoal;
    }

    public String getAssinatura(){
        String assinatura = "Abraços. Fulano de tal";
        return assinatura;
    }
}
