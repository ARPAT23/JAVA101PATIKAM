import java.util.Scanner;

public class ATMprojesi {
	public static void main(String[] args) {
        String userName, password;
        Scanner scan = new Scanner(System.in);
        int right=3, select;
        double price, balance=5000;
        while (right>0){
            System.out.print("Kullan�c� Ad�n�z: ");
            userName=scan.nextLine();
            System.out.print("Parolan�z: ");
            password= scan.nextLine();
            if (userName.equals("Serdar")&&password.equals("1097")){
                System.out.println("Sisteme giri� yap�ld�.");
                do {
                    System.out.println("1-Para yat�rma\n2-Para �ekme\n3-Bakiye Sorgula\n4-��k�� yap");
                    System.out.print("Yapmak istedi�iniz i�lemi se�iniz: ");
                    select = scan.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Para miktar�: ");
                            price=scan.nextDouble();
                            balance += price;
                            System.out.println("G�ncel bakiyeniz: " + balance);
                            break;
                        case 2:
                            System.out.print("Para miktar�: ");
                            price=scan.nextDouble();
                            if(balance<price){
                                System.out.println("Bakiye yetersizdir.");
                            }else {
                                balance -= price;
                                System.out.println("G�ncel bakiyeniz: " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                    }
                }while (select!=4);
                System.out.println("��k�� yap�ld�.");
                break;
            }else {
                right--;
                if(right==0){
                    System.out.println("Hesab�n�z bloke edilmi�tir. L�tfen banka ile ileti�ime ge�iniz.");
                }else {
                    System.out.println("Hatal� giri� yapt�n�z. L�tfen tekrar deneyiniz.\nKalan hakk�n�z: " + right);
                }
            }
        }
    }

}
