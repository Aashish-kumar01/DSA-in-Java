import java.util.Scanner;
public class palindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        // int mark = 0;
        // int n = str.length();
        // for(int i = 0; i<n/2; i++){
        //     if(str.charAt(i) == str.charA(n-i-1) mark = 1;
        //     else{
        //         mark = 0;
        //         break;
        //     } 
        // }
        // if(mark == 0) System.out.println("It is not a palindrome string");
        // else    System.out.println("It is a palindrome string");
        
        palindrome(str);
        System.out.println(palindrome(str));

        sc.close();
    }
    public static boolean palindrome(String str){
        int n = str.length();
        int i = 0, j = n-1;
        while(i<j){
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
}
