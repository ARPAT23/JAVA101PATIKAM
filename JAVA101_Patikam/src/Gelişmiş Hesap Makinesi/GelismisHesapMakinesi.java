import java.util.Scanner;

public class GelismisHesapMakinesi {
	static void plus () {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ýlk Sayýyý Giriniz :");
        int a = scan.nextInt();
        System.out.print("Ýkinci Sayýyý Giriniz :");
        int b = scan.nextInt();

        int result = a + b;
        System.out.println("Sonuç : " +result);

    }

    static void minus (){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ýlk Sayýyý Giriniz :");
        int a = scan.nextInt();
        System.out.print("Ýkinci Sayýyý Giriniz :");
        int b = scan.nextInt();
        int result = a - b;
        System.out.println("Sonuç : " +result);

    }
    static  void times () {
        Scanner scan = new Scanner(System.in);
        int result = 0;
        System.out.print("Ýlk Sayýyý Giriniz :");
        int a = scan.nextInt();
        System.out.print("Ýkinci Sayýyý Giriniz :");
        int b = scan.nextInt();
        if (a == 0 || b == 0) {
            System.out.print("Sonuç :" + result);
        } else {

            result = a * b;
            System.out.println("Sonuç : " + result);

        }
    }
    static void divide () {
            Scanner scan = new Scanner(System.in);
            System.out.print("Ýlk Sayýyý Giriniz :");
            int a = scan.nextInt();
            System.out.print("Ýkinci Sayýyý Giriniz :");
            int b = scan.nextInt();

        int result = a / b;
        System.out.println("Sonuç : "+result);

    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban deðeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs deðeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayý giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }

    static void mod() {
        Scanner scan = new Scanner(System.in);
        int result;
        System.out.print("Ýlk Sayýyý Giriniz :");
        int a = scan.nextInt();
        System.out.print("Ýkinci Sayýyý Giriniz :");
        int b = scan.nextInt();

        if ((a <= 0) || (b <= 0)){
            System.out.print("Sýfýrdan Küçük Sayý Giremezsiniz...");
        }
        else {
            result = a % b;
            System.out.println("Sonuç : "+result);

        }
    }
    static void calc() {

        Scanner scan = new Scanner(System.in);
        int circle,area;
        System.out.print("Dikdörgenin Uzun Kenarýný Giriniz :");
        int a = scan.nextInt();
        System.out.print("Dikdörgenin Kýsa Kenarýný Giriniz :");
        int b = scan.nextInt();

        if ((a <= 0) || (b <= 0)){
            System.out.print("Dikdörgenin Kenarlarý Sýfýr ve Sýfýrdan Küçük Olamaz...");
        }
        else {
            circle = (2*(a+b));
            area = (a*b);
            System.out.println("Dikdörtgenin Çevresi :" +circle);
            System.out.println("Dikdörgenin Alaný :" +area);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;


        String menu = "1- Toplama Ýþlemi\n"
                + "2- Çýkarma Ýþlemi\n"
                + "3- Çarpma Ýþlemi\n"
                + "4- Bölme iþlemi\n"
                + "5- Üslü Sayý Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabý\n"
                + "0- Çýkýþ Yap";

        System.out.println(menu);
        while (true){

            System.out.print("Bir Ýþlem Seçiniz :");
            select =scan.nextInt();

            if (select == 0) {
                break;
            }

            switch (select){
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    calc();
                 break;
                default:
                    System.out.println("Yanlýþ bir deðer girdiniz, tekrar deneyiniz.");
                }
            } while (select != 0);
        }
            
        
    
}


