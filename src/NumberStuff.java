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
    }
}
