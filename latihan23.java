import java.util.Scanner;

public class latihan23 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
          System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
          System.out.print("Masukkan Nama Petugas : ");
          String namaPetugas = input.nextLine();
          
          System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
          int jumlahMahasiswa = input.nextInt();
          
          int[] nilaiMahasiswa = new int[jumlahMahasiswa];
          
          for (int i = 0; i < jumlahMahasiswa; i++) {
              System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i + 1) + " : ");
              nilaiMahasiswa[i] = input.nextInt();
          }
          
          int nilaiTerbesar = nilaiMahasiswa[0];
          int nilaiTerkecil = nilaiMahasiswa[0];
          
          for (int i = 1; i < jumlahMahasiswa; i++) {
              if (nilaiMahasiswa[i] > nilaiTerbesar) {
                  nilaiTerbesar = nilaiMahasiswa[i];
              }
              if (nilaiMahasiswa[i] < nilaiTerkecil) {
                  nilaiTerkecil = nilaiMahasiswa[i];
              }
          }
          
          System.out.println("\n=====Hasil Nilai Mahasiswa=====");
          for (int i = 0; i < jumlahMahasiswa; i++) {
              System.out.println("Nilai Mahasiswa Ke-" + (i + 1) + " = " + nilaiMahasiswa[i]);
          }
          
          System.out.println("\nNilai Terbesar adalah " + nilaiTerbesar);
          System.out.println("Nilai Terkecil adalah " + nilaiTerkecil);
          System.out.println("\nPetugas : " + namaPetugas);
        }
        
        System.out.println("BUILD SUCCESSFUL");
    }
}
