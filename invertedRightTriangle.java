import java.util.Scanner;
public class invertedRightTriangle {
    public int printInvertedRightTriangle(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("# ");
            }
            System.out.println();
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the inverted right triangle: ");
        int n = sc.nextInt();

        invertedRightTriangle irt = new invertedRightTriangle();
        irt.printInvertedRightTriangle(n);
    }
}