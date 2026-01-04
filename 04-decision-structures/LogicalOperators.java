package decisions;

/**
 * Chapter 4: Decision Structures - Logical Operators & Short-Circuit
 */
public class LogicalOperators {
    
    public static void main(String[] args) {
        
        boolean a = true;
        boolean b = false;
        
        // ============ LOGICAL OPERATORS ============
        System.out.println("=== Logical Operators ===");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println();
        
        // AND (&&) - Both must be true
        System.out.println("a && a = " + (a && a));  // true
        System.out.println("a && b = " + (a && b));  // false
        System.out.println("b && b = " + (b && b));  // false
        System.out.println();
        
        // OR (||) - At least one must be true
        System.out.println("a || a = " + (a || a));  // true
        System.out.println("a || b = " + (a || b));  // true
        System.out.println("b || b = " + (b || b));  // false
        System.out.println();
        
        // NOT (!) - Inverts the value
        System.out.println("!a = " + !a);  // false
        System.out.println("!b = " + !b);  // true
        
        
        // ============ SHORT-CIRCUIT EVALUATION ============
        System.out.println("\n=== Short-Circuit Evaluation ===");
        
        int x = 5;
        
        // With &&: If first is FALSE, second is NEVER evaluated
        System.out.println("Testing short-circuit &&:");
        if (false && (++x > 0)) {  // ++x never runs!
            System.out.println("Inside if");
        }
        System.out.println("x after (false && ++x): " + x);  // Still 5!
        
        // With ||: If first is TRUE, second is NEVER evaluated
        System.out.println("\nTesting short-circuit ||:");
        if (true || (++x > 0)) {  // ++x never runs!
            System.out.println("Inside if");
        }
        System.out.println("x after (true || ++x): " + x);  // Still 5!
        
        
        // ============ PRACTICAL SHORT-CIRCUIT EXAMPLE ============
        System.out.println("\n=== Practical Use: Null Check ===");
        
        String name = null;
        
        // This is SAFE because of short-circuit:
        if (name != null && name.length() > 0) {
            System.out.println("Name: " + name);
        } else {
            System.out.println("Name is null or empty");
        }
        // If name was null, name.length() would throw NullPointerException
        // BUT short-circuit prevents it from being evaluated!
        
        
        // ============ OPERATOR PRECEDENCE ============
        System.out.println("\n=== Operator Precedence ===");
        // ! comes first, then &&, then ||
        
        boolean result1 = true || false && false;
        // Evaluated as: true || (false && false) = true || false = true
        System.out.println("true || false && false = " + result1);
        
        boolean result2 = (true || false) && false;
        // Evaluated as: (true || false) && false = true && false = false
        System.out.println("(true || false) && false = " + result2);
    }
}

/*
 * QUIZ NOTES:
 * 
 * Q: What is short-circuit evaluation?
 * A: When Java skips evaluating the second operand because
 *    the result is already known from the first operand.
 *    - false && anything = false (no need to check anything)
 *    - true || anything = true (no need to check anything)
 * 
 * Q: Why is short-circuit useful?
 * A: 1) Performance: avoids unnecessary calculations
 *    2) Safety: prevents errors (like null checks)
 * 
 * Q: What's the precedence order?
 * A: ! (NOT) > && (AND) > || (OR)
 *    Use parentheses when in doubt!
 */
