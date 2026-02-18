package Pertemuan4;

public class LatihanProduk {
    // Deklarasi Konstanta dengan CONSTANT_CASE
    public static final double PAJAK = 0.11;
    public static void main(String[] args) {
        // Deklarasi Variabel dengan camelCase
        String namaProduk = "Laptop Asus";
        int hargaProduk = 7000000;
        int jumlahStok = 15;

        //Variabel boolean menggunakan prefix is
        boolean isActive = true;

        System.out.println("=== INFORMASI PRODUK ===");
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga Satuan : Rp " + hargaProduk);
        System.out.println("Jumlah Stok : " + jumlahStok);
        System.out.println("Status Tersedia :" + isActive);
        System.out.println("---");
        
        //Menghitung total dengan type casting ke int
        int totalStok = (int) (hargaProduk * jumlahStok);
        System.out.println("Total Nilai Stok : Rp " + totalStok);
        int totalPajak = (int) (totalStok * PAJAK);
        System.out.println("Pajak (11%) : Rp " + totalPajak);


    }
    
}
// Nama : Dwi Nayla Cintia
// NIM : D1041241017
// Kelas : B