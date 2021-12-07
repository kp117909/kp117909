package KOLOS_2_ASD.B;

import java.util.LinkedList;

public class Kolejka_LinkedList_Z4 {

    private LinkedList<Integer> kolejka;

    public Kolejka_LinkedList_Z4(){
        kolejka = new LinkedList<Integer>();
    }

    public void insert(int value){
        kolejka.add(value);
    }

    public int remove(){
        int value = kolejka.get(0).intValue();
        kolejka.removeFirst();
        return value;
    }

    public int peek(){
        return kolejka.get(0).intValue();
    }

    public boolean isEmpty(){
        return kolejka.isEmpty();
    }

    public int Size(){
        return kolejka.size();
    }

    public static void main(String[] args) {
        Kolejka_LinkedList_Z4 kolejka = new Kolejka_LinkedList_Z4();
        kolejka.insert(20);
        kolejka.insert(15);
        kolejka.insert(133);
        kolejka.remove();
        kolejka.remove();

        while(!kolejka.isEmpty()){
            System.out.println("Usuwam" + kolejka.remove());
        }
    }

}
