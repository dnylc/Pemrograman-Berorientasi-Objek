package Pertemuan6;

public class LatihanHariBulan {
    public static void main(String[] args) {

        int month = 4; // Contoh bulan (1-12)
        String monthName; // Variabel untuk menyimpan nama bulan
        int days; // Variabel untuk menyimpan jumlah hari dalam bulan

        // SWITCH 1 : nama bulan
        switch (month) {
            case 1: 
                monthName = "Januari"; 
                break;
            case 2:
                monthName = "Februari";
                break;
            case 3: 
                monthName = "Maret"; 
                break;
            case 4: 
                monthName = "April"; 
                break;
            case 5: 
                monthName = "Mei"; 
                break;
            case 6: 
                monthName = "Juni"; 
                break;
            case 7:     
                monthName = "Juli"; 
                break;
            case 8: 
                monthName = "Agustus"; 
                break;
            case 9: 
                monthName = "September"; 
                break;
            case 10: 
                monthName = "Oktober"; 
                break;
            case 11: 
                monthName = "November"; 
                break;
            case 12: 
                monthName = "Desember"; 
                break;
            default:
                monthName = "Bulan tidak valid";
                break;
        }

        // SWITCH 2 : jumlah hari dalam bulan
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;

            case 2:
                days = 28;
                break;
            default:
                days = 0;
                break;
        }

        System.out.println("=== JUMLAH HARI DALAM BULAN ===");
        System.out.println("Bulan: " + monthName + " (bulan ke-" + month + ")");
        System.out.println("Jumlah hari: " + days + " hari");
    }
}
// Nama : Dwi Nayla Cintia
// NIM : D1041241017
// Kelas : B


