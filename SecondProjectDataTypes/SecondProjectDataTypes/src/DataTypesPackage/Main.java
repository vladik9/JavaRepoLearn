package DataTypesPackage;

public class Main {
    public static void main(String[] args) {
        System.out.println("Primitive data types!!!");
        System.out.println("Int data types: 1");
//        int intValue = 1_000; // 4 bytes stores whole numbers from -2,147,483,648 to 2,147,483,647
        int intMinValue = Integer.MIN_VALUE;
        int intMaxValue = Integer.MAX_VALUE;
        System.out.println("The intMinValue value is " + intMinValue);
        System.out.println("The intMaxValue value is " + intMaxValue);

        System.out.println("\nByte data types: 2");
//        byte byteValue = 112; // 1 byte	stores whole numbers from -128 to 127
        byte byteMinValue = Byte.MIN_VALUE;
        byte byteMaxValue = Byte.MAX_VALUE;
        System.out.println("The byteMinValue value is " + byteMinValue);
        System.out.println("The byteMaxValue value is " + byteMaxValue);

        System.out.println("\nShort data types: 3");
//        short shortValue = (short) 11235456; // 2 bytes stores whole numbers from -32,768 to 32,767
        short shortMinValue = Short.MIN_VALUE; // cast is like in C++
        short shortMaxValue = Short.MAX_VALUE; //is converting what we have in the right to data type in left
        System.out.println("The shortMinValue value is " + shortMinValue);
        System.out.println("The shortMaxValue value is " + shortMaxValue);

        System.out.println("\nLong data types: 4");
//        long longValue = 11235456L; // 8 bytes stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long longMinValue = Long.MIN_VALUE;
        long longMaxValue = Long.MAX_VALUE;
        System.out.println("The longMinValue value is " + longMinValue);
        System.out.println("The longMaxValue value is " + longMaxValue);

        System.out.println("\nFloat data types: 5");
//        float floatValue = 123.43f; // 4 bytes	stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        float floatMinValue = Float.MIN_VALUE;
        float floatMaxValue = Float.MAX_VALUE;
        System.out.println("The floatMinValue value is " + floatMinValue);
        System.out.println("The floatMaxValue value is " + floatMaxValue);

        System.out.println("\nDouble data types: 6");
//        double doubleValue = 123.43d; // 8 bytes stores fractional numbers. Sufficient for storing 15 decimal digits
        double doubleMinValue = Double.MIN_VALUE;
        double doubleMaxValue = Double.MAX_VALUE;
        System.out.println("The doubleMinValue value is " + doubleMinValue);
        System.out.println("The doubleMaxValue value is " + doubleMaxValue);

        System.out.println("\nBool data types: 7");
//        boolean boolValue = true; // 1 bit stores true or false values
        boolean boolTrueValue = true;
        boolean boolFalseValue = false;
        System.out.println("The boolTrueValue value is " + boolTrueValue);
        System.out.println("The boolFalseValue value is " + boolFalseValue);

        System.out.println("\nChar data types: 8");
        char charValue = 'V'; // 2 bytes stores a single character/letter or ASCII values
        System.out.println("The charValue value is " + charValue);


    }
}
