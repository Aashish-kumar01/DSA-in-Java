import java.util.Scanner;
public class four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the box value: ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            for(int j = 97; j<97+n; j++){
                System.out.print((char)j+" ");
            }
            System.out.println();
        }
        sc.close();

    }
}
