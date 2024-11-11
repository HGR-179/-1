public class RightTriangle {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two side lengths as command-line arguments.");
            return;
        }

        // Parse the side lengths from the command-line arguments
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);

        // Calculate the hypotenuse using the Pythagorean theorem
        double c = Math.sqrt(a * a + b * b);

        // Calculate the area of the right triangle
        double area = (a * b) / 2;

        // Display the results
        System.out.println("Side a: " + a);
        System.out.println("Side b: " + b);
        System.out.println("Hypotenuse (c): " + c);
        System.out.println("Area: " + area);
    }
}
