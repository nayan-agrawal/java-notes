# Control Flow Statements in Java
A programming language uses control statements to control the flow of execution of a program based on certain conditions. These are used to cause the flow of execution to advance and branch based on changes to the state of a program. 

Java provides following decision making statements
 - if
 - if-else
 - nested-if
 - if-else-if
 - switch-case
 - jump - break, continue, return

#### If 
It is used to decide whether a certain statement or block of statements will be executed or not i.e if a certain condition is true then a block of statements is executed otherwise not. 

```
if(condition) 
{
   // Statements to execute if
   // condition is true
}
```
Time Complexity: O(1) 
Auxillary Space: O(1)

#### If-Else

The 'if' statement checks if something is true and does a specific action if it is. But what if it's not true? That's where the 'else' statement comes in. It helps us do something different if the 'if' condition is false. So, it's like a backup plan if the first condition isn't met.

```
if (condition)
{
    // Executes this block if
    // condition is true
}
else
{
    // Executes this block if
    // condition is false
}
```
Time Complexity: O(1) 
Auxillary Space: O(1)

#### Nested If
A nested 'if' statement is when one 'if' statement is placed inside another 'if' or 'else' statement. In simpler terms, it means having an 'if' statement inside another 'if' statement.
```
if (condition1) 
{
   // Executes when condition1 is true
   if (condition2) 
   {
      // Executes when condition2 is true
   }
}
```
Time Complexity: O(1)
Auxiliary Space: O(1)

#### if-else-if ladder
In this situation, a user has several choices to pick from. When using if statements, they are checked in order from top to bottom. Once a condition that controls an 'if' statement is true, the code linked with that 'if' is run, and the remaining conditions are skipped. If none of the conditions are true, the final 'else' statement is executed. While multiple 'else if' blocks can be linked with one 'if' block, only a single 'else' block is permitted for one 'if' block.

```
if (condition)
    statement;
else if (condition)
    statement;
.
.
else
    statement;
```

Time Complexity: O(1)
Auxiliary Space: O(1)

#### Switch Case
The switch statement is a multiway branch statement. It provides an easy way to dispatch execution to different parts of code based on the value of the expression. 

```
switch (expression)
{
  case value1:
    statement1;
    break;
  case value2:
    statement2;
    break;
  .
  .
  case valueN:
    statementN;
    break;
  default:
    statementDefault;
}
```

Time Complexity: O(1)
Space Complexity: O(1)

Important Points
 - The expression can be of type byte, short, int char, or an enumeration. Beginning with JDK7, the expression can also be of type String.
 - Duplicate case values are not allowed.
 - The default statement is optional.
 - The break statement is used inside the switch to terminate a statement sequence.
 - The break statements are necessary without the break keyword, statements in switch blocks fall through.  
 - If the break keyword is omitted, execution will continue to the next case.

#### Jump
Java supports three jump statements: break, continue and return. 

1. **Break**: In Java, a break is majorly used for: 
    - Terminate a sequence in a switch statement (discussed above).
    - To exit a loop.
    - Used as a “civilized” form of goto.

2. **Continue**: Sometimes it is useful to force an early iteration of a loop. That is, you might want to continue running the loop but stop processing the remainder of the code in its body for this particular iteration. This is, in effect, a goto just past the body of the loop, to the loop’s end. The continue statement performs such an action. 
3. **Return**: The return statement is used to explicitly return from a method. That is, it causes program control to transfer back to the caller of the method.

Time Complexity: O(1)
Auxiliary Space: O(1)