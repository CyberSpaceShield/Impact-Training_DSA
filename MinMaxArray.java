import java.util.Scanner;

public class MinMaxArray {
    static int MIN(int[] arr, int size){
        int min = arr[0];
        for (int i = 0; i < size; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    static int MAX(int[] arr, int size){
        int max = arr[0];
        for (int i = 0; i < size; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int max = MAX(arr, size);
        int min = MIN(arr, size);

        System.out.println("The Minimum element in the array is: " + min);        
        System.out.println("The Maximum element in the array is: " + max);
    }
    
}