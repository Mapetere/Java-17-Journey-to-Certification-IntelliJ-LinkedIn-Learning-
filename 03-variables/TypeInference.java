package variables;

/**
 * Chapter 3: Variables - Local Variable Type Inference (var keyword)
 * 
 * Introduced in Java 10!
 * The 'var' keyword lets the compiler infer the type.
 */
public class TypeInference {
    
    public static void main(String[] args) {
        
        // ============ BASIC VAR USAGE ============
        var message = "Hello, World!";  // Compiler infers String
        var count = 42;                  // Compiler infers int
        var price = 19.99;               // Compiler infers double
        var isActive = true;             // Compiler infers boolean
        
        System.out.println("=== Type Inference with var ===");
        System.out.println("message (String): " + message);
        System.out.println("count (int): " + count);
        System.out.println("price (double): " + price);
        System.out.println("isActive (boolean): " + isActive);
        
        
        // ============ VAR RULES ============
        
        // Rule 1: Must initialize immediately
        // var something;  // ERROR! Cannot infer type without value
        
        // Rule 2: Cannot be null initially
        // var nothing = null;  // ERROR! Cannot infer type from null
        
        // Rule 3: Type is locked after inference
        var number = 100;
        // number = "text";  // ERROR! Cannot assign String to int
        number = 200;  // This is fine - still an int
        
        // Rule 4: Only for local variables
        // Cannot use 'var' for:
        // - Class fields (instance variables)
        // - Method parameters
        // - Return types
        
        
        // ============ WHEN TO USE VAR ============
        System.out.println("\n=== When var is helpful ===");
        
        // Good: Reduces verbosity when type is obvious
        var userName = "John";                     // Obviously a String
        var numbers = new int[]{1, 2, 3, 4, 5};   // Obviously an int array
        
        // Questionable: When type isn't obvious
        // var result = calculate();  // What type? Not clear!
        
        System.out.println("Use var when the type is obvious from context!");
    }
}

/*
 * QUIZ NOTES:
 * 
 * Q: Can you use 'var' for method parameters?
 * A: NO! 'var' only works for local variables inside methods.
 * 
 * Q: What happens with: var x = null;?
 * A: Compile error! Compiler cannot infer type from null.
 * 
 * Q: Is 'var' making Java dynamically typed?
 * A: NO! Java is still statically typed. The type is determined
 *    at compile time and cannot change. It's just inferred.
 * 
 * Q: Can you reassign a var to a different type?
 * A: NO! Once inferred, the type is fixed.
 */
