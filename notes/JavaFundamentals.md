# Java Fundamentals

## Variables

#### What are Variables?
 - Variables are nothing but imaginery boxes used to store data in memory during program execution. In Java, you need to declare a variable before using it.

#### Variables and Data Types
 - Java supports various data types, including primitive types (int, double, boolean) and reference types or non-primitive date types (String, arrays, objects, class, interface).
 - Primitive data types in Java are categorized into four groups: integer types, floating-point types, character type, and boolean type.

![Data Types in Java](images/Data-types-in-Java.jpg)

Examples of variable initializations and declarations
```
int number; // variable declaration
number = 56; // variable initialization
String name = "Nayan" // variable declaration and initialization
```

![Data Types Sizes in Java](images/java-data-types.png)

#### Rules to declare variables in Java
 - A variable name can consist of Capital letters A-Z, lowercase letters a-z digits 0-9, and two special characters such as _ underscore and $ dollar sign.
 - The first character must not be a digit.
 - Blank spaces cannot be used in variable names.
 - Java keywords cannot be used as variable names.
 - Variable names are case-sensitive.
 - There is no limit on the length of a variable name but by convention, it should be between 4 to 15 chars.
 - Variable names always should exist on the left-hand side of assignment operators.

## Operators and Expressions
 - Operators are used to perform operations on variables and values. Java
supports a wide range of operators, including arithmetic, assignment, comparison, logical, and more.
 - Arithmetic operators: +, -, *, /, % (modulus).
 - Assignment operators: =, +=, -=, *=, /=.
 - Comparison operators: ==, !=, >, <, >=, <=.
 - Logical operators: && (AND), || (OR), ! (NOT).

## Type Conversion in Java

  When you assign a value of one data type to another, the two types might not be compatible with each other. If the data types are compatible, then Java will perform the conversion automatically known as Automatic Type Conversion, and if not then they need to be cast or converted explicitly.
  Let's look at both the conversions.

  1. Widening or Automatic Type Conversion
    Widening conversion takes place when two data types are automatically converted. This happens when:  
     - The two data types are compatible.
     - When we assign a value of a smaller data type to a bigger data type.

    Byte -> Short -> Int -> Long -> Float -> Double

<br>
  1. Narrowing or Explicit Conversion
   If we want to assign a value of a larger data type to a smaller data type we perform explicit type casting or narrowing.  

- This is useful for incompatible data types where automatic conversion cannot be done.
- Here, the target type specifies the desired type to convert the specified value to.

```
Double -> Float -> Long -> Int -> Short -> Byte
```    

#### How does Java handle Unicode characters? Why is it important?
Java uses Unicode to handle character encoding, allowing it to support characters from various writing systems. Unicode is important as it ensures proper representation of characters from different languages and helps in creating internationalized applications that can work across different locales.
