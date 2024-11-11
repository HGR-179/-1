public class HelloGoodbye {
    public static void main(String[] args){
        if (args.length < 2) {
            System.out.println("please provide two names as command-line arguments.");
            return;
        }
        
        String name1 = args[0];
        String name2 = args[1];

        System.out.println("Hello " + name1 + " and " + ".");
        System.out.println("Goodbye " + name2 + " and " + name1 + ".");
    }
}
