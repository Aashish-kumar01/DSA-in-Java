import java.util.Scanner;
public class permutationAndCombination {
    public static int fact(int x){
        int f = 1; 
        for(int i =1; i<=x; i++){
            f *= i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value: ");
        int n = sc.nextInt();
        System.out.print("Enter the r value: ");
        int r = sc.nextInt();

        // int nfact = 1;
        // for(int i =1; i<=n; i++){
        //     nfact *= i;
        // }

        // int rfact = 1;
        // for(int i =1; i<=r; i++){
        //     rfact *= i;
        // }

        // int nrfact = 1; 
        // for(int i =1; i<=n-r; i++){
        //     nrfact *= i;
        // }

        // int ncr = nfact/(rfact*nrfact);
        // int npr = nfact/nrfact;
        // System.out.println(ncr+" "+npr);

        int ncr = fact(n)/(fact(r)*fact(n-r));
        int npr = fact(n)/fact(n-r);
        System.out.println(ncr+" "+npr);


        sc.close();
    }
}
