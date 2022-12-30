
import java.util.Scanner;

public class notOrtalamasiHesaplayanProgram{
    public static void main(String[] args) {
        // Deðiþkenleri oluþtur
        int mat , fizik , kimya, turkce, tarih, muzik;

        //Scanner sýnýfýmýzý tanýmladýk
        Scanner inp = new Scanner(System.in);

        //Kullanýcýdan deðer al
        System.out.println("Matematik notunuz: ");
        mat = inp.nextInt();

        System.out.println("Fizik notunuz: ");
        fizik = inp.nextInt();

        System.out.println("Kimya notunuz: ");
        kimya = inp.nextInt();

        System.out.println("Türkçe notunuz: ");
        turkce = inp.nextInt();

        System.out.println("Tarih notunuz: " );
        tarih = inp.nextInt();

        System.out.println("Müzik notunuz: ");
        muzik = inp.nextInt();

        double toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanýz: " + sonuc);
        
        String s = sonuc > 60 ? "Sýnýfý Geçti" : "Sýnýfta Kaldý";
        System.out.println(s);
    }
}