import java.util.Arrays;
import java.util.Scanner;
public class SecondSmallestNumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();   
        int[] arr = new int[size];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements of Array are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        int secondLargest = arr[1];
        System.out.println("The second largest element in the array is: " + secondLargest);
    }
}