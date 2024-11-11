public class HelloGoodbye {
    public HelloGoodbye() {
    }

    public static void main(String[] var0) {
        try {
            checkArgsLength(var0);

            String var1 = var0[0];
            String var2 = var0[1];
            System.out.println("Hello " + var1 + " and .");
            System.out.println("Goodbye " + var2 + " and " + var1 + ".");
        } catch (Exception e) {
            System.out.println("Please provide two names as command-line arguments.");
        }
    }

    private static void checkArgsLength(String[] var0) throws Exception {
        if (var0.length < 2) {
            throw new Exception("Insufficient arguments");
        }
    }
}
