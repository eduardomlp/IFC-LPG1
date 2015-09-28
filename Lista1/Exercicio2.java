package br.edu.ifcvideira.Lista1;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Exercicio2 {
    public static void main(String[] args){
        double altura, largura, base, area;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print(" Informe a base do cubo retângular: ");
        base = ler.nextDouble();
        
        System.out.print(" Informe a altura do cubo retângular: ");
        altura = ler.nextDouble();
        
        System.out.print(" Informe a largura do cubo retângular: ");
        largura = ler.nextDouble();
        
        area = ((altura*largura)+(altura*base)+(largura*base))*2;
        
        System.out.println("A área do cubo retângular informado é de: " + area);
    }
    
}
