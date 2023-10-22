/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kendaraan;

/**
 *
 * @author Lenovo
 */
public class Mobil extends Kendaraan {
    private int pintu;
    private String jenis_bahan_bakar;

    public Mobil(int roda , int kecepatan_maksimum, int berat, int pintu, String jenis_bahan_bakar) {
        super(roda, kecepatan_maksimum, berat);
        this.pintu = pintu;
        this.jenis_bahan_bakar= jenis_bahan_bakar;
    }
    

    public void displayInfo() {
        super.Informasi();
        System.out.println("Jumlah Pintu: " + pintu);
        System.out.println("Jenis Bahan Bakar: " + jenis_bahan_bakar);
    }
}


