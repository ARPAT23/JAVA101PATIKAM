import  java.util.Scanner;
public class CinZodyagi {
	   public static void main(String[] args) {

	        Scanner girdi = new Scanner(System.in);

	        int dtarihi, kalan;

	        System.out.print("Do�um tarihinizi giriniz: ");
	        dtarihi=girdi.nextInt();
	        kalan= dtarihi%12;

	        switch (kalan){
	            case 0:
	                System.out.print("�in Zodya�� Burcunuz: Maymun ");
	                break;
	            case 1:
	                System.out.print("�in Zodya�� Burcunuz: Horoz ");
	                break;
	            case 2:
	                System.out.print("�in Zodya�� Burcunuz: K�pek ");
	                break;
	            case 3:
	                System.out.print("�in Zodya�� Burcunuz: Domuz ");
	                break;
	            case 4:
	                System.out.print("�in Zodya�� Burcunuz: Fare  ");
	                break;
	            case 5:
	                System.out.print("�in Zodya�� Burcunuz: �k�z ");
	                break;
	            case 6:
	                System.out.print("�in Zodya�� Burcunuz:  Kaplan");
	                break;
	            case 7:
	                System.out.print("�in Zodya�� Burcunuz: Tav�an ");
	                break;
	            case 8:
	                System.out.print("�in Zodya�� Burcunuz: Ejderha ");
	                break;
	            case 9:
	                System.out.print("�in Zodya�� Burcunuz: Y�lan ");
	                break;
	            case 10:
	                System.out.print("�in Zodya�� Burcunuz: At  ");
	                break;
	            case 11:
	                System.out.print("�in Zodya�� Burcunuz: Koyun  ");
	                break;
	            default:
	                System.out.print("Yanl�� De�er Girdiniz!!!");

	        }
	    }
}
