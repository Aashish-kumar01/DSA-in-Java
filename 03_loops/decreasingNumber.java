import java.util.Scanner;
public class decreasingNumber {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int i;
        for(i = n; i>0; i--){
            System.out.println(i);
        }

        sc.close();
    }
}
