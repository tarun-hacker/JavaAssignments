public class MainClass {

    public static void main(String args[]) {

        SList<String> sList = new SList<String>();

        SListIterator<String> sListIterator = sList.iterator();

        sListIterator.add("A");

        sListIterator.add("B");

        sListIterator.add("C");

        sListIterator.add("D");

        System.out.println(sListIterator.remove());

        sListIterator.add("X");

        sListIterator.add("Y");

        sListIterator.add("Z");

        System.out.println("Single Linkedlist is  :" + sList);
    }
}
