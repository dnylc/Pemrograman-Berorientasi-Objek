package Pertemuan7;

public class LatihanRefleksi {
    public static void main(String[] args) {

    //Penggunaan while loop untuk mencetak angka dari 1 hingga 5
    System.out.println("=== MENGGUNAKAN WHILE ===");
    int angka = 1; // Inisialisasi angka dengan nilai awal 1
    while (angka <= 5) {
        System.out.print(angka + " "); // Mencetak angka saat ini diikuti oleh spasi
        angka++; // Menambahkan 1 untuk mendapatkan angka berikutnya
    }
    System.out.println(); // Baris baru setelah mencetak angka

    //Penggunaan do-while loop untuk mencetak angka dari 1 hingga 5
    System.out.println("\n=== MENGGUNAKAN DO-WHILE ===");
    angka = 1; // Reset angka ke nilai awal 1
    do {
        System.out.print(angka + " "); // Mencetak angka saat ini diikuti oleh spasi
        angka++; // Menambahkan 1 untuk mendapatkan angka berikutnya
    } while (angka <= 5); // Melanjutkan loop selama angka kurang dari atau sama dengan 5
    System.out.println(); // Baris baru setelah mencetak angka

    //Penggunaan for loop untuk mencetak angka dari 1 hingga 5
    System.out.println("\n=== MENGGUNAKAN FOR ===");
    for (angka = 1; angka <= 5; angka++) { // Inisialisasi angka, kondisi loop, dan increment dalam satu baris
        System.out.print(angka + " "); // Mencetak angka saat ini diikuti oleh spasi
    }
}

}
// Menurut saya jenis loop yang paling mudah dipahami adalah for loop 
// karena semua elemen penting dari loop (inisialisasi, kondisi, dan increment) berada dalam satu baris, sehingga lebih mudah untuk melihat struktur loop secara keseluruhan. 
// Selain itu, for loop sangat cocok untuk iterasi yang jumlahnya sudah diketahui sebelumnya, seperti mencetak angka dari 1 hingga 5.

// Nama : Dwi Nayla Cintia
// NIM : D1041241017
// Kelas : B