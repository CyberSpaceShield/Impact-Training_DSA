import java.util.Scanner;
public class moveZerostoEnd {
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
        
        int index = 0;
        for (int i = 0; i < size; i++) {
            if(arr[i]!=0){
                arr[index++] = arr[i];
            }
        }

        while(index<size){
            arr[index++] = 0;
        }

        System.out.println("The new Array after shifting zeros to the end: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}