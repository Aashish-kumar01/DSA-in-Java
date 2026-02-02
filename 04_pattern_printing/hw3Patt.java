import java.util.Scanner;
public class hw3Patt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the box: "); 
        int n = sc.nextInt();

        for(int i = 97; i<97+n; i++){
            for(int j = 65; j<65+n; j++){
                if(i%2 == 0){
                    System.out.print((char)(i-32)+" ");
                }
                else{
                    System.out.print((char)i+" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
                                  