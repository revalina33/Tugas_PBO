/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pekerjaan;

/**
 *
 * @author Lenovo
 */
public class Manajer extends Pekerja {
    private double bonus;

    public Manajer(String nama, double tarif_perjam, double bonus) {
        super(nama, tarif_perjam);
        this.bonus = bonus;
    }

 
    public double calculateSalary(int hoursWorked) {
        return super.calculateSalary(hoursWorked)+bonus;
   }

}
