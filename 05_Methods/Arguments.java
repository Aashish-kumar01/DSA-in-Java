public class Arguments {
    public static void sum(int a, int b){ // Parameters
        System.out.println(a+b);
    }

    public static void max(int x, int y, int z){
        if(x>y && x>z) System.out.println(x);
        else if(y>x && y>z) System.out.println(y);
        else System.out.println(z);

        System.out.println(Math.max(Math.max(x, y), z));
    }
    public static void main(String[] args) {
        sum(3,8); // Arguments
        max(3, 4, 5);
    }
}
