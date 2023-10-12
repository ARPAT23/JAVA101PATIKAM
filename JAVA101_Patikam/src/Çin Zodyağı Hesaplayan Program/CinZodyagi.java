import  java.util.Scanner;
public class CinZodyagi {
	   public static void main(String[] args) {

	        Scanner girdi = new Scanner(System.in);

	        int dtarihi, kalan;

	        System.out.print("Doðum tarihinizi giriniz: ");
	        dtarihi=girdi.nextInt();
	        kalan= dtarihi%12;

	        switch (kalan){
	            case 0:
	                System.out.print("Çin Zodyaðý Burcunuz: Maymun ");
	                break;
	            case 1:
	                System.out.print("Çin Zodyaðý Burcunuz: Horoz ");
	                break;
	            case 2:
	                System.out.print("Çin Zodyaðý Burcunuz: Köpek ");
	                break;
	            case 3:
	                System.out.print("Çin Zodyaðý Burcunuz: Domuz ");
	                break;
	            case 4:
	                System.out.print("Çin Zodyaðý Burcunuz: Fare  ");
	                break;
	            case 5:
	                System.out.print("Çin Zodyaðý Burcunuz: Öküz ");
	                break;
	            case 6:
	                System.out.print("Çin Zodyaðý Burcunuz:  Kaplan");
	                break;
	            case 7:
	                System.out.print("Çin Zodyaðý Burcunuz: Tavþan ");
	                break;
	            case 8:
	                System.out.print("Çin Zodyaðý Burcunuz: Ejderha ");
	                break;
	            case 9:
	                System.out.print("Çin Zodyaðý Burcunuz: Yýlan ");
	                break;
	            case 10:
	                System.out.print("Çin Zodyaðý Burcunuz: At  ");
	                break;
	            case 11:
	                System.out.print("Çin Zodyaðý Burcunuz: Koyun  ");
	                break;
	            default:
	                System.out.print("Yanlýþ Deðer Girdiniz!!!");

	        }
	    }
}
