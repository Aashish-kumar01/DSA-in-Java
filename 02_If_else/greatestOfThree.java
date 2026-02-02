import java.util.Scanner;
public class greatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st digit: ");
        int x = sc.nextInt();
        System.out.print("Enter the 2md digit: ");
        int y = sc.nextInt();
        System.out.print("Enter the 3rd digit: ");
        int z = sc.nextInt();

        // if (x == y && x ==z) System.out.println("The Numbers are equal");
        // else if(x>y && x>z) System.out.println("X is the greatest number.");
        // else if(y>x && y>z) System.out.println("Y is the greatest number.");
        // else System.out.println("Z is the greatest number.");

        if (x>=y){
            if (x>=z) System.out.println("X is the greatest Number "+x);
            else System.out.println("Z is the greatest number "+z);
        }
        else {
            if (y>=z) System.out.println("Y is the greatest number "+y);
            else System.out.println("Z is the greatest number "+z);
        }

        sc.close();

    }
}
