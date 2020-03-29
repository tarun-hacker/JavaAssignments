package Part2;

public class Cycle {
    public Cycle(){

        System.out.println(" Part2.Cycle  does not require fuel");
    }
}

class Unicycle extends Cycle{

    public void balance(){

        System.out.println(" Balance the unicyle ");
    }
}

class Bicycle extends Cycle{

    public void balance(){

        System.out.println(" Balance the Part2.Bicycle using legs ");
    }
}
class Tricycle extends Cycle{

    Tricycle(){

        System.out.println(" this is tricycle");
    }
    void tyreCount(){

        System.out.println("3 tyres");
    }
}
