import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int sum = 0;
        // int count = 0;
        // int digit;
        while(n!=0){
            sum *=10;
            sum += n%10;
            // count++;
            n /=10;
            // if(n!=0) sum *=10;
        }
        System.out.println(sum);

        sc.close();
    }
}
                            