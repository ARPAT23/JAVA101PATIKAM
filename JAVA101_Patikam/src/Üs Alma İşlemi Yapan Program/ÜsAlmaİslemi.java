import java.util.Scanner;

public class �sAlma�slemi {public static void main(String[] args) {
    int number1,number2,total=1;

    Scanner input = new Scanner(System.in);

    System.out.println("�ss� al�nacak say�y� giriniz :");
    number1= input.nextInt();

    System.out.println("�s olacak say�y� giriniz :");
    number2= input.nextInt();

    for(int i = 1; i <= number2 ;i++){
        total*=number1;
    }
    System.out.println("Sonu� : " + total);

 }
}