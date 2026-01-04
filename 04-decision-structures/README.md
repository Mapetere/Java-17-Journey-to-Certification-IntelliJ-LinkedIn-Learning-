# Chapter 4: Decision Structures

## Topics Covered
- ✅ If statements
- ✅ If-else statements
- ✅ If-else-if statements
- ✅ Switch statements
- ✅ Switch expressions (Java 14+)
- ✅ Relational operators
- ✅ Logical operators
- ✅ Short circuit logic

---

## 📝 Key Concepts

### Relational Operators
| Operator | Meaning | Example |
|----------|---------|---------|
| `==` | Equal to | `a == b` |
| `!=` | Not equal to | `a != b` |
| `>` | Greater than | `a > b` |
| `<` | Less than | `a < b` |
| `>=` | Greater or equal | `a >= b` |
| `<=` | Less or equal | `a <= b` |

### Logical Operators
| Operator | Meaning | Example |
|----------|---------|---------|
| `&&` | AND | `a && b` |
| `\|\|` | OR | `a \|\| b` |
| `!` | NOT | `!a` |

### Short-Circuit Evaluation
- `&&`: If first condition is **false**, second is NOT evaluated
- `||`: If first condition is **true**, second is NOT evaluated

### Switch Expression vs Statement
```java
// Switch Statement (traditional)
switch(day) {
    case 1: result = "Monday"; break;
    case 2: result = "Tuesday"; break;
    default: result = "Unknown";
}

// Switch Expression (Java 14+) - cleaner!
String result = switch(day) {
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    default -> "Unknown";
};
```

---

## 🧪 Quiz Questions

### Q1: What is the result of: `true && false`?
**A)** true  
**B)** false ✅  
**C)** null  
**D)** Error

### Q2: What is short-circuit evaluation?
**A)** When the circuit is too short  
**B)** Skipping the second condition if result is already determined ✅  
**C)** A type of loop  
**D)** A compile error

### Q3: In `if (x > 5 && y < 10)`, if `x = 3`, will `y < 10` be evaluated?
**A)** Yes  
**B)** No ✅ (short-circuit: first is false, so && fails immediately)

### Q4: What's the difference between switch statement and switch expression?
**A)** Switch expression returns a value; switch statement doesn't ✅  
**B)** They are the same  
**C)** Switch expression is slower  
**D)** Switch statement is newer

### Q5: Which operator has higher precedence?
**A)** `||`  
**B)** `&&` ✅  
**C)** They are the same

---

## 💻 Code Examples

See the Java files in this folder for working examples.
