import java.util.Scanner;

public class SinifiGecmeOrtalamasi {
	public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik, sinir = 55;
        Scanner input = new Scanner(System.in);

        System.out.println("Not Ortalamas� Hesaplama.");

        System.out.print("Matematik Notunuzu Giriniz : ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik = input.nextInt();

        System.out.print("T�rk�e Notunuzu Giriniz : ");
        turkce = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = input.nextInt();

        System.out.print("M�zik Notunuzu Giriniz : ");
        muzik = input.nextInt();


        if (mat < 0 || mat > 100 || fizik < 0 || fizik > 100 ||
                kimya < 0 || kimya > 100 || turkce < 0 || turkce > 100 || muzik < 0 || muzik > 100) {

            System.out.println("Yanl�� giri� yapt�n�z. L�tfen 0-100 aras�nda notlar giriniz.");

        } else {
            double ortalama = (mat + fizik + kimya + turkce + muzik) / 5.0;
            System.out.println("Not ortalamas�: " + ortalama);

            if (ortalama >= sinir) {
                System.out.println("Ortalaman�z 55 �zerinde. Ge�tiniz");

            } else {
                System.out.println("Kald�n�z.");
            }
            System.out.println("Ortalaman�z : " + ortalama);


        }
       }
   }