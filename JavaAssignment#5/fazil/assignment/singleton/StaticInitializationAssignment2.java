/*Create another class in package yourname.assignment.singleton
containing a non static String member variable.
Add a static method that takes String as parameter and
initialize the member variable and then return object of that class.
Add a non static method to print the String.
 */

package fazil.assignment.singleton;

public class StaticInitializationAssignment2 {

    String str;

    public static StaticInitializationAssignment2 staticMethod(){

       // str="Assignment5";
        // Non static variable cannot be referenced from static methods.
        //Static methods belong to the class with only one instance created initially
        // Non static variables are initialize every time a new object is created.

        return new StaticInitializationAssignment2();
    }

    public void printStr(){

        System.out.println(str);
    }
}
