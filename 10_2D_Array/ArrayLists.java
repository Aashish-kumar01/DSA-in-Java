import java.util.ArrayList;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1); a.add(2); a.add(3);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(4); b.add(5); b.add(6); b.add(7);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(8); c.add(9);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a); arr.add(b); arr.add(c);
        
        System.out.println(arr);

        // Print using for each loop
        // for(ArrayList<Integer> x: arr){
        //     for(int y: x){
        //         System.out.print(y+" ");
        //     }
        //     System.out.println();
        // }

        // Print the 2DArraylist 
        // for(int i = 0; i<arr.size(); i++){
        //     for(int j = 0; j<arr.get(i).size(); j++){
        //         System.out.print(arr.get(i).get(j)+" ");
        //     }
        //     System.out.println();
        // }







        
        // System.out.println(fact(5));
        // int rowIndex = 21; 
        // int i = 1;
        // long x = (fact(rowIndex)/(fact(rowIndex-i)*fact(i)));
        // System.out.println(x);
        // System.out.println((int)x);
        
    }

    // public static long fact(int n){
    //         if(n == 0 || n == 1) return 1;
    //         long ans = n*fact(n-1);
    //         return ans;
    //     }
}
