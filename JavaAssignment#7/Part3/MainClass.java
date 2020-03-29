/* Create three interfaces, each with two methods.
 Inherit a new interface that combines the three, adding a new method.
Create a class by implementing the new interface and also inheriting from a concrete class.
Now write four methods, each of which takes one of the four interfaces as an argument.
In main( ), create an object of your class and pass it to each of the methods.

 */

package Part3;

interface Printable{

    void print();

    void preview();
}

interface Showable{

    void display();

    void show();
}

interface Drawable{
    void drawType();

    void draw();
}

interface interfaceCombine extends Printable, Showable, Drawable{

    void setMessage();
}

public class MainClass extends Rectangle implements interfaceCombine {

    @Override
    public void print() {

        System.out.println("print method");
    }

    @Override
    public void preview() {

        System.out.println("preview method");
    }

    @Override
    public void display() {

        System.out.println("display method");
    }

    @Override
    public void show() {

        System.out.println("show method");
    }

    @Override
    public void drawType() {
        System.out.println("draw type method");
    }

    @Override
    public void draw() {

        System.out.println("draw method");
    }

    @Override
    public void setMessage() {

        System.out.println("set message method");
    }
    void printableMethod(Printable printable){

        printable.print();

        System.out.println(printable.getClass().toString());
    }
    void drawableMethod(Drawable drawable){
        drawable.draw();
        System.out.println(drawable.getClass().toString());
    }

    void showableMethod(Showable showable){

        showable.show();

        System.out.println(showable.getClass().toString());

    }

    void interfaceCombineMethod(interfaceCombine interfaceCombine){

        interfaceCombine.setMessage();

        System.out.println(interfaceCombine.getClass().toString());

    }

    public static void main(String[] args) {

        MainClass mainClass=new MainClass();

        mainClass.printableMethod(mainClass);

        mainClass.drawableMethod(mainClass);

        mainClass.showableMethod(mainClass);

        mainClass.interfaceCombineMethod(mainClass);

    }
}
