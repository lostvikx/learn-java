public class PrintFormat {
    public static void main(String[] args) {
        // printf: format strings in the sys.out
        // printf(format string, value)
        // % [flags] [precision] [width] [conversion-character]
        
        boolean isPassed = true;
        char currency = '$';
        String name = "Emma";
        int num = 17;
        double pi = (double) 22 / 7;

        // [conversion-character]
        System.out.printf("Passed: %b\n", isPassed);
        System.out.printf("Currency: %c\n", currency);
        System.out.printf("Name: %s\n", name);

        System.out.printf("Lucky Number: %d\n", num);
        System.out.printf("Pi: %f\n", pi);

        // [width] (String): min. number of chars to display.
        System.out.printf("Hello, %10s\n", name);

        // [precision] (double/float): sets number of digits of precision.
        System.out.printf("Pi: %.2f\n", pi);

        // [flag]: adds an effect
        // - : left-align (right align by default, when width is set)
        // + : output int sign (+ or -)
        // 0 : numeric values are zero padded (specify width)
        // , : comma grouping of large numeric values

        System.out.printf("Bank Balance: %,d\n", 1000000);
        System.out.printf("Net Profit: %+.2f\n", -318.2378);
    }
}
