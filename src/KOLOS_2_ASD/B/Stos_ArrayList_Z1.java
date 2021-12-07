package KOLOS_2_ASD.B;

import java.util.ArrayList;

public class Stos_ArrayList_Z1 {

    private ArrayList<Integer> Lista;

    public Stos_ArrayList_Z1(){
        Lista = new ArrayList<Integer>();
    }

    public void push(int value){
        Lista.add(value);
    }

    public int pop(){
        int topElem = Lista.get(Lista.size()-1);
        Lista.remove(Lista.size() -1);
        return topElem;
    }

    public int peek(){
        return Lista.get(Lista.size()-1);
    }

    public boolean isEmpty(){
        return Lista.isEmpty();
    }

    public static void main(String[] args) {
        Stos_ArrayList_Z1 stos = new Stos_ArrayList_Z1();

        stos.push(20);
        stos.push(15);
        stos.push(10);
        stos.push(35);
        stos.push(154);

        System.out.println(stos.peek());

        while(!stos.isEmpty()){
            int value = stos.pop();
            System.out.print(value + " ");
        }
        System.out.print("");

    }

}
