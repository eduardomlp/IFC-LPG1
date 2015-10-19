package br.edu.ifcvideira.Lista7;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Livro {
    private String titulo, autor;
    private int ano;
    
    Livro(String titulo, String autor, int ano)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }
    
    public String getTitulo()
    {
        return titulo;
    }
    
    public String getAutor()
    {
        return autor;
    }
    
    public int getAno()
    {
        return ano;
    }
}
