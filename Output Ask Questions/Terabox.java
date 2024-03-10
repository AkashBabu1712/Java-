// What will be the output of the following Java code?

class box {
    int width;
    int height;
    int length;
}

class Terabox {
    
    public static void main(String args[]) 
    {
        box obj = new box();  // Creating an object of the box class
        obj.width = 10;  // Assigning a value of 10 to the width field
        obj.height = 2;  // Assigning a value of 2 to the height field
        obj.length = 10;  // Assigning a value of 10 to the length field
        
        // Calculating the volume of the box
        int y = obj.width * obj.height * obj.length;
        
        // Printing the volume
        System.out.print(y);
    } 
}
