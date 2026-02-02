public class SubStringsOfString {
    public static void main(String[] args) {
        // String s = "JaiShankar";
        // System.out.println(s.substring(3)); // ye print karega 3 index se aage ka
        // System.out.println(s.substring(1,5)); // ye print karega 1 index se 4 tak
        // System.out.println(s.charAt(0));
         

        // String str = "Aashish";
        // for(int i=0; i<=str.length(); i++){
        //     for(int j = i+1; j<=str.length(); j++){
        //         System.out.print(str.substring(i,j)+" ");
        //         // String st = str.substring(i,j);
        //     }
        //     System.out.println();
        // }

        String s = "abcdef";
        int[] map = new int[128];
        char c = s.charAt(3);
        map[c] = 10;
        System.out.println((int)(c));
        // System.out.println(map[c]);
        System.out.println(map[100]);

    }
}
                