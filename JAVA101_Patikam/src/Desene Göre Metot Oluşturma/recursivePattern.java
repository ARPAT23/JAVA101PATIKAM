import java.util.Scanner;

public class recursivePattern {
	public static void pattern(int n, int k) {

        System.out.print(n + " ");

        if (n <= 0) {
            k = k * -1;
        } else {
            pattern(n - k, k);
            System.out.print(n + " ");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N say�s�: ");
        int N = input.nextInt();

        pattern(N, 5);
    }

}
