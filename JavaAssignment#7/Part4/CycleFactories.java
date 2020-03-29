/*
Create a Cycle interface, with implementations Unicycle, Bicycle and Tricycle.
Create factories for each type of Cycle, and code that uses these factories.

 */


package Part4;

interface Cycle{

    void ride();

}

interface CycleFactory{

    Cycle getCycleType();

}

class Unicycle implements Cycle{

    @Override
    public void ride() {
        System.out.println("Riding Unicycle ");
    }
}

class UniFactory implements CycleFactory{

    public Cycle getCycleType() {
        return new Unicycle();
    }
}

class Bicycle implements Cycle{

    @Override
    public void ride() {
        System.out.println("Riding Bicycle ");
    }
}

class BiFactory implements CycleFactory{

    public Cycle getCycleType(){
        return new Bicycle();
    }
}

class Tricycle implements Cycle{

    @Override
    public void ride() {
        System.out.println("Riding Tricycle ");
    }
}

class TriFactory implements CycleFactory{

    public Cycle getCycleType(){
        return new Tricycle();
    }
}

public class CycleFactories {
    public static void rideCycle(CycleFactory factory){
        Cycle cycle=factory.getCycleType();
        cycle.ride();
    }

    public static void main(String[] args) {
        rideCycle(new UniFactory());
        rideCycle(new BiFactory());
        rideCycle(new TriFactory());
    }
}
