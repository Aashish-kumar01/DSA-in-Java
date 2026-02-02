import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fact(n);
        System.out.print(fact(n));

        sc.close();
        
    }

    public static int fact(int n){
        if(n==0 || n==1) return 1;
        int fact = n*fact(n-1);
        return fact;
    }
}
