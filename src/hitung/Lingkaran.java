/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hitung;

/**
 *
 * @author hp
 */
public class Lingkaran implements MenghitungBidang {
   private double Phi=3.14;
   double r;

    public Lingkaran(double r) {
        this.r = r;
    }
   
    @Override
    public double keliling() {
        return Phi*r*2;
    }

    @Override
    public double luas() {
        return Phi*r*r;
    }
   
   
}
