package Pertemuan8;

public class LatihanKombinasiLoop {
    public static void main (String[] args){
        System.out.println("=== PENCARIAN KOORDINAT [2,3] ===");
        // Variabel untuk keluar dari outer loop
        boolean isFound = false; 

        for (int baris = 1; baris <= 3; baris++) {

            for (int kolom = 1; kolom <= 5; kolom++) {
                System.out.println("Cek : [" + baris + "," + kolom + "]"); // Mencetak koordinat yang sedang diperiksa
                
                if (baris == 2 && kolom == 3) {
                    System.out.println("Koordinat ditemukan!");
                    isFound = true; // Menandai bahwa koordinat ditemukan
                    break; // Keluar dari inner setelah menemukan koordinat
                }
            }
            if (isFound) { 
                break; // Keluar dari outer jika koordinat sudah ditemukan
            
            }
        }
        System.out.println("Pencarian selesai.");
    }
}
// Nama : Dwi Nayla Cintia
// NIM : D1041241017
// Kelas : B