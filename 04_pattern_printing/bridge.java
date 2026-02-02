import java.util.Scanner;
public class bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the bridge: ");
        int n = sc.nextInt();

        for(int i =1; i<=2*n-1; i++){
            System.out.print("* ");
        }
        System.out.println();
        int nsp = n-1, nst = 1;
        for(int i =1; i<=n; i++){
            for(int j =1; j<=nsp; j++){
                System.out.print("* ");
            }
            for(int j =1; j<=nst; j++){
                System.out.print("  ");
            }
            for(int j =1; j<=nsp; j++){
                System.out.print("* ");
            }
            System.out.println();
            nsp -=1;
            nst +=2;
        }
                  
        sc.close();
    }
}
