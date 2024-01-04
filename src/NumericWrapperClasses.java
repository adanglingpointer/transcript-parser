public class NumericWrapperClasses {
    public static void main(String[] args) {
        int num1 = 7;

        // Creating a wrapper class of integer:
        Integer num1b = Integer.valueOf(num1);
        // this converts a primitive integer into a wrapper class

        storeData(num1);
        // In this case, Java is automatically converting to a wrapper class
        //  of the integer.
        // This is called 'boxing' or 'auto-boxing'.

        // Other examples:
        Double myDouble = Double.valueOf(1243.98);
        Float myFloat = Float.valueOf(1243.98f);
        Byte myByte = Byte.valueOf("23"); // without parens, will be double

        Float isItInfinite = Float.valueOf(.03828435f/5.321f);
        System.out.println(isItInfinite.isInfinite()); // false

    }

    public static void storeData(Object obj) {
        // do something with obj
    }

}
