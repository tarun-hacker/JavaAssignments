package Part1;

public abstract class Rodent {
     public Rodent(){
         System.out.println("Inside the base class Part1.Rodent");
     }
    abstract void rodentType();

      void numberOfIncisor(){
         System.out.println("Rodents have one pair of incisors in each jaw");
     }

}
class Mouse extends Rodent{

    public Mouse(){
        System.out.println("Inside the child class Part1.Mouse");
    }
    @Override
    void rodentType() {
        System.out.println(" Part1.Mouse belongs to Myomorpha");
    }
    @Override
    void numberOfIncisor(){
        System.out.println("Part1.Mouse have one pair of incisors in each jaw");
    }
}
class Gerbil extends Rodent{

    public Gerbil(){
        System.out.println("Inside the child class Part1.Gerbil");
    }
    @Override
    void rodentType() {
        System.out.println(" Part1.Mouse belongs to Gerbillinae in the order of Rodentia");

    }
    @Override
    void numberOfIncisor(){
        System.out.println("Part1.Gerbil have one pair of incisors in each jaw");
    }
}
class Hamster extends Rodent {

    public Hamster() {
        System.out.println("Inside the child class Part1.Hamster");
    }

    @Override
    void rodentType() {
        System.out.println(" Part1.Hamster belongs to Cricetidae in the order of Rodentia");

    }

    void getSize() {
        System.out.println("The cricetids are small mammals, ranging from just 5–8 cm (2.0–3.1 in) in length and 7 g (0.25 oz) in weight ");
    }

    @Override
    void numberOfIncisor() {
        System.out.println("Part1.Gerbil have one pair of incisors in each jaw");
    }
}
