import java.util.Scanner;
public class compositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        
        // for(int i = 2; i<Math.sqrt(n); i++){
        //     if(n%i == 0) {System.out.println("The Number is composie number.");
        //         break;
        //     }
        // }

        boolean flag = true; // true means prime
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                flag = false;
                break;
            }                                          
        }
        if(n==1) System.out.println("Neither prime nor composite");
        else if(flag == false) System.out.println("Composite Number");
        else System.out.println("Prime Number");

        sc.close();
    }
}
