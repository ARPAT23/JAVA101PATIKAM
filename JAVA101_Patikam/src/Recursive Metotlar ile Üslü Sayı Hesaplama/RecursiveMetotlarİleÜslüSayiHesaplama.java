import java.util.Scanner;

public class RecursiveMetotlarile�sl�SayiHesaplama {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Taban de�eri giriniz: ");
        int taban = scanner.nextInt();
        System.out.print("�s de�erini giriniz: ");
        int �s = scanner.nextInt();
        
        System.out.println(taban + "^" + �s + " = " + �salma(taban, �s));
    }

    static int �salma(int taban, int �s){
        if(�s == 0) return 1;
        else return taban * �salma(taban, �s - 1);
   }

}


