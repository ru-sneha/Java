import java.util.Scanner;
class Garments {
    private String GCode;
    private String GType;
    private int GSize;
    private String GFabric;
    private float GPrice;
    public Garments() {
        GCode = "Not Allowed";
        GType = "Not Allowed";
        GFabric = "Not Allowed";
        GSize = 0;
        GPrice = 0;
    }
    public void Assign() {
        if (GFabric.equalsIgnoreCase("COTTON")) {
            if (GType.equalsIgnoreCase("Trouser")) {
                GPrice = 1300;
            } else if (GType.equalsIgnoreCase("Shirt")) {
                GPrice = 1100;
            }
        } else {
            if (GType.equalsIgnoreCase("Trouser")) {
                GPrice = 1300 * 0.9f;
            } else if (GType.equalsIgnoreCase("Shirt")) {
                GPrice = 1100 * 0.9f;
            }
        }
    }
    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Garment Code: ");
        GCode = sc.nextLine();
        System.out.print("Enter Garment Type (Trouser/Shirt): ");
        GType = sc.nextLine();
        System.out.print("Enter Garment Size: ");
        GSize = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Fabric (Cotton/Silk/Other): ");
        GFabric = sc.nextLine();
        Assign();
        sc.close();
    }
    public void Display() {
        System.out.println("\nGarment Details:");
        System.out.println("Code: " + GCode);
        System.out.println("Type: " + GType);
        System.out.println("Size: " + GSize);
        System.out.println("Fabric: " + GFabric);
        System.out.println("Price: " + GPrice);
    }
}
public class GarmentsDemo {
    public static void main(String[] args) {
        Garments g1 = new Garments();
        g1.Input();
        g1.Display();
    }
}
