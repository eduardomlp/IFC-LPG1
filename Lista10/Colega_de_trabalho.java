package br.edu.ifcvideira.Lista10;

/**
 * Created by root on 23/11/15.
 */
public class Colega_de_trabalho extends Pessoa {
    private String setor;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getAssinatura(){
        String assinatura = "Att. Fulano de tal";
        return assinatura;
    }
}
