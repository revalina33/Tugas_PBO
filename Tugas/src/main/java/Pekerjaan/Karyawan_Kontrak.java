/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pekerjaan;

/**
 *
 * @author Lenovo
 */
public class Karyawan_Kontrak extends Pekerja {
    
    public Karyawan_Kontrak(String nama, double tarif_perjam) {
        super(nama, tarif_perjam);
    }

    public double calculateSalary(int hoursWorked) {
        return super.calculateSalary(hoursWorked);
        
    }
}
