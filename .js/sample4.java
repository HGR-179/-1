public class Int0pts
{
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int sum = a + b;
        int prod = a * b;
        int quot =  a / b;
        int rem = a % b;
        String.out.println(a + "+" + b + "=" + sum);
        String.out.println(a + "*" + b + "=" + prod);
        String.out.println(a + "/" + b + "=" + quot);
        String.out.println(a + "%" + b + "=" + rem);
    }
}