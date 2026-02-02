import java.util.Scanner;
public class hw3If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int l = sc.nextInt();
        System.out.print("Enter the breadth: ");
        int b = sc.nextInt();
        int p = 2*l+2*b;
        int a = l*b;
        if(a>p) System.out.println("The Area of the Rectangle is greater than its Perimenter.");
        else System.out.println("The Area of the Rectangle is not greater than its perimente.");

        sc.close();

    }
}
