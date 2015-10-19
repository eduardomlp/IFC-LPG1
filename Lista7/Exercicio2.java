package br.edu.ifcvideira.Lista7;
import java.util.Scanner;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Exercicio2 {
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        Porta porta[] = new Porta[3];
        int contaPortas = 0;
        
        for(int i = 0; i < 3; i++)
        {
            
            System.out.println("Informe o estado da porta(aberta/fechada): ");
            String estado = ler.next();
            estado = estado.toLowerCase();
            boolean estadoFinal = false;
            if("aberta".equals(estado))
            {
                estadoFinal = true;
            }
            else
            {
                estadoFinal = false;
            }
            System.out.println("Informe a cor da porta: ");
            String cor = ler.next();
            System.out.println("Informe a dimensão X da porta: ");
            float dimensaoX = ler.nextFloat();
            System.out.println("Informe a dimensão Y da porta: ");
            float dimensaoY = ler.nextFloat();
            System.out.println("Informe a dimensão Z da porta: ");
            float dimensaoZ = ler.nextFloat();
            
            porta[i] = new Porta(estadoFinal, cor, dimensaoX, dimensaoY, dimensaoZ);
        }
        
        for(int i = 0; i < 3; i++)
        {
            System.out.println("Mudar o estado da " + (i+1) + " porta?(sim/nao) ");
            String estado = ler.next();
            estado = estado.toLowerCase();
            boolean estadoFinal = false;
            if(estado == "sim")
            {
                porta[i].mudarEstadoPorta();
            }
            System.out.println("Informe a nova cor da " + (i+1) + " porta: ");
            String cor = ler.next();
            porta[i].pintarPorta(cor);
            System.out.println("Informe a nova dimensao X da " + (i+1) + " porta: ");
            float dimensaoX = ler.nextFloat();
            porta[i].setDimensaoX(dimensaoX);
            System.out.println("Informe a nova dimensao Y da " + (i+1) + " porta: ");
            float dimensaoY = ler.nextFloat();
            porta[i].setDimensaoY(dimensaoY);
            System.out.println("Informe a nova dimensao Z da " + (i+1) + " porta: ");
            float dimensaoZ = ler.nextFloat();
            porta[i].setDimensaoZ(dimensaoZ);
            if(porta[i].getEstado())
            {
                contaPortas++;
            }
        }
        
        System.out.println("Existem " + contaPortas + " portas abertas!");
        
        for(int i = 0; i < 3; i++)
        {
            String estado = "Fechada";
            if(porta[i].getEstado())
            {
                estado = "Aberta";
            }
            System.out.println("A " + 
                    (i+1) + 
                    " porta está " + 
                    estado + 
                    " sua cor é " + 
                    porta[i].getCor() + 
                    " suas dimensões são: " + 
                    porta[i].getDimensaoX() + 
                    " , " + 
                    porta[i].getDimensaoY() + 
                    " , " + 
                    porta[i].getDimensaoZ());
        }
    }
}
