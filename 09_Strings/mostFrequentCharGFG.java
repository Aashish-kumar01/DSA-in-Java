import java.util.Arrays;
import java.util.Scanner;
public class mostFrequentCharGFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        // String t = sc.nextLine();
        System.out.println(check(s));
        sc.close();
    }

    public static char check(String s){
        int n = s.length();
        int maxfreq = -1;
        char ans = s.charAt(0);
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int i = 0, j= 0;
        while(j<n){
            if(arr[i] == arr[j]) j++;
            else{
                int freq = j-i;
                if(freq > maxfreq){
                    maxfreq = freq;
                    ans = arr[i];
                }
                i = j;
            }
        }
        int freq = j-i;
        if(freq > maxfreq){
            maxfreq = freq;
            ans = arr[i];
        }
        return ans;
    }
        
    // public static char check(String s){
    //     int n = s.length();
    //     int maxfreq = -1;
    //     char ans = s.charAt(0);
    //     for(int i = 0; i<n; i++){
    //         int freq = 1;
    //         char ch = s.charAt(i);
    //         for(int j = i+1; j<n; j++){
    //             if(s.charAt(j) == ch) freq++;
    //         }
    //         if(freq>maxfreq){
    //             maxfreq = freq;
    //             ans = ch;
    //         }
    //         else if(freq==maxfreq && ch<ans){
    //             ans = ch;
    //         }
    //     }
    //     return ans;
    // }
}
