package loops;

/**
 * Chapter 5: Repetition Structures - Nested Loops, Break & Continue
 */
public class NestedLoopsAndControl {
    
    public static void main(String[] args) {
        
        // ============ NESTED LOOPS ============
        System.out.println("=== Nested Loops: Multiplication Table ===");
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();  // New line after each row
        }
        
        
        // ============ NESTED LOOPS: PATTERN ============
        System.out.println("\n=== Nested Loops: Star Pattern ===");
        
        for (int row = 1; row <= 5; row++) {
            for (int star = 1; star <= row; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        
        // ============ BREAK STATEMENT ============
        System.out.println("\n=== Break Statement ===");
        
        // Break exits the loop completely
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                System.out.println("Breaking at " + i);
                break;  // Exit loop immediately
            }
            System.out.println("i = " + i);
        }
        System.out.println("Loop finished (or broken out)");
        
        
        // ============ CONTINUE STATEMENT ============
        System.out.println("\n=== Continue Statement ===");
        
        // Continue skips to next iteration
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;  // Skip even numbers
            }
            System.out.println("Odd number: " + i);
        }
        
        
        // ============ BREAK IN NESTED LOOPS ============
        System.out.println("\n=== Break in Nested Loops ===");
        
        // Break only exits the INNERMOST loop
        for (int i = 1; i <= 3; i++) {
            System.out.println("Outer loop: " + i);
            for (int j = 1; j <= 5; j++) {
                if (j == 3) {
                    break;  // Only breaks inner loop!
                }
                System.out.println("  Inner loop: " + j);
            }
        }
        
        
        // ============ LABELED BREAK (advanced) ============
        System.out.println("\n=== Labeled Break (exits outer loop) ===");
        
        outerLoop:  // This is a label
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i=" + i + ", j=" + j);
                if (i == 2 && j == 2) {
                    System.out.println("Breaking outer loop!");
                    break outerLoop;  // Breaks the labeled loop
                }
            }
        }
    }
}

/*
 * QUIZ NOTES:
 * 
 * Q: What does break do in a nested loop?
 * A: Exits only the INNERMOST loop (unless labeled)
 * 
 * Q: What's the difference between break and continue?
 * A: break - exits the loop entirely
 *    continue - skips to the next iteration
 * 
 * Q: What is a labeled break?
 * A: A way to break out of an outer loop from an inner loop.
 *    Syntax: label: loop { break label; }
 */
