class Employee {
    public double calculateSalary() {
        return 0;
    }
}
class Manager extends Employee {
    @Override
    public double calculateSalary() {
        double base = 50000;
        double bonus = 20000;
        return base + bonus;
    }
}
class Programmer extends Employee {
    @Override
    public double calculateSalary() {
        double base = 40000;
        double overtime = 10000;
        return base + overtime;
    }
}
public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Manager();
        Employee e2 = new Programmer();
        System.out.println("Manager Salary: " + e1.calculateSalary());
        System.out.println("Programmer Salary: " + e2.calculateSalary());
    }
}

