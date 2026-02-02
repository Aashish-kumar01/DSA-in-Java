// import java.util.Scanner;
public class hw3Loop {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number: ");
        // int x = sc.nextInt();

        int a = 99, d = -4;
        // int n;
        // Integer x = (a + (n-1)*d)<0
        // int y = (int)x;
        
        // Method 1
        for (int j=99; j>0; j-=4){
            System.out.println(j);
        }

        // Method 2
        for(int i=1; i<=103/4; i++){
            System.out.println(a+" ");
            a +=d;
        }
    }
}



