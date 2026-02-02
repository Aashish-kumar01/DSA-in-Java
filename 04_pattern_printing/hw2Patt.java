import java.util.Scanner;
public class hw2Patt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of box: ");
        int n = sc.nextInt();

        for(int i = 65; i<65+n; i++){
            for(int j = 1; j<=n; j++){
                System.out.print((char)i+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
