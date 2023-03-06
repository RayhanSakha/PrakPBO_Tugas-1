/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hitung;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int loop=0;
        // TODO code application logic here
        do {
            System.out.println("==========");
            System.out.println("Menu Utama");
            System.out.println("==========");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("3. Exit");
            System.out.print("Pilihan : ");
            int pilihan =input.nextInt();
            switch(pilihan) {
            case 1:
                System.out.print("Panjang : ");
                double panjang = input.nextInt();
                System.out.print("Lebar : ");
                double lebar = input.nextInt();
                System.out.print("Tinggi : ");
                int tinggi = input.nextInt();
                Balok kothak =new Balok(tinggi,panjang,lebar);
                System.out.println("Keliling Persegi Panjang : "+kothak.keliling());
                System.out.println("Luas Persegi Panjang : "+kothak.luas());
                System.out.println("Luas Permukaan Balok : "+kothak.luasPermukaan());
                System.out.println("Volume Balok : "+kothak.volume());
             break;
            case 2:
                System.out.print("Jari Jari : ");
                int r = input.nextInt();
                System.out.print("tinggi : ");
                int length = input.nextInt();
                Tabung tube =new Tabung(length,r);
                System.out.println("Keliling Lingkaran : "+tube.keliling());
                System.out.println("Luas Lingkaran : "+tube.luas());
                System.out.println("Luas Permukaan Tabung : "+tube.luasPermukaan());
                System.out.println("Volue Tabung : "+tube.volume());
             break;
            case 3:
               System.exit(0);
             break;
            default:
               System.exit(0);
          }
            System.out.print("Apakah ingin mengulang?(iya = 1 | tidak = 0)");
            loop = input.nextInt();
        }
        while (loop==1);
    }
    
}
