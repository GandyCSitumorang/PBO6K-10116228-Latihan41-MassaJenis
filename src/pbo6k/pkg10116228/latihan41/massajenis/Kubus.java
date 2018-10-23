/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116228.latihan41.massajenis;

/**
 *
 * @author GandyChristianSitumorang
 */
public class Kubus {
    
private int sisi;
    private int massa;

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public int hitungVolume (int parSisi){
        int hitungVolume = sisi * sisi * sisi;
        return hitungVolume;
    }
    
    public int hitungMassaJenis (int parMassa, int volume){
        int hitungMassaJenis = volume / massa;
        return hitungMassaJenis;
    }
}

