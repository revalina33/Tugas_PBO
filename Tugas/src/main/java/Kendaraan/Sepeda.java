/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kendaraan;

/**
 *
 * @author Lenovo
 */
public class Sepeda extends Kendaraan {
    private String jenis_rem;
    private String jenis_rangka;

    public Sepeda(int roda, int kecepatan_maksimum, int berat, String jenis_rem, String jenis_rangka) {
        super(roda, kecepatan_maksimum, berat);
        this.jenis_rem = jenis_rem;
        this.jenis_rangka = jenis_rangka;
    }

  
    public void displayInfo() {
        super.Informasi();
        System.out.println("Jenis Rem: " + jenis_rem);
        System.out.println("Jenis Rangka: " + jenis_rangka);
    }
}

