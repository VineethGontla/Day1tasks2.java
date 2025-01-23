
public class VariableScopeExample {

    // Class-level variable (Instance variable)
    int classVar = 10;

    // Static variable (belongs to the class)
    static int staticVar = 20;

    public static void main(String[] args) {
        // Method-level variable
        int methodVar = 30;

        System.out.println("Inside main method:");
        System.out.println("classVar = " + new VariableScopeExample().classVar);  // Access class variable
        System.out.println("staticVar = " + staticVar);  // Access static variable
        System.out.println("methodVar = " + methodVar);  // Access method variable
        
        // Calling another method to show scope of local variables
        displayLocalVariable();
        
        // Block-level variable
        {
            int blockVar = 50;  // Block-level variable
            System.out.println("Inside block:");
            System.out.println("blockVar = " + blockVar);  // Access block-level variable
        }
        
        
    }

    // Another method to show method-level variable scope
    public static void displayLocalVariable() {
        int localVar = 40;  // Local variable inside the method
        System.out.println("Inside displayLocalVariable method:");
        System.out.println("localVar = " + localVar);  // Access local variable
    }
}

