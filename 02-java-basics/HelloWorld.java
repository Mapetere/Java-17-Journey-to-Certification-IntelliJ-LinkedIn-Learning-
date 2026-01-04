package basics;

/**
 * Chapter 2: Java Basics - HelloWorld Example
 * 
 * Key Concepts:
 * - Package declaration must be first statement
 * - Class name must match filename
 * - main() method is the entry point
 */
public class HelloWorld {
    
    // The main method - program execution starts here
    // Must be: public static void main(String[] args)
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Welcome to Java 17!");
    }
}

/*
 * QUIZ NOTES:
 * 
 * Q: Why is main() method static?
 * A: Because JVM needs to call it WITHOUT creating an object first.
 *    Static methods belong to the class, not instances.
 * 
 * Q: What does 'void' mean in the main method signature?
 * A: The method doesn't return any value.
 * 
 * Q: What is String[] args?
 * A: Command line arguments passed to the program as an array of Strings.
 */
