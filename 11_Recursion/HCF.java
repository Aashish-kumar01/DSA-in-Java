import java.util.Scanner;
public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        // int a1 = (int)Math.sqrt(a);
        // int b1 = (int)Math.sqrt(b);

        // HCF(a,b);
        System.out.print(Hcf(a,b));
        sc.close();
    }

    public static int Hcf(int a, int b){
        if(a == 0) return b;
        return Hcf(b%a,a);
        
    }
}
                                    

