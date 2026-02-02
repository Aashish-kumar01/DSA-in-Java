import java.util.Scanner;
public class arithmeticprogression {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of terms: ");
        int n = sc.nextInt();
        int i;
        // int a = 2 + n*3;
        // for(i=2; i<=3*n - 1; i=i+3){
        //     System.out.println(i);
        // }

        // ye ek efficient tarika hai
        int a = 4, d = 6;
        for(i=1; i<=n; i++){
            System.out.println(a+" ");
            a +=d;
        }

        sc.close();
    }


}
