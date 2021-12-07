package KOLOS_2_ASD.B;

import java.util.LinkedList;

public class Stos_LinkedList_Z2 {

    private LinkedList<Integer> inStock;

    public Stos_LinkedList_Z2() {
        inStock = new LinkedList<Integer>();
    }

    public void push(int value){
        inStock.add(value);
    }

    public int pop(){
        return inStock.pop();
    }

    public int peek(){
        return inStock.peek();
    }

    public boolean isEmpty(){
        return inStock.isEmpty();
    }

    public static void main(String[] args) {
        Stos_LinkedList_Z2 stos = new Stos_LinkedList_Z2();
        stos.push(20);
        stos.push(15);
        stos.pop();
        stos.push(13);
        System.out.println("GÓRA" + stos.peek());
        stos.push(30);

        while(!stos.isEmpty()){
             int value = stos.pop();
            System.out.println(value + " ");
        }
    }

}
