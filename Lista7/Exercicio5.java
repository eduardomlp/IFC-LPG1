package br.edu.ifcvideira.Lista7;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio5 {
    public static void main(String[] args) {
        Livro l1 = new Livro("Fundamentos da programação de computadores", "Ascencio", 2012);
        Livro l2 = new Livro("Programação com C", "Professor X", 2010);
        Livro l3 = new Livro("Programação com Java", "Professor Y", 2013);
        
        System.out.println("Livro 1 ->  Título: " + l1.getTitulo() + " | Autor: " + l1.getAutor() + " | Ano: " + l1.getAno());
        System.out.println("Livro 2 ->  Título: " + l2.getTitulo() + " | Autor: " + l2.getAutor() + " | Ano: " + l2.getAno());
        System.out.println("Livro 3 ->  Título: " + l3.getTitulo() + " | Autor: " + l3.getAutor() + " | Ano: " + l3.getAno());
    }
}
