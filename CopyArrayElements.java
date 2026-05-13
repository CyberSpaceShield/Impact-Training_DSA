import java.util.Scanner;
public class CopyArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();   
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("The original elements of Array are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        System.out.println("The elements of Array2 copied from Array1 are: ");
        for (int i = 0; i < size; i++) {
            arr2[i] = arr1[i];
            System.out.print(arr2[i] + " ");
        }
        

    }
}