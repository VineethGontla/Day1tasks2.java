
public class ShadowingExample {

    // Class-level variable
    static int num = 10;

    public static void main(String[] args) {
        // Method-level variable (shadows the class-level variable)
        int num = 20;
        System.out.println("Value of num in main: " + num); // 20

        // Call method where variable shadowing happens
        showShadow();

        // Block-level shadowing
        {
            int num1 = 30; // Shadows num from main method
            System.out.println("Value of num in block: " + num1); // 30
        }

        // After block ends, method-level num comes back
        System.out.println("Value of num after block in main: " + num); // 20
    }

    public static void showShadow() {
        // Method-level variable (shadows class-level variable)
        int num = 50;
        System.out.println("Value of num in showShadow method: " + num); // 50
    }
}

