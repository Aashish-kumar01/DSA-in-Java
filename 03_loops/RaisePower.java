import java.util.Scanner;
public class RaisePower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int a = sc.nextInt();
        System.out.print("Enter the Power: ");
        int b = sc.nextInt();
        int ans = 1;
        for(int p =1; p<=b; p++){
            ans*= a;
        }
        System.out.println(a+" raised to the power " +b+ " is "+ans);

        sc.close();
    }
}
