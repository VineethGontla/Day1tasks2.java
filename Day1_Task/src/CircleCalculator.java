
public class CircleCalculator {

    // Define constants using static final
    public static final double PI = 3.14159;  // constant for Pi
    public static final double RADIUS = 5.0;  // constant for radius of the circle

    public static void main(String[] args) {
        // Calculate the area and circumference
        double area = PI * RADIUS * RADIUS;  // Area = PI * radius^2
        double circumference = 2 * PI * RADIUS;  // Circumference = 2 * PI * radius
        
        // Display the results
        System.out.println("For a circle with radius: " + RADIUS);
        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circumference);
    }
}
