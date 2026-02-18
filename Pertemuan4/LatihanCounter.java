package Pertemuan4;

public class LatihanCounter {
    public static void main(String[] args) {
        int counter = 10;

        System.out.println("=== COUNTER ===");
        System.out.println("Nilai Awal: " + counter);
    

        // Increment (menambah 2x)
        counter++;
        counter++;
        System.out.println("Setelah ++ (2x): " + counter);

        // Decrement (mengurangi)
        counter--;
        System.out.println("Setelah --: " + counter);

        // Compound Assignment (+=)
        counter += 5;
        System.out.println("Setelah += 5: " + counter);

        // Compound Assignment (-=)
        counter -= 3;
        System.out.println("Setelah -= 3: " + counter);

        // Compound Assignment (*=)
        counter *= 2;
        System.out.println("Setelah *= 2: " + counter);
    }
    
}
// Nama : Dwi Nayla Cintia
// NIM : D1041241017
// Kelas : B