import java.util.Scanner;

public class Greetings {

    public static void main(String[] args) {
        greetUser();
    }

    public static void greetUser() {
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello, " + name);
        scanner.close();
    }

}

// variable scope
/*
A variable is limited to the block, statement, or expression in which it is used.
Method variables can have same name as variables in other methods.  
for example:

public void method1(){
String myVariable = "123"
}

public void method2(){
String myVariable = "abc"
}

myVariable is a local variable to each methof hence they cant be globally accessed.

to reference a global variable we use the keyword 'this'

public void method1(){
String myVariable = "123"
}

public void method2(){
String myVariable = "abc"
}

this.myVariable

*/
 
