import java.util.Scanner;
public class hw1Patt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int a = sc.nextInt();

        for(int i=1; i<=a; i++){
            for(int j=1; j<=a; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
