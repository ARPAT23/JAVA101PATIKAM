import java.util.Scanner;

public class ATMprojesi {
	public static void main(String[] args) {
        String userName, password;
        Scanner scan = new Scanner(System.in);
        int right=3, select;
        double price, balance=5000;
        while (right>0){
            System.out.print("Kullanýcý Adýnýz: ");
            userName=scan.nextLine();
            System.out.print("Parolanýz: ");
            password= scan.nextLine();
            if (userName.equals("Serdar")&&password.equals("1097")){
                System.out.println("Sisteme giriþ yapýldý.");
                do {
                    System.out.println("1-Para yatýrma\n2-Para çekme\n3-Bakiye Sorgula\n4-Çýkýþ yap");
                    System.out.print("Yapmak istediðiniz iþlemi seçiniz: ");
                    select = scan.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Para miktarý: ");
                            price=scan.nextDouble();
                            balance += price;
                            System.out.println("Güncel bakiyeniz: " + balance);
                            break;
                        case 2:
                            System.out.print("Para miktarý: ");
                            price=scan.nextDouble();
                            if(balance<price){
                                System.out.println("Bakiye yetersizdir.");
                            }else {
                                balance -= price;
                                System.out.println("Güncel bakiyeniz: " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                    }
                }while (select!=4);
                System.out.println("Çýkýþ yapýldý.");
                break;
            }else {
                right--;
                if(right==0){
                    System.out.println("Hesabýnýz bloke edilmiþtir. Lütfen banka ile iletiþime geçiniz.");
                }else {
                    System.out.println("Hatalý giriþ yaptýnýz. Lütfen tekrar deneyiniz.\nKalan hakkýnýz: " + right);
                }
            }
        }
    }

}
