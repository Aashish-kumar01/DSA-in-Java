// import java.util.ArrayList;
// import java.util.List;
public class printSubsets {
    public static void main(String[] args) {
        String s = "abc";
        // List<String> list = new ArrayList<>();
        subsets("",s,0);
    }

    public static void subsets(String ans, String s, int indx){
        if(indx == s.length()){
            System.out.print(ans+" ");
            return;
        }
        char ch = s.charAt(indx);
        subsets(ans+ch,s,indx+1); // pick
        subsets(ans,s,indx+1); // skip
    }
}