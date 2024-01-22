## What is an Array?
An array is a collection of items of same data type stored at contiguous memory locations. 

This makes it easier to calculate the position of each element by simply adding an offset to a base value, i.e., the memory location of the first element of the array (generally denoted by the name of the array). The base value is index 0 and the difference between the two indexes is the offset.

#### Is the array always of fixed size?
In C language, the array has a fixed size meaning once the size is given to it, it cannot be changed i.e. you can’t shrink it nor can you expand it. The reason was that for expanding if we change the size we can’t be sure ( it’s not possible every time) that we get the next memory location to us for free. The shrinking will not work because the array, when declared, gets memory statically allocated, and thus compiler is the only one that can destroy it.

#### Types of indexing in an array
 - 0 (zero-based indexing): The first element of the array is indexed by a subscript of 0.
 - 1 (one-based indexing): The first element of the array is indexed by the subscript of 1.
 - n (N-based indexing): The base index of an array can be freely chosen. Usually, programming languages allowing n-based indexing also allow negative index values, and other scalar data types like enumerations, or characters may be used as an array index.

#### How an Array is initialized?
By default the array is uninitialized, and no elements of the array are set to any value. However, for the proper working of the array, array initialization becomes important. Array initialization can be done by the following methods:

1. *Passing no value within the initializer*: One can initialize the array by defining the size of the array and passing no values within the initializer.

Syntax
> int arr[ 5 ] = {  };

2. *By passing specific values within the initializer*: One can initialize the array by defining the size of the array and passing specific values within the initializer. 

Syntax:
> int arr[ 5 ] = { 1 , 2 , 3 , 4 , 5 };

Note: The count of elements within the "{ }", must be less than the size of the array 
If the count of elements within the "{ }" is less than the size of the array, the remaining positions are considered to be '0'.

Syntax:
> int arr[ 5 ] = { 1 , 2 , 3 } ;

3. By passing specific values within the initializer but not declaring the size: One can initialize the array by passing specific values within the initializer and not particularly mentioning the size, the size is interpreted by the compiler.

Syntax:
> int arr[  ] = { 1 , 2 , 3 , 4 , 5 };

4. Universal Initialization: After the adoption of universal initialization in C++, one can avoid using the equals sign between the declaration and the initializer. 
Syntax:
> int arr[ ]  { 1 , 2 , 3 , 4 , 5 };

#### Different Operations on Array
1. Insertion in an array
2. Accessing elements in an array
3. Searching an array

#### Advantages of using Array
 - Arrays allow random access to elements. This makes accessing elements by position faster.
 - Arrays have better cache locality which makes a pretty big difference in performance.
 - Arrays represent multiple data items of the same type using a single name.

#### Applications on Array
 - Array stores data elements of the same data type.
 - Arrays are used when the size of the data set is known.
 - Used in solving matrix problems.
 - Applied as a lookup table in computer.
 - Databases records are also implemented by the array.
 - Helps in implementing sorting algorithm.
 - The different variables of the same type can be saved under one name
 - Arrays can be used for CPU scheduling.
 - Used to Implement other data structures like Stacks, Queues, Heaps, Hash tables, etc.