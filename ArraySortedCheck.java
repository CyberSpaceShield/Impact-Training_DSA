import java.util.Scanner;
public class ArraySortedCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();   
        int[] arr = new int[size];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The original elements of Array are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        boolean sorted = true;

        for(int i=0;i<size-1;i++){
            if(arr[i] > arr[i+1]){
                sorted = false;
                break;
            }
        }
        if(sorted){
            System.out.println("The array is sorted.");
        } 
        else {
            System.out.println("The array is not sorted.");
        }
    }
}