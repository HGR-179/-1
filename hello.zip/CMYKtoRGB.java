public class CMYKtoRGB {
    public static void main(String[] args) {
        if (args.length < 4) {
            System.out.println("Please provide four arguments: cyan, magenta, yellow, and black (in the range 0 to 1).");
            return;
        }

        // Parse CMYK values from command-line arguments
        double cyan = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);
        double yellow = Double.parseDouble(args[2]);
        double black = Double.parseDouble(args[3]);

        // Convert CMYK to RGB
        int red = (int) Math.round(255 * (1 - cyan) * (1 - black));
        int green = (int) Math.round(255 * (1 - magenta) * (1 - black));
        int blue = (int) Math.round(255 * (1 - yellow) * (1 - black));

        // Display the RGB result
        System.out.println("RGB values:");
        System.out.println("Red: " + red);
        System.out.println("Green: " + green);
        System.out.println("Blue: " + blue);
    }
}
