import java.util.Scanner;
public class hw9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the triangle: ");
        int n = sc.nextInt();

        for(int i =1; i<=n; i++){
            for(int j =1; j<=n-i+1; j++){
                System.out.print((char)(j+96)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
