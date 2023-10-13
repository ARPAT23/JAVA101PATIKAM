import java.util.Scanner;

public class GirileneKadarOlanSayilarinToplami {
	public static void main(String[] args) {
		int number;
		
		int toplam = 0;
		 Scanner input = new Scanner(System.in);
		 
		do {
			System.out.print("Bir sayý giriniz:  ");
			 number = input.nextInt();
			
			if((number %4 == 0) && (number %2 == 0) ) {
				toplam += number;
				
			}
			
			
			
			
		} while (number %2 == 0) ;
		
			System.out.print("Girilen sayýlardan çift ve 4'ün katý olan sayýlarýn toplamý:  " + toplam);
			
			
		}
}
