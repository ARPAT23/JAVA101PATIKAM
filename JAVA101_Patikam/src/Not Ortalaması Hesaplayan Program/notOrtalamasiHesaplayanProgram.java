
import java.util.Scanner;

public class notOrtalamasiHesaplayanProgram{
    public static void main(String[] args) {
        // De�i�kenleri olu�tur
        int mat , fizik , kimya, turkce, tarih, muzik;

        //Scanner s�n�f�m�z� tan�mlad�k
        Scanner inp = new Scanner(System.in);

        //Kullan�c�dan de�er al
        System.out.println("Matematik notunuz: ");
        mat = inp.nextInt();

        System.out.println("Fizik notunuz: ");
        fizik = inp.nextInt();

        System.out.println("Kimya notunuz: ");
        kimya = inp.nextInt();

        System.out.println("T�rk�e notunuz: ");
        turkce = inp.nextInt();

        System.out.println("Tarih notunuz: " );
        tarih = inp.nextInt();

        System.out.println("M�zik notunuz: ");
        muzik = inp.nextInt();

        double toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalaman�z: " + sonuc);
        
        String s = sonuc > 60 ? "S�n�f� Ge�ti" : "S�n�fta Kald�";
        System.out.println(s);
    }
}