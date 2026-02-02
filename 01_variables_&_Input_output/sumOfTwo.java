import java.util.Scanner;
public class sumOfTwo {
    public static void main(String[] args) {
        // Scanner Aashish = new Scanner(System.in);

        // System.out.print("Enter 1st Number: ");
        // int num1 = Aashish.nextInt();
        // System.out.print("Enter 2nd Number: ");
        // int num2 = Aashish.nextInt();
        // System.out.print("Enter 3rd Number: "); 
        // int num3 = Aashish.nextInt();

        // System.out.print(num1 + num2 + num3);

        // Aashish.close();
        


        // Program to found the Simple Interest
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        int p = sc.nextInt();
        System.out.print("Enter the rate: ");
        double r = sc.nextDouble();
        System.out.print("Enter the time: ");
        int t = sc.nextInt();

        double SI = (p*r*t)/100;
        System.out.print("The Simple Interest is: ");
        System.out.print(SI);

        sc.close();
    }
}
