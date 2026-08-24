
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

# Java Basics — Day 1

## 1. Data Types

### Primitive Data Types

- `byte`
- `short`
- `int`
- `long`
- `float`
- `double`
- `char`
- `boolean`

### Non-Primitive / Reference Types

- `String`
- `Array`
- `Class`
- `Object`
- `Interface`

---

## 2. Operator Priority

Arithmetic operations are evaluated in this order:

**Higher Priority**
```text
*   /   %

Lower Priority

+   -
Example
int result = 10 + 5 * 2;

// 10 + 10 = 20
Using Parentheses

Parentheses have higher priority and can change the order of execution.

int result = (10 + 5) * 2;

// 30
3. Taking User Input

Java uses the Scanner class to take input from the user.

Step 1: Import Scanner
import java.util.Scanner;
Step 2: Create Scanner Object
Scanner sc = new Scanner(System.in);
Step 3: Take Input
int a = sc.nextInt();
4. Common Scanner Methods
Method	Used For
nextInt()	Integer
nextDouble()	Double
nextBoolean()	Boolean
next()	Single word
nextLine()	Full line
5. Basic User Input Program
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value for a:");
        int a = sc.nextInt();

        System.out.println("Value = " + a);
    }
}
Quick Revision
Data Types
Primitive
byte
short
int
long
float
double
char
boolean
Non-Primitive
String
Array
Class
Object
Interface
Operator Priority
* / %  →  + -
User Input
Import Scanner
      ↓
Create Scanner object
      ↓
Use input method
      ↓
Store input in variable
Basic Pattern
import java.util.Scanner;

Scanner sc = new Scanner(System.in);

int a = sc.nextInt();