public class isLeapYear
    public static void main(String[] args)
    {
        int year = Integer.parseInt(args[0]);
        boolen isLeapYear;

        // divisible by 4 but not 100
        isLeapYear = (year % 4 == 0) && (year % 100 != 0);

        //or divisiable by 400
        isLeapYear = isLeapYear || (year % 400 == 0);

        System.out.println(isLeapYear)
    }
}