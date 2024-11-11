public class CMYKtoRGB {
    public static void main(String[] args) {
        try {
            checkArgsLength(args);
            
            double cyan = Double.parseDouble(args[0]);
            double magenta = Double.parseDouble(args[1]);
            double yellow = Double.parseDouble(args[2]);
            double black = Double.parseDouble(args[3]);

            int red = (int) Math.round(255 * (1 - cyan) * (1 - black));
            int green = (int) Math.round(255 * (1 - magenta) * (1 - black));
            int blue = (int) Math.round(255 * (1 - yellow) * (1 - black));

            System.out.println("RGB values:");
            System.out.println("Red: " + red);
            System.out.println("Green: " + green);
            System.out.println("Blue: " + blue);
        } catch (Exception e) {
            System.out.println("Please provide exactly four arguments: cyan, magenta, yellow, and black (in the range 0 to 1).");
        }
    }
    private static void checkArgsLength(String[] args) throws Exception {
        if (args.length < 4) {
            throw new Exception("Insufficient arguments");
        }
    }
}
