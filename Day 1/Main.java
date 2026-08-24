
// Data types = 

// Primitive         Non primitive 
// byte                String
// short               Array
// char                class
// boolean             Object
// int                 interface 
// long
// float
// double

// Priority for operations - 
// */% > +-

import java.util.Scanner;


//To take input from user
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for a : ");
        int a = sc.nextInt();
        System.out.print("Value you entered is - " + a);
    }
}

# Java Basics - Day 1

## 1. Data Types

Data types define the type of value a variable can store.

### Primitive Data Types

- `byte`
- `short`
- `int`
- `long`
- `float`
- `double`
- `char`
- `boolean`

### Non-Primitive Data Types

- `String`
- `Array`
- `Class`
- `Object`
- `Interface`

---

## 2. Operator Priority

For basic arithmetic operations:

```text
*  /  %    → Higher Priority
+  -       → Lower Priority
```

Example:

```java
int result = 10 + 5 * 2;
```

Output:

```text
20
```

Because multiplication happens first:

```text
5 * 2 = 10
10 + 10 = 20
```

### Parentheses

Parentheses `()` have higher priority and can change the order.

```java
int result = (10 + 5) * 2;
```

Output:

```text
30
```

---

## 3. Taking User Input

Java uses the `Scanner` class to take input from the user.

### Import Scanner

```java
import java.util.Scanner;
```

### Create Scanner Object

```java
Scanner sc = new Scanner(System.in);
```

### Take Integer Input

```java
int a = sc.nextInt();
```

---

## 4. Common Scanner Methods

```text
nextInt()       → int
nextDouble()    → double
nextFloat()     → float
nextLong()      → long
nextBoolean()   → boolean
next()          → single word
nextLine()      → complete line
```

---

## 5. Basic User Input Program

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value for a:");
        int a = sc.nextInt();

        System.out.println("Value you entered is: " + a);
    }
}
```

---

## Quick Revision

### Data Types

**Primitive:**

`byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`

**Non-Primitive:**

`String`, `Array`, `Class`, `Object`, `Interface`

### Operator Priority

`* / %` → `+ -`

### User Input

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);

int a = sc.nextInt();
```

### Remember

- `Scanner` → used for taking input
- `nextInt()` → reads an integer
- `next()` → reads one word
- `nextLine()` → reads a complete line
- `* / %` → higher priority
- `+ -` → lower priority
- `()` → changes the order of operations