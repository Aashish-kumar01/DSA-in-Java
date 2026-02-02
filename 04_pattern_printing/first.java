import java.util.Scanner;
public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the columns: ");
        int col = sc.nextInt();

        for(int i = 1; i<=row; i++){
            for(int j =1; j<=col; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
