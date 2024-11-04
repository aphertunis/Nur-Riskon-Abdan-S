public class latihan19 {
  public static void main(String[] args) {
      double saldoAwal = 2500000;
      double bungaPerBulan = 0.15;
      int lamaBulan = 6;

      for (int bulan = 1; bulan <= lamaBulan; bulan++) {
          saldoAwal += saldoAwal * bungaPerBulan;
          System.out.printf("Saldo di bulan ke-%d Rp.%,.0f%n", bulan, saldoAwal);
      }
  }
}
