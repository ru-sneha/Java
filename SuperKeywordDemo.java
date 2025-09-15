class Parent{
    int num = 50;
    void show(){
        System.out.println("Parent show()");
    }
}
class Child extends Parent{
    int num = 100;
    void show(){
        System.out.println("Child show()");
        super.show();
        System.out.println("Parent num: " + super.num);
    }
}
public class SuperKeywordDemo {
    public static void main(String[] args){
        Child c = new Child();
        c.show();
    }
    
}
