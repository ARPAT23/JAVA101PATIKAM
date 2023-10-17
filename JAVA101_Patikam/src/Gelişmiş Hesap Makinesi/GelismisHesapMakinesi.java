import java.util.Scanner;

public class GelismisHesapMakinesi {
	static void plus () {
        Scanner scan = new Scanner(System.in);
        System.out.print("�lk Say�y� Giriniz :");
        int a = scan.nextInt();
        System.out.print("�kinci Say�y� Giriniz :");
        int b = scan.nextInt();

        int result = a + b;
        System.out.println("Sonu� : " +result);

    }

    static void minus (){
        Scanner scan = new Scanner(System.in);
        System.out.print("�lk Say�y� Giriniz :");
        int a = scan.nextInt();
        System.out.print("�kinci Say�y� Giriniz :");
        int b = scan.nextInt();
        int result = a - b;
        System.out.println("Sonu� : " +result);

    }
    static  void times () {
        Scanner scan = new Scanner(System.in);
        int result = 0;
        System.out.print("�lk Say�y� Giriniz :");
        int a = scan.nextInt();
        System.out.print("�kinci Say�y� Giriniz :");
        int b = scan.nextInt();
        if (a == 0 || b == 0) {
            System.out.print("Sonu� :" + result);
        } else {

            result = a * b;
            System.out.println("Sonu� : " + result);

        }
    }
    static void divide () {
            Scanner scan = new Scanner(System.in);
            System.out.print("�lk Say�y� Giriniz :");
            int a = scan.nextInt();
            System.out.print("�kinci Say�y� Giriniz :");
            int b = scan.nextInt();

        int result = a / b;
        System.out.println("Sonu� : "+result);

    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban de�eri giriniz :");
        int base = scan.nextInt();
        System.out.print("�s de�eri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonu� : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Say� giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonu� : " + result);
    }

    static void mod() {
        Scanner scan = new Scanner(System.in);
        int result;
        System.out.print("�lk Say�y� Giriniz :");
        int a = scan.nextInt();
        System.out.print("�kinci Say�y� Giriniz :");
        int b = scan.nextInt();

        if ((a <= 0) || (b <= 0)){
            System.out.print("S�f�rdan K���k Say� Giremezsiniz...");
        }
        else {
            result = a % b;
            System.out.println("Sonu� : "+result);

        }
    }
    static void calc() {

        Scanner scan = new Scanner(System.in);
        int circle,area;
        System.out.print("Dikd�rgenin Uzun Kenar�n� Giriniz :");
        int a = scan.nextInt();
        System.out.print("Dikd�rgenin K�sa Kenar�n� Giriniz :");
        int b = scan.nextInt();

        if ((a <= 0) || (b <= 0)){
            System.out.print("Dikd�rgenin Kenarlar� S�f�r ve S�f�rdan K���k Olamaz...");
        }
        else {
            circle = (2*(a+b));
            area = (a*b);
            System.out.println("Dikd�rtgenin �evresi :" +circle);
            System.out.println("Dikd�rgenin Alan� :" +area);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;


        String menu = "1- Toplama ��lemi\n"
                + "2- ��karma ��lemi\n"
                + "3- �arpma ��lemi\n"
                + "4- B�lme i�lemi\n"
                + "5- �sl� Say� Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikd�rtgen Alan ve �evre Hesab�\n"
                + "0- ��k�� Yap";

        System.out.println(menu);
        while (true){

            System.out.print("Bir ��lem Se�iniz :");
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
                    System.out.println("Yanl�� bir de�er girdiniz, tekrar deneyiniz.");
                }
            } while (select != 0);
        }
            
        
    
}


