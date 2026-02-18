package Pertemuan4;

public class LatihanKalkulator {
    public static void main(String[] args) {
        // Deklarasi variabel 
        int angka1 = 25;
        int angka2 = 4;

        System.out.println("=== KALKULATOR ===");
        System.out.println("Angka 1 :" + angka1);
        System.out.println("Angka 2 :" + angka2);
        System.out.println("---");

        // Operasi Aritmatika Penjumlahan
        int hasilPenjumlahan = angka1 + angka2;

        // Operasi Aritmatika Pengurangan
        int hasilPengurangan = angka1 - angka2;

        // Operasi Aritmatika Perkalian
        int hasilPerkalian = angka1 * angka2;

        // Operasi Aritmatika Pembagian int (Integer Division)
        int hasilPembagian = angka1 / angka2;

        // Operasi Aritmatika Sisa Bagi Modulus
        int sisaBagi = angka1 % angka2;

        //Operasi Aritmatika Pembagian  Desimal (Floating-Point Division dengan Type Casting)
        double pembagianDesimal = (double) angka1 / angka2;

        System.out.println("Penjumlahan: " + hasilPenjumlahan);
        System.out.println("Pengurangan: " + hasilPengurangan);
        System.out.println("Perkalian: " + hasilPerkalian);
        System.out.println("Pembagian: " + hasilPembagian);
        System.out.println("Sisa Bagi: " + sisaBagi);
        System.out.println("Pembagian Desimal: " + pembagianDesimal);
    }
}
// Nama : Dwi Nayla Cintia
// NIM : D1041241017
// Kelas : B