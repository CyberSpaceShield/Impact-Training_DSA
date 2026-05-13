import java.util.Scanner;
public class rightTriangle {
    public int printRightTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the right triangle: ");
        int n = sc.nextInt();

        rightTriangle rt = new rightTriangle();
        rt.printRightTriangle(n);
    }
}