import java.util.Scanner;

public class latihan28 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
          System.out.print("Masukkan Kalimat: ");
          String kalimat = scanner.nextLine();

          System.out.print("Ganti Kata: ");
          String kataAsli = scanner.nextLine();

          System.out.print("Menjadi Kata: ");
          String kataBaru = scanner.nextLine();

          String kalimatBaru = kalimat.replaceAll(kataAsli, kataBaru);

          System.out.println("\n====Hasil Formatting====");
          System.out.println("Kalimat awal: " + kalimat);
          System.out.println("Kalimat baru: " + kalimatBaru);
        }
    }
}