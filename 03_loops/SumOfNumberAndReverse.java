import java.util.Scanner;
public class SumOfNumberAndReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int y = n;

        int sum = 0;
        while(n!=0){
            sum *=10;
            sum += n%10;
            n /=10;
        }
        System.out.println(sum+y);

        sc.close();
    }
}
