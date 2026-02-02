import java.util.Scanner;
public class six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the box size: ");
        int n = sc.nextInt();

        for(int i =1; i<=n; i++){
            for(int j =1; j<=n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
        // another way to do this thing
        // int a = n; 

        // for(int i =1; i<=n; i++){                 
        //     for(int j =1; j<=a; j++){
        //         System.out.print("* ");
        //     }
        //     a--;
        //     System.out.println();
        // }

