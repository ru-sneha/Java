class Calc {
    public int add (int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }

    double add(double a, double b) {
        return a + b;
    }
}
public class Calculator{
    public static void main(String[]args){
        Calc c = new Calc();
        System.out.println("Sum of 2 integers: " + c.add(1,10));
        System.out.println("Sum of 3 integers: " + c.add(2,6,9));
        System.out.println("Sum of 2 double: " + c.add(2.5, 3.5));
    }
}
