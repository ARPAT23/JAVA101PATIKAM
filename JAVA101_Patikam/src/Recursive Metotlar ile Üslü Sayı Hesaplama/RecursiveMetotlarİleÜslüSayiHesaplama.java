import java.util.Scanner;

public class RecursiveMetotlarileÜslüSayiHesaplama {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Taban değeri giriniz: ");
        int taban = scanner.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int üs = scanner.nextInt();
        
        System.out.println(taban + "^" + üs + " = " + üsalma(taban, üs));
    }

    static int üsalma(int taban, int üs){
        if(üs == 0) return 1;
        else return taban * üsalma(taban, üs - 1);
   }

}


