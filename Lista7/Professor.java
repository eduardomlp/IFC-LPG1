package br.edu.ifcvideira.Lista7;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Professor {
    private String nome;
    private String departamento;
    private int registro;
    private int diaAdmissao;
    private int mesAdmissao;
    private int anoAdmissao;
    
    Professor(String nome, String departamento, int registro, int diaAdmissao, int mesAdmissao, int anoAdmissao)
    {
        this.nome = nome;
        this.departamento = departamento;
        this.registro = registro;
        this.diaAdmissao = diaAdmissao;
        this.mesAdmissao = mesAdmissao;
        this.anoAdmissao = anoAdmissao;
    }
    
    public String getData()
    {
        Data data = new Data(diaAdmissao, mesAdmissao, anoAdmissao);
        String dataAdmissao = data.getData();
        return dataAdmissao;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public int getRegistro()
    {
        return registro;
    }
}
