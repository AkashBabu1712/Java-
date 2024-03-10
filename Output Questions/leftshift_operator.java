// What will be the output of the following Java program?

    class leftshift_operator 
    {
        public static void main(String args[]) 
        {        
             byte x = 64;
             int i;
             byte y; 
             i = x << 2;
             y = (byte) (x << 2);
             System.out.print(i + " " + y);
        } 
    }

    // output: 256 0


// Explanation:

// A class named leftshift_operator is declared.
// Inside the main method:
// byte x = 64; declares a byte variable x and initializes it with the value 64.
// int i; declares an integer variable i.
// byte y; declares a byte variable y.
// i = x << 2; left shifts the bits of x by 2 positions and assigns the result to i. This operation effectively multiplies x by 2 raised to the power of 2.
// (byte) (x << 2); left shifts the bits of x by 2 positions, casts the result to a byte, and assigns it to y.
// System.out.print(i + " " + y); prints the values of i and y.

// Explanation of output:

// The left shift operation x << 2 on a byte variable x effectively shifts the bits of x to the left by 2 positions, resulting in 256 (which is 64 * 2^2).
// However, when the result is assigned back to a byte variable y, it undergoes type casting. Since a byte can only hold values from -128 to 127, the value 256 exceeds this range. Therefore, it gets truncated, and only the lower 8 bits are retained, resulting in 0.
// So, i holds 256, and y holds 0.