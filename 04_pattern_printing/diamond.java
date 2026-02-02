import java.util.Scanner;
public class diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the diamond: ");
        int n = sc.nextInt();

        int nsp = n-1, nst = 1;
        for(int i =1; i<=n; i++){
            for(int j =1; j<=nsp; j++){
                System.out.print("  ");
            }
            for(int j =1; j<=nst; j++){
                System.out.print("* ");
            }
            System.out.println();
            nsp -=1;
            nst +=2;
        }
        nsp = 1; nst = 2*n-3;
        for(int i =1; i<=n-1; i++){
            for(int j =1; j<=nsp; j++){
                System.out.print("  ");
            }
            for(int j =1; j<=nst; j++){
                System.out.print("* ");
            }
            System.out.println();
            nst -=2;
            nsp +=1;
        }


        sc.close();
    }
}
