package cwiczimy.next;

public class LinkedList {
    public ListElem first;
    public ListElem last;

    public LinkedList(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(int elem){
        ListElem newElem = new ListElem();
        if(isEmpty()) last = newElem;
        newElem.next = last;
        first = newElem;
    }

    public void insertLast(int elem){
        ListElem newElem = new ListElem();
        if(isEmpty()) last = newElem;
        else last.next = newElem;
        last = newElem;
    }

    public ListElem deleteFirst(){
       if(isEmpty()) return null;
       ListElem temp = first;
       if(first.next == null) last = null;
       first = first.next;
       return temp;
    }

}
