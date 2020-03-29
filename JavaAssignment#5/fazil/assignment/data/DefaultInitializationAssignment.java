/*Create a class in a package yourname.assignment.data containing an int and
a char member variables that are not initialized,
add a method to print these variables.
Add another method in the same class with two local variables and
 print their values without initializing them.
 */

package fazil.assignment.data;

public class DefaultInitializationAssignment {

    int number;

    char character;

    public void printFields(){

        // number and character are instance variables and when not initialized takes default values
        System.out.println(number+"  "+character);
    }

    public void printLocalFields(){

        int num;
        char ch;
        // It is necessary to initialize the local variables in java,
        // if not initialized they do not take default values but raises compiler error
      //  System.out.println(num+" "+ ch);
    }
}