package KOLOS_2_ASD.A.Zad3;

public class ListElem {

    public int iData;
    public ListElem next;

    public ListElem(int iData){
        this.iData = iData;
        next = null;
    }

    public String toString(){
        return Integer.toString(iData);
    }

}
