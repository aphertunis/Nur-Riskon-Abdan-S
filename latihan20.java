public class latihan20 {
  public static void main(String[] args) {
      double saldoAwal = 3500000;
      double bungaPerBulan = 0.08;
      double saldoTarget = 6000000;
      int bulan = 1;


      while (saldoAwal < saldoTarget) {
          saldoAwal += saldoAwal * bungaPerBulan;
          System.out.printf("Saldo di bulan ke-%d Rp.%,.0f%n", bulan, saldoAwal);
          bulan++;
      }
  }
}
