import java.util.Scanner;
public class SidesOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st Number: ");
        int a = sc.nextInt();
        // System.out.print("Enter the 2nd Number: ");
        // int b = sc.nextInt();
        // System.out.print("Enter the 3rd Number: ");
        // int c = sc.nextInt();

        // if(a+b>c && b+c>a && c+a>b) System.out.println("These are the sides of the Triangle.");
        // else System.out.println("These are not the sides of the Triangle.");

        // sc.close();

        if(a%5 == 0 && a%3 == 0) System.out.println("The Number is divisible by both 5 and 3.");
        // else if(a%5 == 0 || a%3 == 0) System.out.println("The Number is divisible by 5 or 3.");
        else if(a%5 == 0) System.out.println("The Number is divisible by 5 only.");
        else if(a%3 == 0) System.out.println("The Number is divisible by 3 only.");
        else System.out.println("The Number is not divisible by both.");

        sc.close();

    }
}
