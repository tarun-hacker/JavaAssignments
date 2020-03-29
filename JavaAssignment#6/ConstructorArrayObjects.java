/* Create a class with a constructor that takes a String argument.
    During construction, print the argument.
    Create an array of object references to this class, but don’t actually create objects to assign into the array.
    When you run the program, notice whether the initialization messages from the constructor calls are printed.
 */
public class ConstructorArrayObjects {
    String stringField;
    public ConstructorArrayObjects(String stringField){
        System.out.println(stringField);
    }

    public static void main(String[] args) {
        ConstructorArrayObjects[] arrayOfObjects=new ConstructorArrayObjects[4];
        //arrayOfObjects creates a references to  ConstructorArrayObjects class objects but does not creates the objects
        for(int i=0;i<4;i++){
            arrayOfObjects[i]=new ConstructorArrayObjects("Object"+(i+1));
            System.out.println(arrayOfObjects[i]);
        }

    }
}
