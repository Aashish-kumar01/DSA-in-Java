public class ReturnType {
    public static int Aashish(){
        System.out.println("Abhishek");
        return 5; // iska kaam hota value store karna aur iske niche agar kuch aur sout hai to wo print nahi hoga
    }
    public static void main(String[] args) {
        System.out.println(Aashish());
        Aashish();
        System.out.println(4+Aashish());
    }
}
