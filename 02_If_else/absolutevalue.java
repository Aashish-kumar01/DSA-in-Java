import java.util.Scanner;
public class absolutevalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        // if(n >= 0) System.out.println(n);
        // else System.out.println(-n);
        
        if(n < 0) n = -n;
        System.out.println(n);
        sc.close();
    }
}            
