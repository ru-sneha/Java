class Animalal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dogesh extends Animalal{
    void sound(){
        System.out.println("Dog barks");
    }
}
public class OverridingExample {
    public static void main(String[] args){
    Animalal a = new Animalal();
    a.sound();

    Animalal d = new Dogesh();
    d.sound();
    }
}
