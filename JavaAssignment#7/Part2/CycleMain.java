package Part2;

import Part2.Bicycle;
import Part2.Cycle;
import Part2.Tricycle;
import Part2.Unicycle;

public class CycleMain {

    public static void main(String[] args) {

        Unicycle unicycle = new Unicycle();

        Bicycle bicycle = new Bicycle();

        Tricycle tricycle = new Tricycle();

        //Upcasting

        Cycle[] cycle = new Cycle[3];

        cycle[0]=(Cycle) unicycle;
        // cycle[0].balance();

        cycle[1]=(Cycle) bicycle;
        //cycle[1].balance();

        cycle[2]=(Cycle) tricycle;
        //cycle[2].balance();

        //DownCasting

        Cycle cycle1=new Unicycle();

        Unicycle unicycle1=(Unicycle) cycle1;

        unicycle1.balance();

        Cycle cycle2=new Bicycle();

        Bicycle bicycle1=(Bicycle) cycle2;

        bicycle1.balance();

        Cycle cycle3=new Tricycle();

        Tricycle tricycle1=(Tricycle) cycle3;

        //tricycle1.balance();
        /*
         * The above statement gives above error because TriCycle class do not have balance() method.
         */
        tricycle1.tyreCount();

    }
}
