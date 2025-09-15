public class NestedTernaryExample {
    public static void main(String[] args) {
        int num = 0;
        String result = (num > 0) ? "Positive" 
        : (num < 0) ? "Negative" 
        : "Zero";
        System.out.println("The number is: " + result);
    }
    
}
