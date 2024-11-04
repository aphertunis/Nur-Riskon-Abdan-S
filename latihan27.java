import java.util.Scanner;

public class latihan27 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
          System.out.println("run:");
          System.out.print("Masukkan Kalimat : ");
          String kalimat = scanner.nextLine();

          String hurufBesar = kalimat.toUpperCase();
          String hurufKecil = kalimat.toLowerCase();

          System.out.println("====Hasil Formatting====");
          System.out.println("Huruf Besar : " + hurufBesar);
          System.out.println("Huruf Kecil : " + hurufKecil);
        }

        System.out.println("BUILD SUCCESSFUL (total time: 2 menit");
    }
}