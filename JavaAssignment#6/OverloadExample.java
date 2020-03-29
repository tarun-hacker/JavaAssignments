/*   Create a class with two (overloaded) constructors.
Using this, call the second constructor inside the first one.
 */

public class OverloadExample {

    int rollNo;

    int phoneNumber;

    String name;

    public OverloadExample(String name){

        this(5,23456778);

        this.name=name;

        System.out.println(name);

    }

    public OverloadExample(int rollNo, int phoneNumber){

        this.rollNo=rollNo;

        this.phoneNumber=phoneNumber;

        System.out.println(rollNo + " "+ phoneNumber);

    }

}
