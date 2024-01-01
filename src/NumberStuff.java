import java.math.BigDecimal;
import java.math.BigInteger;

public class NumberStuff {
    public static void main(String[] args) {
        byte myByte = 127;
        boolean myFlag = true;
        short myBigShort = 32767;
        char myChar = 'A';
        char biggerShort = 64000;
        double myDouble = 3.141592;
        float myFloat = 3.141592f;

        // Problems with numbers
        double num1 = 2.15;
        double num2 = 1.10;
        System.out.println(num1 - num2); // 1.0499999999999998

        float num3 = 2.15f;
        float num4 = 1.10f;
        System.out.println(num3 - num4); // 1.0500001

        // hexadecimal
        byte anotherByte = 0x1f;

        // binary
        int anotherInt = 0b01010101;
        System.out.println(anotherInt); // 85

        int binary1 = 0b01;
        System.out.println(binary1); // 1

        // manipulating bits
        int binary2 = 0b01 | 0b10;
        System.out.println(binary2); // 3

        int binary3 = 1 | 2;
        System.out.println(binary3); // 3

        int anotherBinary = 0b01 | 0b10 | 0b100;
        System.out.println(anotherBinary);  // 7
        // 1 | 2 | 4

        // or | will yield a 1 with any 1s
        // and & will yield a 1 if all 1s

        System.out.println(anotherBinary & 4); // 4
        // determine which bits are on or off
        // using a bit mask

        // big decimal to fix float issue
        BigDecimal num1b = new BigDecimal("2.15");
        BigDecimal num2b = new BigDecimal("1.10");
        // can only use - for subtraction with primitives
        System.out.println(num1b.subtract(num2b)); // 1.05

        BigDecimal num3b = new BigDecimal("100");
        byte byte3b = num3b.byteValue();
        System.out.println(byte3b); // 100

        BigDecimal num4b = new BigDecimal("3.141592");
        byte byte4b = num4b.byteValue();
        System.out.println(byte4b); // 3

        BigDecimal num5b = new BigDecimal("1024");
        byte byte5b = num5b.byteValue();
        System.out.println(byte5b); // 0
        System.out.println(num5b.doubleValue()); // 1024.0

        BigInteger myInt = new BigInteger("32872378328756");
    }
}
