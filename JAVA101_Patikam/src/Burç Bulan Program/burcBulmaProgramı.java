import java.util.Scanner;

public class burcBulmaProgram� {
	 public static void main(String[] args) {
	        Scanner input= new Scanner(System.in);
	        int ay,gun;

	        System.out.print("Dogdugunuz ayi giriniz (1-12) :");
	        ay=input.nextInt();
	        System.out.print("Dogdugunuz gunu giriniz:");
	        gun=input.nextInt();

	        if((ay==3 && gun>=21) || (ay==4 && gun <=20)){
	            System.out.print("Burcunuz ko�.");
	        }
	        else if((ay==4 && gun>=21) || (ay==5 && gun<=21)){
	            System.out.print("Burcunuz bo�a.");
	        }
	        else if((ay==5 && gun>=22) || (ay==6 && gun<=22)){
	            System.out.print("Burcunuz ikizler.");
	        }
	        else if((ay==6 && gun>=23) || (ay==7 && gun<=22)){
	            System.out.print("Burcunuz yenge�.");
	        }
	        else if((ay==7 && gun>=23) || (ay==8 && gun<=22)){
	            System.out.print("Burcunuz aslan.");
	        }
	        else if((ay==8 && gun>=23) || (ay==9 && gun<=22)){
	            System.out.print("Burcunuz ba�ak.");
	        }
	        else if((ay==9 && gun>=23) || (ay==10 && gun<=22)){
	            System.out.print("Burcunuz terazi.");
	        }
	        else if((ay==11 && gun>=22) || (ay==12 && gun<=21)){
	            System.out.print("Burcunuz yay.");
	        }
	        else if((ay==12 && gun>=22) || (ay==1 && gun<=21)){
	            System.out.print("Burcunuz o�lak.");
	        }
	        else if((ay==1 && gun>=22) || (ay==2 && gun<=19)){
	            System.out.print("Burcunuz kova.");
	        }
	        else if((ay==2 && gun>=20) || (ay==3 && gun<=20)){
	            System.out.print("Burcunuz bal�k.");
	        }

	        else{
	            System.out.print("Hatal� giri� yapt�n�z");
	        }

	    }

}
