import java.util.Scanner;

public class uceVeDordeBolunme {
	  public static void main(String[] args) {

	        //De�i�kenlerin tan�mlanmas�.

	        int k, toplam = 0, sayac = 0;

	        //"k" say�s�n�n girilmesi.

	        Scanner inp = new Scanner(System.in);
	        System.out.print("Say� giriniz: ");
	        k = inp.nextInt();

	        //D�ng�n�n olu�turulmas�.

	        for (int i = 0; i <= k; i++){
	            if ((i % 3 == 0) && (i % 4 == 0)){
	                sayac += 1;
	                toplam += i;
	            }
	        }

	        //Ortalaman�n hesaplanmas� ve sonucun yaz�lmas�.

	        if (sayac > 0){
	            double ort = toplam / sayac;
	            System.out.println("Say�lar�n ortalamas�: " + ort);
	        } else {
	            System.out.println("Say� bulunamad�");
	        }
	        
	    }
  }


