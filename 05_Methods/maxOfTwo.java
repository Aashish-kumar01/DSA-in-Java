public class maxOfTwo {
    public static int max(int a, int b, int c){
        if(a>b && b>c) return a;
        else if(b>a && b>c) return b; 
        else return c;
    }
    public static void main(String[] args) {
        System.out.println(max(2,3,5));
    }
}
