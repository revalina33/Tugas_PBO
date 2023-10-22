/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pekerjaan;

/**
 *
 * @author Lenovo
 */
public class Pekerja {
  protected String nama;
    protected double tarif_perjam;

    public Pekerja(String nama, double tarif_perjam) {
        this.nama = nama;
        this.tarif_perjam = tarif_perjam;
    }

   
    public double calculateSalary(int hoursWorked){
        return tarif_perjam * hoursWorked;

    }
}

