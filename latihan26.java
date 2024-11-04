import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class latihan26 {
    public static void main(String[] args) {
        Date sekarang = new Date();

        @SuppressWarnings("deprecation")
        SimpleDateFormat formatTanggal = new SimpleDateFormat("'Hari ini adalah hari : 'EEEE, dd MMM yyyy HH:mm:ss", new Locale("id", "ID"));

        System.out.println(formatTanggal.format(sekarang));
    }
}
