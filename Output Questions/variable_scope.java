// What will be the output of the following Java program?

class variable_scope {
    public static void main(String args[]) {
        int x; // Declare variable x
        x = 5; // Assign value 5 to x
        
        // Start of a new block
        {
            int y = 6; // Declare and initialize variable y
            System.out.print(x + " " + y); // Print the values of x and y
        }
        // End of the block
        
        //System.out.println(x + " " + y); // Attempt to print the values of x and y (y is out of scope here)
    } 
}


    /*
     Explanation:

A class named variable_scope is declared.

Inside the main method:
int x; declares an integer variable x.
x = 5; assigns the value 5 to x.
Inside a nested block (denoted by {}), another integer variable y is declared and initialized with the value 6.
System.out.print(x + " " + y); prints the values of x and y.
System.out.println(x + " " + y); attempts to print the values of x and y again. However, y is out of scope here because it was declared inside the nested block, so this line will result in a compilation error.

Output:
The program will produce a compilation error because the variable y is out of scope when trying to print it outside of its block. Therefore, the code will not compile.
     */