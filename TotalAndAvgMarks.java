public class TotalAndAvgMarks {
    public static void main(String[] args) {
        if (args.length < 4) {
            System.out.println("Please enter: name marks1 marks2 marks3");
            return;
        }

        String name = args[0];
        int mark1 = Integer.parseInt(args[1]);
        int mark2 = Integer.parseInt(args[2]);
        int mark3 = Integer.parseInt(args[3]);

        int total = mark1 + mark2 + mark3;
        double average = total / 3.0;

        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}
