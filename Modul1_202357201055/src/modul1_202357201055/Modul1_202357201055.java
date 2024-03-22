package modul1_202357201055;
import javax.swing.JOptionPane;
public class Modul1_202357201055 {
    public static void main(String[] args) {
        int data[][] = {{4, 6, 4, 2, 8, 4, 2, 10}, {4, 6, 4, 2, 8, 4, 2, 10}};
        // Menampilkan array
        System.out.println("Array Awal:");
        printArray(data);
        
        // Menghitung nilai rata-rata array
        double average = calculateAverage(data);
        System.out.println("\nRata-rata array: " + average);
        
        // Pencarian posisi index dari elemen array dan pertukaran nilai
        searchAndReplace(data);
        
        // Menampilkan array setelah pertukaran nilai
        System.out.println("\nArray Setelah Pertukaran:");
        printArray(data);
        
        // Menjumlahkan semua elemen yang memiliki indeks kolom ganjil
        int sumOddColumn = sumOfOddColumns(data);
        System.out.println("\nJumlah elemen pada kolom ganjil: " + sumOddColumn);
    }
    
    // Method untuk menampilkan array
    public static void printArray(int[][] arr) {
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    
    // Method untuk menghitung rata-rata array
    public static double calculateAverage(int[][] arr) {
        int sum = 0;
        int count = 0;
        for (int[] row : arr) {
            for (int num : row) {
                sum += num;
                count++;
            }
        }
        return (double) sum / count;
    }
    
    // Method untuk mencari posisi index dari elemen array dan pertukaran nilai
    public static void searchAndReplace(int[][] arr) {
        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr[a].length; b++) {
                int newValue = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai baru untuk posisi [" + a + "][" + b + "]: "));
                arr[a][b] = newValue;
            }
        }
    }
    
    // Method untuk menjumlahkan semua elemen yang memiliki indeks kolom ganjil
    public static int sumOfOddColumns(int[][] arr) {
        int sum = 0;
        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr[a].length; b++) {
                if (b % 2 != 0) { // Kolom ganjil
                    sum += arr[a][b];
                }
            }
        }
        return sum;
    }
}
