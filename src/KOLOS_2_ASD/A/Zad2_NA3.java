package KOLOS_2_ASD.A;

public class Zad2_NA3 {

    private int[] table;
    private int nElems;

    public Zad2_NA3(int maxSize){
        table = new int[maxSize];
        nElems = 0;
    }

    public void add(int number){
        if(nElems >= table.length){
            int []locTable = new int[table.length*2];
            for(int i =0 ; i < table.length; i++) locTable[i] = table[i];
            table = locTable;
        }
        int j;
        for(j = 0 ; j < nElems; j++){
            if(table[j]>number) break;
        }

        for(int k = nElems ; k > j; k--){
            table[k] = table[k-1];
        }
        table[j] = number;
        nElems++;
    }

    public int get(int index){
        return table[index];
    }

    public int size(){
        return nElems;
    }

    public boolean remove(int index){
        if(nElems == 0 || index >= nElems || index < 0){
            return false;
        }
        for(int j = index ; j < nElems - 1 ; j++){
            table[j] = table[j+1];
        }
        nElems--;
        return true;
    }

    public int find(int searchElem){
        int left = 0 ;
        int right = nElems -1;
        int currIndex;

        while(true){
            currIndex = (left+right)/2;
            if(table[currIndex] == searchElem) return searchElem;
            else{
                if(left > right) return -1;
                else{
                    if(table[currIndex] < searchElem){
                        left = currIndex +1;
                    }else{
                        right = currIndex -1;
                    }
                }
            }
        }
    }

    public void print(){
        for(int i =0 ; i < nElems; i++){
            System.out.print(get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int maxSize = 2;
        Zad2_NA3 array =  new Zad2_NA3(maxSize);
        array.add(50);
        array.add(20);
        array.add(13);
        array.print();
        System.out.println(array.size());

        array.remove(1);
        array.print();

        int znajdz = array.find(30);
        System.out.println(znajdz);
    }

}
