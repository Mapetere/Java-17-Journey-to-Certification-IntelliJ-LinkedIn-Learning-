package decisions;

/**
 * Chapter 4: Decision Structures - If/Else Statements
 */
public class IfElseStatements {
    
    public static void main(String[] args) {
        
        int age = 18;
        double temperature = 35.5;
        boolean hasLicense = true;
        
        // ============ SIMPLE IF ============
        System.out.println("=== Simple If ===");
        if (age >= 18) {
            System.out.println("You are an adult!");
        }
        
        
        // ============ IF-ELSE ============
        System.out.println("\n=== If-Else ===");
        if (temperature > 30) {
            System.out.println("It's hot outside! (" + temperature + "°C)");
        } else {
            System.out.println("It's not too hot.");
        }
        
        
        // ============ IF-ELSE-IF CHAIN ============
        System.out.println("\n=== If-Else-If Chain ===");
        int score = 85;
        char grade;
        
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Score: " + score + " = Grade: " + grade);
        
        
        // ============ NESTED IF ============
        System.out.println("\n=== Nested If ===");
        if (age >= 18) {
            if (hasLicense) {
                System.out.println("You can drive!");
            } else {
                System.out.println("You're old enough but need a license.");
            }
        } else {
            System.out.println("You're too young to drive.");
        }
        
        
        // ============ TERNARY OPERATOR ============
        System.out.println("\n=== Ternary Operator (shorthand if-else) ===");
        // condition ? valueIfTrue : valueIfFalse
        String status = age >= 18 ? "Adult" : "Minor";
        System.out.println("Status: " + status);
        
        int num = 15;
        String evenOdd = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is " + evenOdd);
    }
}

/*
 * QUIZ NOTES:
 * 
 * Q: What's the ternary operator?
 * A: condition ? valueIfTrue : valueIfFalse
 *    It's a shorthand if-else that returns a value.
 * 
 * Q: Can you have multiple else-if clauses?
 * A: Yes! As many as you need.
 * 
 * Q: If no condition is true and no else, what happens?
 * A: Nothing! The code just continues past the if statement.
 */
