import java.util.Scanner;
public class hw4Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            System.out.println(i+1);
            System.out.println(n-i);
        }
        
        sc.close();
    }    
}

