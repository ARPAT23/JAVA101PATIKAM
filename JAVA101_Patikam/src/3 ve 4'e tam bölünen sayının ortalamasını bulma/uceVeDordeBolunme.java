import java.util.Scanner;

public class uceVeDordeBolunme {
	  public static void main(String[] args) {

	        //Deðiþkenlerin tanýmlanmasý.

	        int k, toplam = 0, sayac = 0;

	        //"k" sayýsýnýn girilmesi.

	        Scanner inp = new Scanner(System.in);
	        System.out.print("Sayý giriniz: ");
	        k = inp.nextInt();

	        //Döngünün oluþturulmasý.

	        for (int i = 0; i <= k; i++){
	            if ((i % 3 == 0) && (i % 4 == 0)){
	                sayac += 1;
	                toplam += i;
	            }
	        }

	        //Ortalamanýn hesaplanmasý ve sonucun yazýlmasý.

	        if (sayac > 0){
	            double ort = toplam / sayac;
	            System.out.println("Sayýlarýn ortalamasý: " + ort);
	        } else {
	            System.out.println("Sayý bulunamadý");
	        }
	        
	    }
  }


