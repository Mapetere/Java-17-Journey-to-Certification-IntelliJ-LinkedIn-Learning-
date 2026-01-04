# Chapter 5: Repetition Structures (Loops)

## Topics Covered
- ✅ While loop
- ✅ Do-while loop
- ✅ For loop
- ✅ Nested loops
- ✅ Break statement

---

## 📝 Key Concepts

### While Loop
Executes while condition is true. Checks BEFORE each iteration.
```java
while (condition) {
    // code
}
```

### Do-While Loop
Executes at least once! Checks AFTER each iteration.
```java
do {
    // code (runs at least once!)
} while (condition);
```

### For Loop
Best when you know how many iterations.
```java
for (initialization; condition; update) {
    // code
}
```

### Loop Comparison
| Loop | When to Use | Minimum Runs |
|------|-------------|--------------|
| `while` | Unknown iterations, may run 0 times | 0 |
| `do-while` | Unknown iterations, runs at least once | 1 |
| `for` | Known number of iterations | 0 |

### Break vs Continue
- `break` - Exits the loop completely
- `continue` - Skips to next iteration

---

## 🧪 Quiz Questions

### Q1: What's the minimum number of times a do-while loop executes?
**A)** 0  
**B)** 1 ✅  
**C)** 2  
**D)** Depends on condition

### Q2: What does `break` do inside a loop?
**A)** Skips current iteration  
**B)** Exits the loop completely ✅  
**C)** Pauses the loop  
**D)** Restarts the loop

### Q3: What does `continue` do inside a loop?
**A)** Exits the loop  
**B)** Skips to the next iteration ✅  
**C)** Continues to next line  
**D)** Breaks the program

### Q4: How many times will this loop run? `for(int i=0; i<5; i++)`
**A)** 4  
**B)** 5 ✅ (0,1,2,3,4)  
**C)** 6  
**D)** Infinite

### Q5: What's wrong with `while(true) { }` without a break?
**A)** Syntax error  
**B)** Infinite loop ✅  
**C)** Runs once  
**D)** Won't compile

---

## 💻 Code Examples

See the Java files in this folder for working examples.
