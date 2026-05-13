//import java.util.Scanner;
public class ArrayInsertionDeletion {
    @SuppressWarnings("ManualArrayToCollectionCopy")
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 0};
        int size=arr.length-1;
        int pos=2, value=10;
        for(int i=size;i>=pos;i--){
            arr[i] = arr[i-1];
        }
        arr[pos] = value;
        System.out.print("After Insertion: ");
        for(int i=0;i<=size;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        int del_pos=3;
        for(int i=del_pos;i<size;i++){
            arr[i] = arr[i+1];
        }
       arr[size] = 0;
        System.out.print("After Deletion: ");
        int newArr[] = new int[size];

        for(int i=0;i<size;i++){
            newArr[i] = arr[i];
        }
        for(int i=0;i<size;i++){            
            System.out.print(newArr[i]+" ");
           // System.out.print(arr[i]+" ");
        }
        
    }
}