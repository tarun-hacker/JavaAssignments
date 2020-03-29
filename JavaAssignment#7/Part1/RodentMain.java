package Part1;

import Part1.Gerbil;
import Part1.Hamster;
import Part1.Mouse;
import Part1.Rodent;

public class RodentMain {
    public static void main(String[] args) {
        Rodent[] rodents=new Rodent[4];
        rodents[0]=new Mouse();
        rodents[0].rodentType();
        rodents[0].numberOfIncisor();
        rodents[1]=new Gerbil();
        rodents[1].rodentType();
        rodents[1].numberOfIncisor();
        rodents[2]=new Hamster();
        rodents[2].rodentType();
        rodents[2].numberOfIncisor();

    }
}
// Part1.Rodent class which is abstract class invokes the contructor whenever the sub class object is created with it reference