public class VariableTypesDemo {

    // Instance variable
    int instanceVar = 10;

    // Static variable
    static int staticVar = 20;

    public static void main(String[] args) {
        // Local variable
        int localVar = 5;
        
        // Creating an object to access instance variable
        VariableTypesDemo obj = new VariableTypesDemo();
        
        // Accessing instance and static variables using the object
        System.out.println("Instance Variable (via object): " + obj.instanceVar);
        System.out.println("Static Variable (via class name): " + VariableTypesDemo.staticVar);

        // Accessing local variable inside the main method
        System.out.println("Local Variable (inside main method): " + localVar);

        
    }
}

