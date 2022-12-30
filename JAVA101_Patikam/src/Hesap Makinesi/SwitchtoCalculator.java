import java.util.Scanner;

public class SwitchtoCalculator {

	public static void main(String[] args) {
		int number1, number2, select;

		Scanner input = new Scanner(System.in);
		System.out.print("Birinci sayıyı girniz: ");
		number1 = input.nextInt();
		System.out.print("İkinci sayıyı giriniz: ");
		number2 = input.nextInt();

		System.out.println("1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme");
		System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
		select = input.nextInt();

		switch (select) {
		case 1:
			System.out.println("Toplam: " + (number1 + number2));
			break;
		case 2:
			System.out.println("Çıkarma: " + (number1 - number2));
			break;
		case 3:
			System.out.println("Çarpım: " + (number1 * number2));
			break;
		case 4:
			if (number2 != 0) {
				System.out.println("Bölüm: " + (number1 / number2));
				break;
			} else {
				System.out.println("Bir sayı 0'a bölünemez");
			}
			break;
		default:
			System.out.println("Hatalı seçim yaptınız tekrar deneyiniz. ");
		}

	}

}
