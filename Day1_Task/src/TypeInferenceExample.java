
public class TypeInferenceExample {

    public static void main(String[] args) {

        // Using 'var' to infer the type of the variable
        var number = 10;  // inferred as int
        var message = "Hello, Java 10!";  // inferred as String
        var decimal = 3.14;  // inferred as double
        var isJavaFun = true;  // inferred as boolean
        
        // Printing the inferred types
        System.out.println("Inferred number (int): " + number);
        System.out.println("Inferred message (String): " + message);
        System.out.println("Inferred decimal (double): " + decimal);
        System.out.println("Inferred isJavaFun (boolean): " + isJavaFun);
        
        // Uncommenting the following line would cause a compile-time error:
        // number = "This is a string"; // Error: incompatible types
        
    }
}
