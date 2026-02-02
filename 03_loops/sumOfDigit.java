import java.util.Scanner;
public class sumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        // if(n<0) n = -n;

        int sum = 0;                         
        while(n!=0){
            sum += n%10;
            n/=10;
        }
        System.out.print((sum>0)? sum: -sum);
        // if(sum<0){ sum = -sum;
        //     System.out.print(sum);
        // }
        // else{
        //     System.out.println(sum);
        // }
        sc.close();
         
    }
}


