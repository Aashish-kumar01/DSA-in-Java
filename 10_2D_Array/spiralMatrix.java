import java.util.ArrayList;
public class spiralMatrix {
    public static void main(String[] args) {
        
    }

    public ArrayList<Integer> spirallyTraversing(int[][] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length, m = arr[0].length;
        int firstrow = 0, lastrow = n-1, firstcol = 0, lastcol = m-1;
        while(firstrow <= lastrow && firstcol <= lastcol){
            // right
            for(int j = firstcol; j<=lastcol; j++){
                ans.add(arr[firstrow][j]);
            }
            firstrow++;
            if(firstrow>lastrow || firstcol>lastcol) break;
            // down
            for(int i = firstrow; i<=lastrow; i++){
                ans.add(arr[i][lastcol]);
            }
            lastcol--;
            if(firstrow>lastrow || firstcol>lastcol) break;
            // left
            for(int j = lastcol; j>=firstcol; j--){
                ans.add(arr[lastrow][j]);
            }
            lastrow--;
            if(firstrow>lastrow || firstcol>lastcol) break;
            // up
            for(int i = lastrow; i>=firstrow; i--){
                ans.add(arr[i][firstcol]);
            }
            firstcol++;
        }
        return ans;
    }
}
