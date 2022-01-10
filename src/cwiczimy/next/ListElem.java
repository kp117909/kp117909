package cwiczimy.next;

public class ListElem {
    public int iData;
    public ListElem next;

    public ListElem(){
        this.iData = next.iData; ;
        next = null;
    }

    public String toString(){
        return  "" + iData;
    }
}
