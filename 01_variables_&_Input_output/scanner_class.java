import java.util.Scanner;
public class scanner_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // input lene ke liye
        System.out.print("Enter Radius: ");
        double r = sc.nextDouble();
        double a = 3.141592 * r * r;
        System.out.print("Area is: ");
        System.out.println(a);
        sc.close();
    }
}
