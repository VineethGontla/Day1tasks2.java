
public class DefaultValues {

    // Instance variables
    int intVar;        // Default value: 0
    boolean boolVar;   // false
    String strVar;     //null

    // Static variables
    static double doubleVar;  
    static char charVar;      

    public static void main(String[] args) {
        // Creating an object to access instance variables
        DefaultValues obj = new DefaultValues();

       
        System.out.println("Default value of instance intVar: " + obj.intVar);        // 0
        System.out.println("Default value of instance boolVar: " + obj.boolVar);      // false
        System.out.println("Default value of instance strVar: " + obj.strVar);        // null

       
        System.out.println("Default value of static doubleVar: " + doubleVar);       // 0.0
        System.out.println("Default value of static charVar: " + charVar);           // '\u0000'
    }
}
