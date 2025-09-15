class Student1{
    String name;
    int age;
    Student1(){
        name="Unknown";
        age= 0;
    }
    Student1(String n, int a){
        this.name=n;
        this.age=a;
    }
    Student1(String n){
        this.name=n;

    } 
    Student1(int a){
        this.age=a;
    }
    void display(){System.out.println("Name: "+name+" Age: "+age);
    }
}
public class ConstructorOverloadingDemo {
    public static void main(String[] args){
        Student1 s1=new Student1();
        Student1 s2=new Student1("Sneha", 19);
        Student1 s3=new Student1("Kanha", 20);
        Student1 s4=new Student1("Ram", 21);
        Student1 s5=new Student1("Sudha",22);
        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();
    }
}
