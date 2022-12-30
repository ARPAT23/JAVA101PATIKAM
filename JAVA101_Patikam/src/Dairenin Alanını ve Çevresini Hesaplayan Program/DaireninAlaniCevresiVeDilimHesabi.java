import java.util.Scanner;

public class DaireninAlaniCevresiVeDilimHesabi {

	/*
	 * Alan Formülü : π * r * r; Çevre Formülü : 2 * π * r;
	 */
	public static void main(String[] args) {

		double yaricapi, cevre, alan, aci; // Değişkenleri yazalım.
		double pi = 3.14; // 𝜋 sayısı = 3.14

		Scanner inp = new Scanner(System.in); // Kullanıcıdan Yarıçapı alalım.
		System.out.print("Dairenin Yarı Çapını Giriniz:");
		yaricapi = inp.nextDouble();
		cevre = 2 * pi * yaricapi;
		System.out.println("Dairenin Çevresi: " + cevre);
		alan = pi * yaricapi * yaricapi;
		System.out.println("Dairenin Alanı:" + alan);

		System.out.print("Daire Diliminin Açısını yazınız:");// Daire dilimi alanı için kullanıcıdan açı isteyelim.
		aci = inp.nextDouble();
		double dilimAlani = (pi * (yaricapi * yaricapi) * aci) / 360; // Formül : (𝜋 * (r*r) * 𝛼) / 360
		System.out.print("Dilimin Alanı:" + dilimAlani);

	}
}
