/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kendaraan;

/**
 *
 * @author Lenovo
 */

public class Kendaraan{
    protected int roda;
    protected int kecepatan_maksimum;
    protected int berat;

    public Kendaraan(int roda, int kecepatan_maksimum, int berat) {
        this.roda = roda;
        this.kecepatan_maksimum = kecepatan_maksimum;
        this.berat = berat;
    }

    public void Informasi() {
        System.out.println("Jumlah Roda: " + roda);
        System.out.println("Kecepatan Maksimum: " + kecepatan_maksimum + " km");
        System.out.println("Berat: " + berat + " kg");
    }
}

