package decisions;

/**
 * Chapter 4: Decision Structures - Switch Statements & Expressions
 */
public class SwitchDemo {
    
    public static void main(String[] args) {
        
        int dayNumber = 3;
        String month = "March";
        
        // ============ TRADITIONAL SWITCH STATEMENT ============
        System.out.println("=== Traditional Switch Statement ===");
        String dayName;
        
        switch (dayNumber) {
            case 1:
                dayName = "Monday";
                break;  // IMPORTANT: Don't forget break!
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
            case 7:  // Multiple cases can share same code
                dayName = "Weekend";
                break;
            default:
                dayName = "Invalid day";
        }
        System.out.println("Day " + dayNumber + " = " + dayName);
        
        
        // ============ SWITCH EXPRESSION (Java 14+) ============
        System.out.println("\n=== Switch Expression (Modern Way) ===");
        
        // Arrow syntax - no break needed, returns a value!
        String result = switch (dayNumber) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6, 7 -> "Weekend";  // Comma for multiple cases
            default -> "Invalid day";
        };  // Note: semicolon after the closing brace!
        System.out.println("Day " + dayNumber + " = " + result);
        
        
        // ============ SWITCH EXPRESSION WITH YIELD ============
        System.out.println("\n=== Switch Expression with yield ===");
        
        int daysInMonth = switch (month) {
            case "January", "March", "May", "July", 
                 "August", "October", "December" -> 31;
            case "April", "June", "September", "November" -> 30;
            case "February" -> {
                // Use 'yield' for multi-line case logic
                System.out.println("February is special!");
                yield 28;  // 'yield' returns the value
            }
            default -> {
                System.out.println("Unknown month!");
                yield 0;
            }
        };
        System.out.println(month + " has " + daysInMonth + " days");
        
        
        // ============ FALL-THROUGH (when you forget break) ============
        System.out.println("\n=== Danger: Fall-Through ===");
        int num = 1;
        switch (num) {
            case 1:
                System.out.println("One");
                // No break! Falls through to next case
            case 2:
                System.out.println("Two");
                // No break! Falls through again
            case 3:
                System.out.println("Three");
                break;
        }
        // This prints: One, Two, Three (not just One!)
    }
}

/*
 * QUIZ NOTES:
 * 
 * Q: What happens if you forget 'break' in a switch statement?
 * A: Fall-through! Execution continues to the next case.
 * 
 * Q: What's the difference between -> and : in switch?
 * A: Arrow (->) is for switch expressions, no break needed.
 *    Colon (:) is traditional switch statement, needs break.
 * 
 * Q: What does 'yield' do?
 * A: Returns a value from a switch expression when you have
 *    multiple statements in a case block.
 * 
 * Q: Can switch work with Strings?
 * A: Yes! Since Java 7, switch works with String, int, char, enum.
 */
