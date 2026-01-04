package variables;

/**
 * Chapter 3: Variables - Arithmetic Operators & Variable Modification
 */
public class ArithmeticOperators {
    
    public static void main(String[] args) {
        
        // ============ BASIC ARITHMETIC ============
        int a = 10;
        int b = 3;
        
        System.out.println("=== Basic Arithmetic ===");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + (a + b));  // 13
        System.out.println("a - b = " + (a - b));  // 7
        System.out.println("a * b = " + (a * b));  // 30
        System.out.println("a / b = " + (a / b));  // 3 (integer division!)
        System.out.println("a % b = " + (a % b));  // 1 (remainder/modulus)
        
        
        // ============ INTEGER DIVISION TRAP ============
        System.out.println("\n=== Integer Division Trap ===");
        int result1 = 10 / 3;           // Result: 3 (truncated!)
        double result2 = 10 / 3;        // Result: 3.0 (still truncated!)
        double result3 = 10.0 / 3;      // Result: 3.333... (correct!)
        double result4 = (double) 10 / 3;  // Result: 3.333... (cast works!)
        
        System.out.println("10 / 3 (int) = " + result1);
        System.out.println("10 / 3 (stored in double) = " + result2);
        System.out.println("10.0 / 3 = " + result3);
        System.out.println("(double)10 / 3 = " + result4);
        
        
        // ============ MODIFYING VARIABLES ============
        System.out.println("\n=== Modifying Variables ===");
        int count = 10;
        
        count = count + 5;    // Long way
        System.out.println("count + 5 = " + count);  // 15
        
        count += 5;           // Shorthand (compound assignment)
        System.out.println("count += 5 = " + count); // 20
        
        count -= 3;           // Subtract and assign
        System.out.println("count -= 3 = " + count); // 17
        
        count *= 2;           // Multiply and assign
        System.out.println("count *= 2 = " + count); // 34
        
        count /= 2;           // Divide and assign
        System.out.println("count /= 2 = " + count); // 17
        
        
        // ============ INCREMENT & DECREMENT ============
        System.out.println("\n=== Increment & Decrement ===");
        int num = 5;
        
        System.out.println("Original: " + num);     // 5
        System.out.println("num++ = " + num++);     // 5 (post-increment: use then add)
        System.out.println("After num++: " + num);  // 6
        System.out.println("++num = " + ++num);     // 7 (pre-increment: add then use)
        System.out.println("num-- = " + num--);     // 7 (post-decrement: use then subtract)
        System.out.println("After num--: " + num);  // 6
    }
}

/*
 * QUIZ NOTES:
 * 
 * Q: What is 17 % 5?
 * A: 2 (17 divided by 5 = 3 remainder 2)
 * 
 * Q: What's the difference between ++num and num++?
 * A: ++num (prefix): increments FIRST, then uses the value
 *    num++ (postfix): uses the value FIRST, then increments
 * 
 * Q: Why does 10/3 give 3 instead of 3.33?
 * A: Integer division! Both operands are int, so result is int.
 *    Make at least one operand a double to get decimal result.
 */
