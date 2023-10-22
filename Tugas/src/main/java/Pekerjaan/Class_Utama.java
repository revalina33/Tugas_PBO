/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pekerjaan;

/**
 *
 * @author Lenovo
 */
public class Class_Utama {

    public static void main(String[] args) {
        Pekerja pekerja = new Pekerja("Anton", 15);
        Manajer manajer = new Manajer("Debora", 40, 1000);
        Karyawan_Kontrak karyawan_kontrak = new Karyawan_Kontrak("Bimo", 10);

        int hoursWorked = 40;

        // Polymorphism: Menghitung gaji berdasarkan jenis pekerjaan
        double pekerjaSalary = pekerja.calculateSalary(hoursWorked);
        double manajerSalary = manajer.calculateSalary(hoursWorked);
        double karyawan_kontrakSalary = karyawan_kontrak.calculateSalary(hoursWorked);

        System.out.println("nama pekerja: "+ pekerja.nama +   ",Gaji: " + pekerjaSalary);
        System.out.println("nama manajer: "+manajer.nama +   ",Gaji: " + manajerSalary);
        System.out.println("nama karywan kontrak: "+karyawan_kontrak.nama +   "Gaji : " + karyawan_kontrakSalary);
    }
}


