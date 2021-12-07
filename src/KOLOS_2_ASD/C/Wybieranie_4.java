package KOLOS_2_ASD.C;

public class Wybieranie_4 {
    private static int [] table = {5,2,1,6,3,-2,65,1,-2};
    private static int nElemes = table.length;
    public static void main(String[] args) {
        System.out.println("Przed: ");
        for(int elem : table){
            System.out.print(elem + "  ");
        }
        System.out.println();
        sortowaniewybiernaie();
        System.out.println("Po");
        for(int elem : table){
            System.out.print(elem + "  ");
        }
    }

    public static void sortowaniewybiernaie(){
        for(int i = 0 ; i < nElemes; i ++){

            int minPos = i;

            for(int j = i+1 ; j < nElemes ; j ++){

                if(table[j] < table[minPos]){

                    minPos = j;

                }

            }

            swap(i, minPos);

            }
    }

    public static void swap(int i , int min){
        int temp = table[i];
        table[i] = table[min];
        table[min] = temp;
    }
}
