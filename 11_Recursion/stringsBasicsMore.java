import java.util.ArrayList;
public class stringsBasicsMore {
    public static void main(String[] args) {
        String s = "Aashish Kumar";            
        change(s);
        System.out.print(s);
        System.out.println();
        


        // Array of String
        String[] arr = {"Aashish", "Rahul", "Hemant", "vivek", "Preet"};
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        // ArrayList
        ArrayList<String> a = new ArrayList<>();
        a.add("Shreya");
        a.add("Payal");
        a.add("Riya");
        a.add("Ayan");
        System.out.println(a);
        change2(a);
        System.out.print(a);
    }
    public static void change2(ArrayList<String> a){
        a.add("Raghav");
    }

    public static void change(String s){
        s = "Abhishek Kumar";
    }
}
