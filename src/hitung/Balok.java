/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hitung;

/**
 *
 * @author hp
 */
public class Balok extends PersegiPanjang implements MenghitungRuang {
    int tinggi;
   
    public Balok(int tinggi, double panjang, double lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    @Override
    public double volume() {
        return luas()*tinggi;
    }

    @Override
    public double luasPermukaan() {
        return (luas()+panjang*tinggi+lebar*tinggi)*2;
    }
    
    
}
