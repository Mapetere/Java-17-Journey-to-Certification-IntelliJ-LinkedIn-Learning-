# Chapter 3: Variables

## Topics Covered
- ✅ Creating variables
- ✅ Primitive data types
- ✅ Local variable type inference (`var`)
- ✅ Naming variables
- ✅ Modifying variables
- ✅ Arithmetic operators

---

## 📝 Key Concepts

### Creating Variables
Variables are containers that store data values.

```java
// Declaration and initialization
int age = 25;
String name = "John";
double price = 19.99;
```

### Primitive Data Types (8 types)

| Type | Size | Range | Example |
|------|------|-------|---------|
| `byte` | 1 byte | -128 to 127 | `byte b = 100;` |
| `short` | 2 bytes | -32,768 to 32,767 | `short s = 30000;` |
| `int` | 4 bytes | -2B to 2B | `int i = 100000;` |
| `long` | 8 bytes | Very large | `long l = 100000L;` |
| `float` | 4 bytes | Decimal | `float f = 3.14f;` |
| `double` | 8 bytes | Decimal (precise) | `double d = 3.14159;` |
| `char` | 2 bytes | Single character | `char c = 'A';` |
| `boolean` | 1 bit | true/false | `boolean b = true;` |

### Local Variable Type Inference (Java 10+)
```java
var number = 10;        // Compiler infers 'int'
var message = "Hello";  // Compiler infers 'String'
var price = 19.99;      // Compiler infers 'double'
```

### Variable Naming Rules
1. ✅ Must start with letter, `$`, or `_`
2. ✅ Can contain letters, digits, `$`, `_`
3. ❌ Cannot start with a digit
4. ❌ Cannot be a reserved word
5. ✅ Use camelCase convention

### Arithmetic Operators
| Operator | Description | Example |
|----------|-------------|---------|
| `+` | Addition | `5 + 3 = 8` |
| `-` | Subtraction | `5 - 3 = 2` |
| `*` | Multiplication | `5 * 3 = 15` |
| `/` | Division | `5 / 3 = 1` (int) |
| `%` | Modulus (remainder) | `5 % 3 = 2` |

---

## 🧪 Quiz Questions

### Q1: Which is NOT a primitive data type in Java?
**A)** `int`  
**B)** `String` ✅  
**C)** `boolean`  
**D)** `char`

> **Note**: `String` is a class, not a primitive type!

### Q2: What will be the result of `10 / 3` in Java?
**A)** 3.33  
**B)** 3 ✅  
**C)** 4  
**D)** Error

> **Note**: Integer division truncates the decimal part!

### Q3: Which variable name is INVALID?
**A)** `_myVar`  
**B)** `$price`  
**C)** `2ndPlace` ✅  
**D)** `myVar2`

### Q4: What does `var` keyword do in Java?
**A)** Creates a variable with no type  
**B)** Lets the compiler infer the type ✅  
**C)** Creates a dynamic variable  
**D)** Only works with Strings

### Q5: What is the default value of a local int variable?
**A)** 0  
**B)** null  
**C)** No default - must be initialized ✅  
**D)** -1

---

## 💻 Code Examples

See the Java files in this folder for working examples.
