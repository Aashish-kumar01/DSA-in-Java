public class CharDataType {
    public static void main(String[] args) {
        // char Aashish = 'a';
        // System.out.println(Aashish);
        // char amir = 'e';
        // System.out.println(amir);
        // char era = '+';
        // System.out.println(era);



        // Typecasting - ek data se dusre data type conversion
        // char ch = 'A';
        // int x = ch;  // Implicit typecasting
        // System.out.println(x);

        char piyush = '$';
        int y = (int)piyush;  // Explicit typecasting
        System.out.println(y);

        char harsh = '3';
        System.out.println((int)harsh);

        char c = 'b';
        System.out.println(c+0);

        char ca = 'c';
        System.out.println(ca*2);

        // Integer to character
        int x = 65;
        char cu = (char)x;                                      
        System.out.println(cu);

        int a = 4*2/3;
        System.out.println(a); 
        // The output of this is 2 kyunki jab hamara arithmetic opeartion kewal division aur multliplication me hai to waha pe hamko opeartion left to right karte jaana hai aur yaha pe sabhi integers the to us hisab decimal ko neglect kar answer 2 hoga.

        // aur agar multiplication aur division ke sath agar addition aur substraction bhi hota to pehle multiplication aur division hoga fir uske baad addition aur substraction.
    }
}



