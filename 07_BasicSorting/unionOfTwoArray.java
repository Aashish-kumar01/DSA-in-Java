import java.util.ArrayList;

public class unionOfTwoArray {
    public static void main(String[] args) {
        int[] a = { 2, 2, 4, 6, 6,  13, 2, 2};
        int[] b = { 2, 4, 13, 65, 234 };
        findunion(a, b);
        ArrayList<Integer> ans = findunion(a,b);
        System.out.print(ans);
    }

    public static ArrayList<Integer> findunion(int a[], int b[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 1; i < a.length; i++) {
            // if (a[i] == a[i - 1]) {

            // } else if(i<=a.length-1){
            //     ans.add(a[i-1]);
            //     // ans.add(a[i]);
            //     // i++;
            // }
            // else if(a[i] != a[i-1]){
            //     ans.add(a[i-1]);
            //     ans.add(a[i]);

            // }
            if(a[i] == a[i-1]){
            }
            else if(i == a.length-1 && a[i] == a[i+1]){
                ans.add(a[i]);
            }
            else if(i == a.length-1 && a[i] == a[i+1]){
                ans.add(a[i]);
                ans.add(a[i+1]);
            }
            else{
                ans.add(a[i-1]);
            }

        }
        return ans;
        // for(int i =0; i<b.length; i++){
        // if(b[i] == )
    }
}
