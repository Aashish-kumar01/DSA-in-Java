import java.util.Scanner;
public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int row = sc.nextInt();
        // System.out.print("Enter the columns: ");
        // int col = sc.nextInt();

        for(int i = 1; i<=row; i++){
            for(int j = 1; j<=row; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        sc.close();
    }
}





