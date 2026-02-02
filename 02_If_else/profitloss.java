import java.util.Scanner;
public class profitloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Cost Price: ");
        int cp = sc.nextInt();
        System.out.print("Enter the Selling Pirce: ");
        int sp = sc.nextInt();
        // int y = sp-cp;
        if(sp > cp){
            double p = sp-cp;
            System.out.println("Seller has made profit "+p);
            System.out.println("The profit percent is "+p/cp*100);
            // System.out.println(y);
        }
        if(sp == cp){                              
            System.out.println("Seller has not made any profit nor loss.");
        }
        if(sp < cp){
            double l = cp-sp;
            System.out.println("Seller has made loss "+l);
            System.out.println("The loss percent is "+l/cp*100);
        }
        // if(sp > cp){
        //     double p = sp-cp;
        //     System.out.println("Seller has made profit "+p);
        //     System.out.println("The profit percent is "+p/cp*100);
        //     // System.out.println(y);
        // }
        // else if(sp == cp){                              
        //     System.out.println("Seller has not made any profit nor loss.");
        // }
        // else{
        //     double l = cp-sp;
        //     System.out.println("Seller has made loss "+l);
        //     System.out.println("The loss percent is "+l/cp*100);
        // }

        sc.close();                         
    }                       
}                              
