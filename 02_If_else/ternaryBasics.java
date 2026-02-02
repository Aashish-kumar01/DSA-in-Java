import java.util.Scanner;
public class ternaryBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();

        // Condition ? Sach : Jhuth
        System.out.println((x%2==0) ? "Even" : "Odd");

        sc.close();
    }
}
