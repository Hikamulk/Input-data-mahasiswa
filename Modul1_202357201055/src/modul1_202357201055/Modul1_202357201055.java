package modul1_202357201055;
import java.util.Scanner;
public class Modul1_202357201055 {
    public static void main(String[] args) {
        // Inisialisai Array untuk menyimpan data mahasiswa
        String[][] dataMahasiswa = new String[3][4]; // Menggunakan array 2 dimensi dengan 3 baris dan 4 kolom
        
        // Input data mahasiswa
        inputDataMahasiswa(dataMahasiswa);
        
        // Menampilkan data mahasiswa beserta predikat
        tampilkanDataMahasiswa(dataMahasiswa);
    }
    
    // Method untuk menginput data mahasiswa
    public static void inputDataMahasiswa(String[][] data) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < data.length; i++) {
            System.out.println("Masukkan data untuk mahasiswa ke-" + (i + 1));
            System.out.print("Nama: ");
            data[i][0] = scanner.nextLine();
            System.out.print("Program Studi: ");
            data[i][1] = scanner.nextLine();
            System.out.print("Nilai: ");
            data[i][2] = scanner.nextLine();
        }
        
        scanner.close();
    }
    
    // Method untuk menampilkan data mahasiswa beserta predikat
    public static void tampilkanDataMahasiswa(String[][] data) {
        System.out.println("\nData Mahasiswa:");
        System.out.println("--------------------------------------------------------");
        System.out.println("| No | Nama            | Program Studi | Nilai | Predikat |");
        System.out.println("--------------------------------------------------------");
        
        for (int i = 0; i < data.length; i++) {
            System.out.printf("|%-2d|%-15s|%-13s|%-5s|%-8s|\n", (i + 1),data[i][0],data[i][1],data[i][2],hitungPredikat(data[i][2]));
        }
        
        System.out.println("--------------------------------------------------------");
    }
    
    // Method untuk menghitung predikat berdasarkan nilai
    public static String hitungPredikat(String nilai) {
        double nilaiAngka = Double.parseDouble(nilai);
        
        if (nilaiAngka >= 80) {
            return "A";
        } else if (nilaiAngka >= 70) {
            return "B";
        } else if (nilaiAngka >= 60) {
            return "C";
        } else {
            return "D";
        }
    }
}