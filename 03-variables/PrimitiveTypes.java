package variables;

/**
 * Chapter 3: Variables - Primitive Data Types
 * 
 * Java has 8 primitive data types.
 * They are NOT objects - they hold actual values directly.
 */
public class PrimitiveTypes {
    
    public static void main(String[] args) {
        
        // ============ WHOLE NUMBERS ============
        
        // byte: 1 byte, range: -128 to 127
        byte myByte = 100;
        
        // short: 2 bytes, range: -32,768 to 32,767
        short myShort = 30000;
        
        // int: 4 bytes, range: about -2 billion to 2 billion
        int myInt = 100000;
        
        // long: 8 bytes - use 'L' suffix!
        long myLong = 10000000000L;  // Note the 'L' at the end!
        
        
        // ============ DECIMAL NUMBERS ============
        
        // float: 4 bytes, less precise - use 'f' suffix!
        float myFloat = 3.14f;  // Note the 'f' at the end!
        
        // double: 8 bytes, more precise (default for decimals)
        double myDouble = 3.14159265359;
        
        
        // ============ OTHER TYPES ============
        
        // char: 2 bytes, single character in single quotes
        char myChar = 'A';
        char unicodeChar = '\u0041';  // Also 'A' using Unicode
        
        // boolean: true or false only
        boolean isJavaFun = true;
        boolean isJavaHard = false;
        
        
        // ============ PRINT ALL VALUES ============
        System.out.println("=== Primitive Data Types ===");
        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println("char: " + myChar);
        System.out.println("boolean: " + isJavaFun);
    }
}

/*
 * QUIZ NOTES:
 * 
 * Q: Why use 'L' with long and 'f' with float?
 * A: Without suffix, numbers default to int (whole) or double (decimal).
 *    The suffix tells compiler the intended type.
 * 
 * Q: What's the difference between float and double?
 * A: Double has more precision (more decimal places).
 *    Double uses 8 bytes, float uses 4 bytes.
 *    Use double for most calculations.
 * 
 * Q: How many primitive types are there?
 * A: Exactly 8: byte, short, int, long, float, double, char, boolean
 */
