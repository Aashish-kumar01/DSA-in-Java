import java.util.Scanner;
public class stringBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str = "Shruti is a good girl and Aashish is also good";
        String s = sc.nextLine(); // iska kaam hai pure line ko input lena
        System.out.println(s);
        String t = sc.next(); // iska kaam hai space ke aage ka read nahi karega 
        System.out.println(t);
        System.out.println(s.charAt(3));


        sc.close();
    }    
}


