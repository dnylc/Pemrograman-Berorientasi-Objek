package Pertemuan8;

public class LatihanCariKelipatan {
    public static void main (String[] args) {
        System.out.println("=== CARI KELIPATAN 7 ===");

        // Menggunakan for loop untuk mencari kelipatan pertama dari 7 dalam rentang 1-50
        for (int angka = 1; angka <= 50; angka++){
            System.out.println("Cek : " + angka); // Mencetak angka yang sedang diperiksa

            if (angka % 7 == 0) { // Memeriksa apakah angka merupakan kelipatan dari 7
                System.out.println("Kelipatan 7 pertama : " + angka); 
                 System.out.println("Pencarian selesai.");
                break; //Menghentikan loop setelah menemukan kelipatan pertama dari 7
            }
        }

    }

}
// Nama : Dwi Nayla Cintia
// NIM : D1041241017
// Kelas : B