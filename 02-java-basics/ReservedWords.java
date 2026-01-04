package basics;

/**
 * Chapter 2: Java Basics - Reserved Words
 * 
 * Reserved words (keywords) cannot be used as:
 * - Variable names
 * - Method names
 * - Class names
 * - Package names
 */
public class ReservedWords {
    
    public static void main(String[] args) {
        // IMPORTANT: These would cause compile errors:
        // int class = 5;      // ERROR: 'class' is reserved
        // int static = 10;    // ERROR: 'static' is reserved
        // int void = 15;      // ERROR: 'void' is reserved
        
        // These are VALID because they're not reserved words:
        int main = 100;        // 'main' is NOT a reserved word!
        int args2 = 200;       // variations are fine
        int myClass = 300;     // 'myClass' is fine (contains 'class' but isn't 'class')
        
        System.out.println("main variable = " + main);
        System.out.println("This proves 'main' is NOT a reserved word!");
    }
}

/*
 * COMMON RESERVED WORDS TO REMEMBER:
 * 
 * Data Types:     int, double, boolean, char, byte, short, long, float
 * Access:         public, private, protected
 * Class-related:  class, interface, extends, implements, abstract
 * Control Flow:   if, else, switch, case, for, while, do, break, continue, return
 * OOP:            new, this, super, static, final
 * Error Handling: try, catch, finally, throw, throws
 * Other:          void, null, true, false, package, import
 * 
 * NOT RESERVED (but special):
 * - main (entry point method name)
 * - String (it's a class, not a keyword)
 * - System (it's a class)
 */
