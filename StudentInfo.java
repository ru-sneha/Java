public class StudentInfo{
    static String schoolName = "Green Valley School";

    String studentName;
    int age;

    void showInfo() {
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + age);
        System.out.println("School: " + schoolName);
    }

    public static void main(String[] args) {
        StudentInfo s1 = new StudentInfo();
        s1.studentName = "Aman";
        s1.age = 15;

        StudentInfo s2 = new StudentInfo();
        s2.studentName = "Sara";
        s2.age = 16;

        s1.showInfo();
        System.out.println();
        s2.showInfo();
    }
} 