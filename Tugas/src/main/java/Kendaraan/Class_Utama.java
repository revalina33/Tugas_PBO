/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kendaraan;

/**
 *
 * @author Lenovo
 */
public class Class_Utama {
    
 public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan(4, 220, 1300);
        System.out.println("Informasi Kendaraan:");
        kendaraan.Informasi();

        Mobil mobil = new Mobil(4, 260, 1400, 4, "Bensin");
        System.out.println("Informasi Mobil:");
        mobil.Informasi();

        Sepeda sepeda = new Sepeda(2, 40, 20, "Cakram", "Aluminium");
        System.out.println("Informasi Sepeda:");
        sepeda.Informasi();
    }
}
