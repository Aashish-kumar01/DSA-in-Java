
class ComplexNumber{
    double x; 
    double y;
    ComplexNumber(double x, double y){
        this.x = x;
        this.y = y;
    }
    ComplexNumber(){}
    void print(){
        if(y>=0) System.out.println(x+" + i" + y);
        else{
            // y = -y;
            System.out.println(x+" - i"+(-y));
        }
    }

    public void add(ComplexNumber z){
        this.x += z.x;
        this.y += z.y;
    }

    void multiply(ComplexNumber z){
        double tempx = x;
        x = x*z.x - y*z.y;
        y = tempx*z.y + y*z.x;
    }

    void divide(ComplexNumber z){
        double tempx = x;
        double deno = z.x*z.x + z.y*z.y;
        x = (x*z.x + y*z.y)/deno;
        y = (y*z.x - tempx*z.y)/deno;
    }
}
public class ComplexNumberClass {
    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(2,-5);
        z1.print();
        ComplexNumber z2 = new ComplexNumber(3,4);
        z2.print();
        z1.add(z2);
        z1.print();
        z2.print();
        z2.multiply(z1);
        z1.print();
        z2.print();
        z1.divide(z2);
        z1.print();
        z2.print();
    }
}
