
import java.util.Arrays;
public class DizilerdeGirilenSayiyaYakinBuyukVeKucukSayiyiBulma {

	public static void main(String[] args) {

        int[] numbers = {43, 6, 78,-23,5,8,1};
        int number = 6;
        int temp= 0;
        Arrays.sort(numbers);
        
        for (int a : numbers) {
            
            if (number<a) {
                temp = a;
                System.out.println("En yak�n b�y�k say�: "+ a);
                break;
                
            }
            
     
        }
        if (numbers[Arrays.binarySearch(numbers, temp)-1] != number) {
            System.out.println("En yak�n k���k say�: " +numbers[Arrays.binarySearch(numbers, temp)-1]);
            
            
        }else{
            System.out.println("En yak�n k���k say�: " +numbers[Arrays.binarySearch(numbers, temp)-2]);
            
        }
        
     

	}

}
