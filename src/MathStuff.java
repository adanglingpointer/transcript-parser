public class MathStuff {
    public static void main(String[] args) {
        System.out.println(1 * 2 + 3 - 4); // 1

        System.out.println(7 / 4); // 1
        // integer as default type

        System.out.println(7f / 4); // 1.75
        // casting a float

        System.out.println((double)7 / 4); // 1.75
        // casting a double

        System.out.println(7 % 4); // 3
        // modulo, returns the remainder

        int x = 1;
        System.out.println(x++); // 1
        System.out.println(x); // 2

        int y = 1;
        System.out.println(++y); // 2
        System.out.println(y); // 2

        System.out.println(Math.abs(-5)); // 5
        // absolute value

        System.out.println(Math.ceil(5.4)); // 6.0
        // ceiling function; round up to an integer

        System.out.println(Math.floor(5.99)); // 5.0

        int num1 = 3;
        int num2 = 5;

        System.out.println(Math.min(num1, num2)); // 3
        // returns the smallest

        System.out.println(Math.max(num1, num2)); // 5
        // returns the largest

        System.out.println(Math.pow(2, 3)); // 8.0
        // power function, 2 to the 3rd power

        System.out.println(Math.random()); // 0.9276631486919007
        // between 0 and 1 (as a double)

        System.out.println((int)(Math.random() * 10)); // 8
        // cast as an integer, between 0 and 9

        System.out.println(Math.round(5.4)); // 5
        System.out.println(Math.round(5.5)); // 6

        System.out.println(Math.sqrt(81)); // 9.0

        System.out.println(Math.PI); // 3.141592653589793

        System.out.println(Math.E); // 2.718281828459045

        // Note: ctrl + q
        //       brings up documentation on any function our cursor is within
    }
}
