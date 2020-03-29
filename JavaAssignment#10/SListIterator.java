
import java.util.NoSuchElementException;

class ListNode<T>{

    ListNode<T> next;

     T data;

     public ListNode(T data, ListNode<T> next){

         this.data=data;

         this.next=next;

     }

}

public class SListIterator<T>{

    public ListNode<T> Head;

    public SListIterator(){

        Head=null;
    }
    public ListNode<T> getHead() {

        return Head;
    }

    public void add(T element){

        ListNode<T> temp=Head;

        ListNode<T> newNode=new ListNode<T>(element,null);

        if(temp==null){

            Head=newNode;
        }

        else{

            while(temp.next!=null){

                temp=temp.next;
            }

            temp.next=newNode;
        }

        System.out.println(Head);
    }
    public T remove() {

        T element=null;

        ListNode<T> previousNode = null;

        ListNode<T> currentNode = Head;

        try {

            if (Head == null) {

                throw new NoSuchElementException("empty list");

            }
            else {

                while (currentNode.next != null) {

                    previousNode = currentNode;

                    currentNode = currentNode.next;
                }

                element = currentNode.data;

                previousNode.next = currentNode.next;
            }

        }

        catch (NullPointerException e) {

            System.out.println(e.getMessage());
        }
        return element;
    }

}
