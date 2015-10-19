package br.edu.ifcvideira.Lista7;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Computador {
    private int processador, ram, tamanhoHD, monitor;
    
    Computador(int processador, int ram, int tamanhoHD, int monitor)
    {
        this.processador = processador;
        this.ram = ram;
        this.tamanhoHD = tamanhoHD;
        this.monitor = monitor;
    }
    
    public int calculaPreco()
    {
        int valorTotal = getPrecoProcessador() + getPrecoRam() + getPrecoHD() + getPrecoMonitor();
        
        return valorTotal;
    }
    
    private int getPrecoProcessador()
    {
        int preco = 0;
        if(processador == 600)
        {
            preco = 700;
        }
        else if(processador == 800)
        {
            preco = 830;
        }
        else
        {
            preco = 910;
        }
        
        return preco;
    }
    
    private int getPrecoRam()
    {
        int preco = (this.ram / 128) * 350;
        
        return preco;
    }
    
    private int getPrecoHD()
    {
        int preco = 0;
        if(tamanhoHD == 20)
        {
            preco = 300;
        }
        else if(tamanhoHD == 40)
        {
            preco = 420;
        }
        else
        {
            preco = 500;
        }
        
        return preco;
    }
    
    private int getPrecoMonitor()
    {
        int preco = 0;
        if(monitor == 15)
        {
            preco = 320;
        }
        else
        {
            preco = 520;
        }
        
        return preco;
    }
}
