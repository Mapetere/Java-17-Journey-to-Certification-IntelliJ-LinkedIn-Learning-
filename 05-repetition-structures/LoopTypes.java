package loops;

/**
 * Chapter 5: Repetition Structures - Loop Types
 */
public class LoopTypes {
    
    public static void main(String[] args) {
        
        // ============ WHILE LOOP ============
        System.out.println("=== While Loop ===");
        // Checks condition BEFORE each iteration
        // May never execute if condition is false initially
        
        int count = 1;
        while (count <= 5) {
            System.out.println("While: " + count);
            count++;
        }
        
        
        // ============ DO-WHILE LOOP ============
        System.out.println("\n=== Do-While Loop ===");
        // Checks condition AFTER each iteration
        // Always executes at least ONCE!
        
        count = 1;
        do {
            System.out.println("Do-While: " + count);
            count++;
        } while (count <= 5);
        
        // Proof that do-while runs at least once:
        System.out.println("\nProof do-while runs at least once:");
        int x = 100;
        do {
            System.out.println("This WILL print even though x > 5");
        } while (x <= 5);  // Condition false, but already ran once!
        
        
        // ============ FOR LOOP ============
        System.out.println("\n=== For Loop ===");
        // initialization; condition; update
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("For: " + i);
        }
        
        // Counting down
        System.out.println("\nCounting down:");
        for (int i = 5; i >= 1; i--) {
            System.out.println("Countdown: " + i);
        }
        
        // Step by 2
        System.out.println("\nStep by 2:");
        for (int i = 0; i <= 10; i += 2) {
            System.out.println("Even: " + i);
        }
        
        
        // ============ ENHANCED FOR (FOR-EACH) ============
        System.out.println("\n=== Enhanced For (For-Each) ===");
        int[] numbers = {10, 20, 30, 40, 50};
        
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}

/*
 * QUIZ NOTES:
 * 
 * Q: When should you use while vs for?
 * A: Use 'for' when you know iterations (e.g., loop 10 times)
 *    Use 'while' when condition-based (e.g., until user says stop)
 * 
 * Q: What's the key difference of do-while?
 * A: It always runs at least once, even if condition is false!
 * 
 * Q: What is the for-each loop?
 * A: Simplified loop for iterating through arrays/collections.
 *    Syntax: for (Type item : collection) { }
 */
