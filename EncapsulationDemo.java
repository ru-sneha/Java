public class EncapsulationDemo {
    public static class Student {
    private String name;
    private int marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("ACC123", 5000);
        acc.deposit(1500);
        acc.withdraw(2000);
        System.out.println("Balance: " + acc.getBalance());

        Student s1 = new Student();
        s1.setName("Rohit");
        s1.setMarks(85);

        System.out.println("Student: " + s1.getName());
        System.out.println("Marks: " + s1.getMarks());
    }
}
