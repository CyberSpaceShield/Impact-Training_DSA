import java.util.Arrays;
import java.util.Scanner;
public class ArraySortPredefinedMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();   
        int[] arr = new int[size];
        System.out.println("Enter the elements of array unsorted: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The original elements of Array are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        Arrays.sort(arr);
        
        System.out.println("The elements of Array sorted are: ");        
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}