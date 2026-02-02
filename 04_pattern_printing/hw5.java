import java.util.Scanner;
public class hw5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the box: ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
