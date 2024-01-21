## Difference Between Scanner and BufferedReader Class in Java

In Java, Scanner and BufferedReader class are sources that serve as ways of reading inputs. Scanner class is a simple text scanner that can parse primitive types and strings. It internally uses regular expressions to read different types while on the other hand BufferedReader class reads text from a character-input stream, buffering characters so as to provide for the efficient reading of the sequence of characters

The eccentric difference lies in reading different ways of taking input via the next() method that is justified in the below programs over the similar input set.

Example using buffered reader class
```
// Java Program to Illustrate BufferedReader Class

// Importing required class
import java.io.*;

// Main class
class GFG {

    // Main driver method
    public static void main(String args[])
        throws IOException
    {

        // Creating object of class inside main() method
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));

        System.out.println("Enter an integer");

        // Taking integer input
        int a = Integer.parseInt(br.readLine());

        System.out.println("Enter a String");

        String b = br.readLine();

        // Printing input entities above
        System.out.printf("You have entered:- " + a
                          + " and name as " + b);
    }
}
```

Following are the Major Differences between Scanner and BufferedReader Class in Java
 - BufferedReader is synchronous while Scanner is not. BufferedReader should be used if we are working with multiple threads.
 - BufferedReader has a significantly larger buffer memory than Scanner.
 - The Scanner has a little buffer (1KB char buffer) as opposed to the BufferedReader (8KB byte buffer), but it's more than enough.
 - BufferedReader is a bit faster as compared to scanner because the scanner does the parsing of input data and BufferedReader simply reads a sequence of characters.

Ways to read input from console in Java
1. Using BufferedReader class
2. Using scanner class
3. Using console class

Advantages:
 - Reading password without echoing the entered characters.
 - Reading methods are synchronized.
 - Format string syntax can be used.
 - Does not work in non-interactive environment (such as in an IDE).
```
// Java program to demonstrate working of System.console()
// Note that this program does not work on IDEs as
// System.console() may require console
public class Sample {
    public static void main(String[] args)
    {
        // Using Console to input data from user
        String name = System.console().readLine();

        System.out.println("You entered string " + name);
    }
}
```

4. Using command line argument