import java.util.Scanner;

public class latihan21 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan Banyaknya Mahasiswa: ");
            int jumlahMahasiswa = input.nextInt();
            
            double totalNilai = 0;
            
            for (int i = 1; i <= jumlahMahasiswa; i++) {
                System.out.print("Nilai Mahasiswa ke-" + i + ": ");
                double nilai = input.nextDouble();
                totalNilai += nilai;
            }
            
            double rataRata = totalNilai / jumlahMahasiswa;
            System.out.printf("Maka, Rata-rata Nilainya adalah %.1f%n", rataRata);
            
            System.out.println("Developed by : Nur Riskon Abdan Syakuro");
        }
    }
}
