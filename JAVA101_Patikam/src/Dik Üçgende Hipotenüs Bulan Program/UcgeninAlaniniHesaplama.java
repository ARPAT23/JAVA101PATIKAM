
import java.util.Scanner;

public class UcgeninAlaniniHesaplama {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a, b, c; // kulanıcının girdiği değerler

		System.out.print("Lütfen üçgenin birinci kenar uzunluğunu giriniz: ");
		a = scanner.nextInt();

		System.out.print("Lütfen üçgenin ikinci kenar uzunluğunu giriniz: ");
		b = scanner.nextInt();

		System.out.print("Lütfen üçgenin üçüncü kenar uzunluğunu giriniz: ");
		c = scanner.nextInt();

		double u = (a + b + c) / 2; // üçgenin yarımçevresini hesaplayan formül
		double cevre = 2 * u; // üçgenin çevresini hesaplayan formül
		double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c)); // üçgenin alanını hesaplayan formül

		System.out.println("Üçgenin çevresi: " + cevre);
		System.out.println("Üçgenin alanı: " + alan);
	}

}
