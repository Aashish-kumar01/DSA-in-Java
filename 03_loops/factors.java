import java.util.Scanner;
public class factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                if(i == n/i){
                    System.out.print(i+" ");
                    // System.out.print(n/i+" ");
                }
                else {
                    System.out.print(i+" ");
                    System.out.print(n/i+" ");
                }

            }
        }
                                 
        sc.close();
    }
}
