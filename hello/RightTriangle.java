public class RightTriangle {
    public static void main(String[] args) {
        try {
            checkArgsLength(args);

            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);

            double c = Math.sqrt(a * a + b * b);

            double area = (a * b) / 2;

            System.out.println("Side a: " + a);
            System.out.println("Side b: " + b);
            System.out.println("Hypotenuse (c): " + c);
            System.out.println("Area: " + area);
        } catch (Exception e) {
            System.out.println("Please provide two side lengths as command-line arguments.");
        }
    }

    private static void checkArgsLength(String[] args) throws Exception {
        if (args.length < 2) {
            throw new Exception("Insufficient arguments");
        }
    }
}
