package br.edu.ifcvideira.Lista7;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class Porta 
{
    private boolean estado;
    private String cor;
    private float dimensaoX, dimensaoY, dimensaoZ;
    
    Porta(boolean aberta, String cor, float dimensaoX, float dimensaoY, float dimensaoZ)
    {
        this.estado = aberta;
        this.cor = cor;
        this.dimensaoX = dimensaoX;
        this.dimensaoY = dimensaoY;
        this.dimensaoZ = dimensaoZ;
    }
    
    public void mudarEstadoPorta()
    {
        this.estado = true ? false : true;
    }
    
    public void pintarPorta(String cor)
    {
        this.cor = cor;
    }
    
    public String getCor()
    {
        return cor;
    }
        
    public boolean getEstado()
    {
        return estado;
    }
    
    public void setDimensaoX(float dimensao)
    {
        this.dimensaoX = dimensao;
    }
    
    public float getDimensaoX()
    {
        return dimensaoX;
    }
    
    public void setDimensaoY(float dimensao)
    {
        this.dimensaoY = dimensao;
    }
    
    public float getDimensaoY()
    {
        return dimensaoY;
    }
    
    public void setDimensaoZ(float dimensao)
    {
        this.dimensaoZ = dimensao;
    }
    
    public float getDimensaoZ()
    {
        return dimensaoZ;
    }
}
