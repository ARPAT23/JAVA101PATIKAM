import java.util.Scanner;

public class ManavKasaProgram� {
	public static void main(String[] args) {

		double armutF = 2.14, elmaF = 3.67, domatesF = 1.11, muzF = 0.95, patlicanF = 5.00, toplam;
		int armutK, elmaK, domatesK, muzK, patlicanK;

		Scanner garmut = new Scanner(System.in);
		System.out.print("Armut Ka� Kilo ?    : ");
		armutK = garmut.nextInt();

		Scanner gelma = new Scanner(System.in);
		System.out.print("Elma Ka� Kilo ?     : ");
		elmaK = garmut.nextInt();

		Scanner gdomates = new Scanner(System.in);
		System.out.print("Domates Ka� Kilo ?  : ");
		domatesK = garmut.nextInt();

		Scanner gmuz = new Scanner(System.in);
		System.out.print("Muz Ka� Kilo ?      : ");
		muzK = garmut.nextInt();

		Scanner gpatlican = new Scanner(System.in);
		System.out.print("Patl�can Ka� Kilo ? : ");
		patlicanK = garmut.nextInt();

		toplam = (armutK * armutF) + (elmaK * elmaF) + (domatesK * domatesF) + (muzK * muzF) + (patlicanK * patlicanF);

		System.out.println("Toplam Tutar      : " + toplam + "TL");

	}

}
