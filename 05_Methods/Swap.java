import java.util.Scanner;
public class Swap {
    public static void swap(int a, int b){
        int temp = a; 
        a = b; 
        b = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int b = sc.nextInt();
        // int a = 10, b = 20;
        System.out.println(a+" "+b);
        // int temp = a;
        // a = b; 
        // b = temp;
        swap(a,b);
        System.out.println(a+" "+b);

        sc.close();
    }
}










