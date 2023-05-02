public class SwapingVaribles {
    // this program will swap the values of two variables, x and y, using a temporary variable temp. 
    // After the swap, it prints the values of x and y to the console.
    public static void main(String[] args) {
        //Declare two String variables, x and y, and assign them the values "water" and "Kool-Aid" respectively.
        String x = "Well done you passed your test";
        String y = "Sorry you have not passed your test";
        //Declare a String variable temp to hold the temporary value during the swap.
        String temp;
//Assign the value of x to temp, effectively storing the value of x in temp
// Assign the value of y to x, effectively swapping the values of x and y.
// Assign the value of temp to y, effectively storing the original value of x (which was stored in temp) in y
        temp  = x;
        x = y;
        y=temp;
//Print the values of x and y to the console using System.out.println() statements.
        System.out.println("x is " +  x);
        System.out.println("y is "+   y);

    }
}
