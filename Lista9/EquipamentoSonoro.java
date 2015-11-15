/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifcvideira.Lista9;

/**
 *
 * @author Eduardo Ugolini <edu.ugolini2@gmail.com>
 */
public class EquipamentoSonoro extends Equipamento{
    private int volume;
    private boolean stereo;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public EquipamentoSonoro(){
        volume = 5;
    }
    
    public void mono(){
        stereo = false;
    }
    
    public void stereo(){
        stereo = true;
    }
}
