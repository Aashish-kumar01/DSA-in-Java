import java.util.Scanner;
public class hw4If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of y: ");
        int y = sc.nextInt();

        if(x==0 && y==0) System.out.println("This is the origin.");
        else if(x==0) System.out.println("The point is on y axis.");
        else if(y==0) System.out.println("The Point is on x-axis.");
        else if (x>0 && y>0) System.out.println("The Point is lie in the first quadrant.");
        else if(x>0 && y<0) System.out.println("The Point is in the fourth quadrant.");
        else if(x<0 && y>0) System.out.println("The Point is lie in the Second quadrant.");
        else System.out.println("The Point is in the third quadrant.");

        sc.close();
    }
}
                 