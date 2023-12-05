# Looping Statements in Java
Looping in programming languages is a feature which facilitates the execution of a set of instructions/functions repeatedly while some condition evaluates to true. Java provides three ways for executing the loops. While all the ways provide similar basic functionality, they differ in their syntax and condition checking time.

### While Loop
A while loop is a control flow statement that allows code to be executed repeatedly based on a given Boolean condition. The while loop can be thought of as a repeating if statement. 
```
while (boolean condition)
{
   loop statements...
}
```

The while loop starts by checking a Boolean condition, executing its body statements if true or moving to the next statement if false. Its designation as an Entry control loop stems from this behavior. Throughout its lifecycle, while the condition remains true, the loop updates variables within its body for subsequent iterations. Eventually, when the condition turns false, the loop concludes its execution.

### For Loop
The for loop offers a compact method for creating loop structures. Unlike a while loop, a for statement combines initialization, condition, and increment/decrement in a single line, creating a shorter and more straightforward loop structure that's easier to debug.
```
for (initialization condition; testing condition;increment/decrement)
{
    statement(s)
}
```
 - Initialization condition: Here, we initialize the variable in use. It marks the start of a for loop. An already declared variable can be used or a variable can be declared, local to loop only.
 - Testing Condition: It is used for testing the exit condition for a loop. It must return a boolean value. It is also an Entry Control Loop as the condition is checked prior to the execution of the loop statements.
 - Statement execution: Once the condition is evaluated to true, the statements in the loop body are executed.
 - Increment/ Decrement: It is used for updating the variable for next iteration.
 - Loop termination:When the condition becomes false, the loop terminates marking the end of its life cycle.

### Do While Loop
do while loop is similar to while loop with only difference that it checks for condition after executing the statements, and therefore is an example of Exit Control Loop. 

```
do
{
    statements..
}
while (condition);
```

 - do while loop starts with the execution of the statement(s). There is no checking of any condition for the first time.
 - After the execution of the statements, and update of the variable value, the condition is checked for true or false value. If it is evaluated to true, next iteration of loop starts.
 - When the condition becomes false, the loop terminates which marks the end of its life cycle.
 - It is important to note that the do-while loop will execute its statements atleast once before any condition is checked, and therefore is an example of exit control loop.

Loops can be nested inside one another irrespective of their type for example while and for loop can be nested, for and for can be nested, do-while and while loop can be used in a nested format etc.