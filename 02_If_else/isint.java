import java.util.Scanner;
public class isint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double x = sc.nextDouble();
        // if(x<0) x = -x;
        // x = x*10;
        // if(x%10 == 0) System.out.println("The number is Integer");
        // else System.out.println("The number is not a Integer");
        if(x<0) x = -x;
        // int n = (int)x;
        if(x-(int)x > 0) System.out.println("The Number is not an Integer");
        // if(x == (int)x) System.out.println("The Number is not an Integer");
        else System.out.println("The Number is Integer");

        sc.close();
    }
}                            
