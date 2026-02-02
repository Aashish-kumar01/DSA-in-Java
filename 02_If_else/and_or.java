import java.util.Scanner;
public class and_or {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        if(x>999 && x<10000)
            System.out.println("The number is four digit number.");
        else System.out.println("The number is not a four digit number.");
        sc.close();


        // if (x%5 == 0 || x%3 == 0) System.out.println("The Number is divisible by 5 or 3.");
        // else System.out.println("The Number is not divisible by both 5 or 3.");
        // sc.close();

    }
}
