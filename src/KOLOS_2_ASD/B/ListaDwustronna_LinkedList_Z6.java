package KOLOS_2_ASD.B;

import java.util.LinkedList;

public class ListaDwustronna_LinkedList_Z6 {

    private LinkedList<Object> list;


    public ListaDwustronna_LinkedList_Z6(){
        list = new LinkedList<Object>();
    }

    public void addFirst(Object value){
        list.addFirst(value);
    }

    public void addLast(Object value){
        list.addLast(value);
    }

    public void removeFrist(){
        list.removeFirst();
    }

    public void removeLast(){
        list.removeLast();
    }

    public Object getFirst(){
        return list.getFirst();
    }

    public Object getLast(){
        return list.getLast();
    }

    public int Size(){
        return list.size();
    }

    public boolean getElem(Object value){
        for(int i = 0 ; i < list.size() ; i++){
            if(list.get(i).equals(value))return true; break;
        }
        return false;
    }

    public void print(){
        for(int i = 0 ; i < list.size(); i++){
            System.out.println("Element " + list.get(i));
        }
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public static void main(String[] args) {
        ListaDwustronna_LinkedList_Z6 lista = new ListaDwustronna_LinkedList_Z6();

        lista.addFirst("A"); //A
        lista.addFirst("B"); //B
        lista.addFirst("C"); //C

        lista.print();

        lista.addLast("D"); //D
        lista.addLast("E"); //E
        System.out.println("");
        lista.print();

        System.out.println("");
        lista.removeFrist();
        lista.removeLast();
        lista.print();
        System.out.println("");
        System.out.println(lista.getElem("B"));
        System.out.println(lista.getElem("E"));

    }

}
