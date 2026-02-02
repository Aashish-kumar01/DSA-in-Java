public class syntax {
    public static void Aashish(){
        System.out.println("Abhishek");
        for(int i =1; i<=4; i++){
            System.out.println(i);
        }
    }
    // sabse pehle main function chalta hai, baaki function tabhi chalega agar usko ham call karenge.
    public static void main(String[] args) {
        Aashish(); // function call
        System.out.println("Rahul");
        trishul();

    }
    public static void trishul(){
        System.out.println("Abhay");
    }
    public static void fourth(){
        System.out.println("Aakash");
    }
    
    
    
    // public static void main(String[] args) {
    //     trishul();

    // }
    // public static void trishul(){
    //     System.out.println("Abhay");
    //     fourth();
    // }
    // public static void fourth(){
    //     fifth();
    //     System.out.println("Aakash");
    // }
    // public static void fifth(){
    //     System.out.println("Rahul");
    // }
}
