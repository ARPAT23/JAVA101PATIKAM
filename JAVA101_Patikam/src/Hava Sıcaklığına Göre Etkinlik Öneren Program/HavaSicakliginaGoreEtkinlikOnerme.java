import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {
	 public static void main(String[] args) {
	        Scanner input=new Scanner(System.in);
	        int sicaklik;
	        System.out.println("Hava s�cakl���n� giriniz:");
	        sicaklik=input.nextInt();
	        if(sicaklik<5){
	            System.out.println("Kayak yapabilirsiniz.");
	        } else if(sicaklik>5&&sicaklik<10) {
	            System.out.println("Sinemaya gidebilirsiniz.");
	        } else if(sicaklik>10&&sicaklik<15) {
	            System.out.println("Sinema ve Pikni�e gidebilirsiniz.");
	        } else if(sicaklik>15&&sicaklik<25) {
	            System.out.println("Pikni�e gidebilirsiniz.");
	        } else if(sicaklik>25) {
	            System.out.println("Y�zmeye gidebilirsiniz.");
	        }
	    }

}
