
public class FinalVariableExample {

    // Final instance variable
    final int instanceVar;

    // Final static variable
    static final double PI = 3.14159;

    // Constructor to initialize final instance variable
    public FinalVariableExample(int value) {
        instanceVar = value;  // Can only be assigned once
    }

    public static void main(String[] args) {
        // Final local variable
        final int maxScore = 100;

        // Trying to change the final variable (will cause an error)
        // Uncommenting the next line will result in an error:
        // maxScore = 200;  // Error: cannot assign a value to final variable maxScore

        // Create an object to access instance variable
        FinalVariableExample obj = new FinalVariableExample(10);

        // Printing final variables
        System.out.println("Final instance variable: " + obj.instanceVar);
        System.out.println("Final static variable (PI): " + PI);
        System.out.println("Final local variable (maxScore): " + maxScore);
    }
}

