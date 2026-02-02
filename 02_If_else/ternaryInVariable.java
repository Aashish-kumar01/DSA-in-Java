import java.util.Scanner;
public class ternaryInVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        System.out.print("Enter the number: ");
        int y = sc.nextInt();
        System.out.print("Enter the number: ");
        int z = sc.nextInt();

        int prasun = (x>=0) ? 100 : 0;

        System.out.println(prasun);
        System.out.println((x%2 ==0) ? "Even" : "Odd");
        // (x%2 == 0) ? System.out.println("Even") : System.out.println("Odd"); // ye error dega kyunki ternary operator ko aise use nahi kar sakte.

        System.out.println((x>=y) ? ((x>=z)? x:z) : ((y>=z)? y:z));
        sc.close();
    }
}
