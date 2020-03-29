public class SList<T> {

    SListIterator<T> sListIterator;

    public String toString() {

        ListNode<T> temp=sListIterator.getHead();

        System.out.println(temp);

        StringBuilder result=new StringBuilder();

        result.append("{");

        while(temp.next!=null){

            result.append(temp.data+" , ");

            temp=temp.next;

        }

        result.append("}");

        return result.toString();

    }

    public SListIterator<T> iterator() {

        return new SListIterator<T>();
    }
}
