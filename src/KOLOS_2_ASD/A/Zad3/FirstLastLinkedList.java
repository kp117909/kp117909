package KOLOS_2_ASD.A.Zad3;

public class FirstLastLinkedList {

    private ListElem first;
    private ListElem last;
    public FirstLastLinkedList(){
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int value){
        ListElem newElem = new ListElem(value);
        if(isEmpty()) last = newElem;
        newElem.next = first;
        first = newElem;
    }

    public void insertLast(int value){
        ListElem newElem = new ListElem(value);
        if(isEmpty()) first = newElem;
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

    public void print(){
        System.out.println("Lista początek --> koniec ");
        ListElem current = first;
        while(current!=null){
            System.out.println(current.toString()+" ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        FirstLastLinkedList list  = new FirstLastLinkedList();
        list.insertFirst(20);
        list.insertFirst(31);
        list.insertFirst(15);

        list.insertLast(15);
        list.insertLast(11);
        list.print();

        list.deleteFirst();
        list.print();
    }

}
