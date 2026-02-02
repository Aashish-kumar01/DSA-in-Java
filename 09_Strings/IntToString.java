import java.util.Scanner;
public class IntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = ""; // Empty String
        str += n;
        // String s = Integer.toString(n);
        // System.out.println(s);
        System.out.println(str);

        sc.close();
    }    
}
