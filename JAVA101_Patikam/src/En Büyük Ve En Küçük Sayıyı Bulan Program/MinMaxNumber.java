import java.util.Scanner;

public class MinMaxNumber {
	public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        System.out.print("Kaç tane sayý gireceksiniz : ");
        int adet = klavye.nextInt();
        int number,i =1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (i <= adet){
            System.out.print(i + ". sayýyý giriniz : ");
            number = klavye.nextInt();

            if (number < min){
                min = number;
            }else{
                max = number;
            }
            i++;
        }
        System.out.println("En büyük sayý : " + max);
        System.out.println("En küçük sayý : " + min);
    }
}

