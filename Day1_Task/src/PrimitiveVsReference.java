
public class PrimitiveVsReference {

    public static void main(String[] args) {
        
        // Primitive example
        int num1 = 10;  
        int num2 = num1;  
        num2 = 20;  
        System.out.println("num1 = " + num1);  
        System.out.println("num2 = " + num2);  

        // Reference example
        String str1 = "Hello";  
        String str2 = str1;  
        str2 = "World"; 
        System.out.println("str1 = " + str1);  
        System.out.println("str2 = " + str2);  
    }
}

