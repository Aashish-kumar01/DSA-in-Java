public class StringBuilders {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("Aashish");
        // System.out.println(sb.length()+" "+sb.capacity());
        // System.out.println(sb);
        // sb.append("Kumar");
        // System.out.println(sb);


        StringBuilder s = new StringBuilder(5); // isme ham capacity bhi daal sakte agar ham usko constant rakhna chahte hai to lekin jab ham koi aisi string ko append kara de jo given capacity se badi ho to capacity badh jaati hai us string ke size plus available capacity
        s.append("Aashish");
        System.out.println(s.length()+" "+s.capacity());
        System.out.println(s);

                        
        s.setCharAt(0,'K');
        System.out.println(s);

        // change to string
        String t = s.toString();
        System.out.println(t);

    }    
}
     