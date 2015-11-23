package br.edu.ifcvideira.Lista10;

/**
 * Created by root on 23/11/15.
 */
public class Parente extends Pessoa {
    private String parentesco;

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getAssinatura() {
        String assinatura = "Até mais. Fulano de tal";
        return assinatura;
    }
}
