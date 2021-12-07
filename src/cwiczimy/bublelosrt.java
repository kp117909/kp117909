package cwiczimy;

import java.util.ArrayList;

public class bublelosrt {

    private ArrayList<Integer> lista;

    public bublelosrt(){
        lista = new ArrayList<Integer>();
    }

    public void insert(int value){
        lista.add(value);
    }

    public int remove(){
        int lastELem = lista.get(0).intValue();
        lista.remove(0);
        return lastELem;
    }

    public int peek(){
        return lista.get(0);
    }

    public boolean isEmpty(){
        return lista.isEmpty();
    }

    public static void main(String[] args) {
        bublelosrt lista = new bublelosrt();
        lista.insert(1);
        lista.insert(2);
        lista.insert(3);

        System.out.println(lista.peek());

        while(!lista.isEmpty()){
            System.out.println("Usuwamy" +  lista.remove());
        }
    }





}
