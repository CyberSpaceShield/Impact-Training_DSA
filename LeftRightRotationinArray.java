import java.util.Scanner;
public class LeftRightRotationinArray {
    static int leftRotation(int[] arr, int size) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to rotate left: ");
        int rotate = sc.nextInt();
        int[] rotatedArr = new int[size];
        for (int i = 0; i < size; i++) {
            rotatedArr[i] = arr[(i + rotate) % size];
        }
        System.out.println("The elements of Array after left rotation are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(rotatedArr[i] + " ");
        }
        return 0;
    }

    static int rightRotation(int[] arr, int size) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to rotate right: ");
        int rotate = sc.nextInt();
        int[] rotatedArr = new int[size];
        for (int i = 0; i < size; i++) {
            rotatedArr[i] = arr[(i - rotate + size) % size];
        }
        System.out.println("The elements of Array after right rotation are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(rotatedArr[i] + " ");
        }
        return 0;
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
        System.out.println("The original elements of Array are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
               
        System.out.println();

        leftRotation(arr, size);
        System.out.println();
        rightRotation(arr, size);
        
    }
}