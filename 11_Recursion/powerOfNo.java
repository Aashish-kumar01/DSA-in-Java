import java.util.Scanner;
public class powerOfNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        System.out.print("Enter the power: ");
        int b = sc.nextInt();
        power(a,b);
        System.out.println(power(a,b));

        sc.close();
    }

    public static int power(int a, int b){
        if(b==0) return 1;
        // return a*power(a,b-1);


        // Logirithmic time complexity
        // int k = b/2;
        // return power(a,k)*power(a,b-k);


        // Another way to do this
        int call = power(a,b/2);               
        if(b%2 == 0){
            return call*call;
        }
        else return call*call*a;
    }
}
