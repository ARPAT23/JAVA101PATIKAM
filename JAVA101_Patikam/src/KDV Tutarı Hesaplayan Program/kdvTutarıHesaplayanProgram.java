

import java.util.Scanner;
public class kdvTutarıHesaplayanProgram {

	public static void main(String[] args) {
		double tutar, kdvOran1 = 0.18, kdvOran2 = 0.8, kdvTutar, kdvliFiyat;
		System.out.print("Ücret Tutarını Giriniz : ");
		Scanner input = new Scanner(System.in);
		tutar = input.nextDouble();
		kdvTutar = tutar > 0 && tutar < 1000 ? tutar * kdvOran1 : tutar * kdvOran2;
		kdvliFiyat = tutar + kdvTutar;
		System.out.println("KDV'siz Fiyat : " + tutar);
		System.out.println("KDV tutarı : " + kdvTutar);
		System.out.println("KDV'li Fiyat : " + kdvliFiyat);
	}

}
