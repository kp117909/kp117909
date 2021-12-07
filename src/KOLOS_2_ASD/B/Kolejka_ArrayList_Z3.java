package KOLOS_2_ASD.B;

import java.util.ArrayList;

public class Kolejka_ArrayList_Z3 {

    private ArrayList<Integer> intQueue;
    public Kolejka_ArrayList_Z3(){
        intQueue = new ArrayList<Integer>();
    }

    public void insert(int value){
        System.out.println("Daje wartość: " + value);
        intQueue.add(value);
    }

    public int remove(){
        int value = intQueue.get(0).intValue();
        intQueue.remove(0);
        return value;
    }

    public int peek(){
        return intQueue.get(0).intValue();
    }

    public boolean isEmpty(){
        return intQueue.isEmpty();
    }

    public int Size(){
        return intQueue.size();
    }

    public static void main(String[] args) {
        Kolejka_ArrayList_Z3 kolejka = new Kolejka_ArrayList_Z3();
        kolejka.insert(20);
        kolejka.insert(15);
        kolejka.insert(5);
        kolejka.insert(1);

        System.out.println(kolejka.remove());
        System.out.println(kolejka.Size());
        while(!kolejka.isEmpty()){
            System.out.println("Usuwam: " + kolejka.remove());
        }
    }

}
