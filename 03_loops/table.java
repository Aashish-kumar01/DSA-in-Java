import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int x = sc.nextInt();
        int i;
        for(i = 1; i<11; i++){
            System.out.println(x*i);
        }

        sc.close();
    }
}
