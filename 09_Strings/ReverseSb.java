public class ReverseSb {
    public static void main(String[] args) {
        String s = "Aashish";
        StringBuilder sb = new StringBuilder(s);
        // sb.reverse();
        // sb.deleteCharAt(1); // it is costly process
        // sb.delete(2,4);
        // String st = sb.toString();
        // System.out.println(st);
        int i = 0, j = sb.length()-1;
        while(i<=j){
            char tem1 = sb.charAt(i);
            char temp2 = sb.charAt(j);
            sb.setCharAt(i, temp2);
            sb.setCharAt(j, tem1); 
            i++;
            j--;
        }
        System.out.println(sb);


        // reverse the string
        // String a = "Aashish";
        // StringBuilder b = new StringBuilder(a);
        // b.reverse();
        // a = b.toString();
        // System.out.println(a);

    }
}
