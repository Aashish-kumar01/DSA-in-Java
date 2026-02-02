import java.util.Scanner;
public class CountsDigits {
    public static void main(String[] args) {
        // adding the double in a string
        double d = 3.14;
        String x = "Aashish";
        x += d;
        System.out.println(x);

        // adding the integer to a string
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        s += n;
        System.out.println(s.length());

        // converting string to a integer 
        String st = "2343232";
        int m = Integer.parseInt(st);
        System.out.println(m+2);
        sc.close();
    }
}
