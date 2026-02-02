import java.util.Scanner;
public class hw2If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        if(x>0 && x<69) System.out.println("The number is smaller than the given number.");
        else if (x>0 && x>69) System.out.println("The number is not smaller than the given number");
        else if(x<0){
             x = -x;
            if(x<69) System.out.println("The number is smaller than the given number.");
            else if(x>69) System.out.println("The number is not smaller than the given number");
        }

        sc.close();
    }
}
                                                                                            