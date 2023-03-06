/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hitung;

/**
 *
 * @author hp
 */
public class Tabung extends Lingkaran implements MenghitungRuang {
    double tinggi;

    public Tabung(double tinggi, double r) {
        super(r);
        this.tinggi = tinggi;
    }

    @Override
    public double volume() {
        return luas()*tinggi;
    }

    @Override
    public double luasPermukaan() {
        return luas()*2+keliling()*tinggi;
    }
    
    
}

