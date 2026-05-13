import java.util.Scanner;
public class invertedPyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the inverted pyramid pattern: ");   
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("- ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("# ");
            }
            for(int l = 1; l < i; l++) {
                System.out.print("# ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("- ");
            }
            System.out.println();
        }
    }
}
