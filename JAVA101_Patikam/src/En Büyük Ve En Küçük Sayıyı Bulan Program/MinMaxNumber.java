import java.util.Scanner;

public class MinMaxNumber {
	public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        System.out.print("Ka� tane say� gireceksiniz : ");
        int adet = klavye.nextInt();
        int number,i =1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (i <= adet){
            System.out.print(i + ". say�y� giriniz : ");
            number = klavye.nextInt();

            if (number < min){
                min = number;
            }else{
                max = number;
            }
            i++;
        }
        System.out.println("En b�y�k say� : " + max);
        System.out.println("En k���k say� : " + min);
    }
}

