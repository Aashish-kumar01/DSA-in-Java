import java.util.Scanner;
public class reverseNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int k = 0;
        reverse(n, 0);
        System.out.print(reverse(n,0));

        sc.close();
    }

    public static int reverse(int n, int k){
       if(n == 0) return k;
       k *= 10;
       k += n%10;
       return reverse(n/10, k);
    }
}                       
