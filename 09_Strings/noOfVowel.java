// import java.util.Scanner;
public class noOfVowel {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        String s = "ashieglhseihglncmncisolkdflanxacasoiw";
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            // if(s.charAt(i) == 'a') count++;
            // else if(s.charAt(i) == 'e') count++;
            // else if(s.charAt(i) == 'i') count++;
            // else if(s.charAt(i) == 'o') count++;
            // else if(s.charAt(i) == 'u') count++;
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') count++;
        }
        System.out.println(count);
    }
}
