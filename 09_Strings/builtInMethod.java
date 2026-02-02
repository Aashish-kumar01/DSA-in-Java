public class builtInMethod {
    public static void main(String[] args) {
        // String s = "AashIsh Kumar";
        // System.out.println(s.indexOf('K'));

        // String st = "Harshita";
        // System.out.println(st.contains("harsh"));
        // System.out.println(st.contains("arsh"));
        // System.out.println(st.contains("arshita"));
        // System.out.println(st.startsWith("Har"));
        // System.out.println(st.endsWith("Har"));

        // System.out.println(s.toLowerCase());
        // System.out.println(s.toUpperCase());


        // Compare to functions
        String a = "Aashish";
        String b = "Sneha";
        b.toLowerCase();
        System.out.println(a.compareTo(b));
        System.out.println(a.concat(b));
        compareto(a,b);
        System.out.println(compareto(a,b));
        
    }
    public static int compareto(String a, String b){
        if(a.length() == 0 || b.length() == 0) return a.length() - b.length();
        for(int i = 0; i<a.length(); i++){
            if(a.length() != b.length()){
                return (a.length() - b.length());
            }
            else if(a.charAt(i) != b.charAt(i)){
                int n = a.charAt(i);
                int m = b.charAt(i);
                return n-m;
            }
        }
        return -1;
    }
}
