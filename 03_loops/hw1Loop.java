import java.util.Scanner;
public class hw1Loop {
    public static void main(String[] args) {
        @SuppressWarnings("resource")  // ham sc.close kar diye hai uske baad bhi warning aa rha hai to iske liye supress kar diye
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your name: ");
        // String name = sc.nextLine();
        // int i;
        // for(i=1; i<5; i++){
        //     System.out.println(name);
        // }

        // int x = sc.nextInt();
        int k;
        // for(k=1; k<=100; k++){
        //     if(k%2 == 0) System.out.println(k);
        // }

        // ye wala code zyada efficent hai kyunki isme loop sirf 50 baar chalega.
        for(k=2; k<=100; k=k+2){
            System.out.println(k);
        }
        
        // for(k=1; k<=100; k++){
        //     System.out.print((k%2 == 0) ? k:" ");
        // }
        
        sc.close();
    }
}
   