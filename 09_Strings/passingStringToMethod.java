public class passingStringToMethod {
    public static void change(String x){
        x = "Abhishek";
    }
    public static void main(String[] args) {
        String x = "Aashish";
        System.out.println(x);
        change(x); // isme x ek naye address ko point kar raha hai
        System.out.println(x); // pass by value ho jaayega
        x = "Abhishek";
        System.out.println(x); // yaha pe x ke value change ho jaayega
    }
}
