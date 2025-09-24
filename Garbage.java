public class Garbage {
    @Override
    protected void finalize() {
        System.out.println("Object is being deleted by Garbage Collector");
    }
    public static void main(String[] args) {
        Garbage obj1 = new Garbage();
        Garbage obj2 = new Garbage();

        System.out.println("Before nullifying references");
        System.out.println("obj1: " + obj1);
        System.out.println("obj2: " + obj2);

        obj1 = null;
        obj2 = null;

        System.gc();
        System.out.println("End of program");
    }
}
