package AISD;

import java.util.*;

public class Lody
{
    final static int Liczba_Losowan = 10;


    final static int[][] tab_lody = {
            { 0,7,20,21,12,23},
            { 27,0,13,16,46,5},
            { 53,15,0,-1,27,6},
            { 31,29,5,18,0,4},
            { 28,24,1,17,5,0},
    };

    public static void main(String[] args)
    {
        int[] best_order = new int[tab_lody.length+1];
        int best_time = Integer.MAX_VALUE;
        for (int i = 0; i < Liczba_Losowan; i++)
        {
            int[] rand = randomOrder();
            int time = getTime(rand);
          /*  if(time == -1) continue;*/

            if (time < best_time) {
                best_time = time;
                best_order = rand;
            }
        }

        System.out.print("Najlepsza konfiguracja: ");
        for(int i = 0; i < tab_lody.length+1; i++){
            System.out.print(best_order[i] + " ");
        }
        System.out.println();
        System.out.println("Czas: " + best_time);
    }

    private static int getTime(int[] rand) {
        int time = 0;
        for(int i = 0; i < tab_lody.length; i++){
             if(tab_lody[i][i+1] == 0){
                 if(tab_lody[i][i+1] == -1) continue;
                return tab_lody[i][i+2];
            }
            System.out.println(tab_lody[i][i+1]);
            time += tab_lody[i][i+1];
        }
        return time;
    }


    private static int[] randomOrder() {
        ArrayList<Integer> rand = new ArrayList<>();
        Random rnd = new Random();
        while (rand.size() < tab_lody.length+1) {
            int num = rnd.nextInt(tab_lody.length+1) + 1;
            if(!rand.contains(num)){
                rand.add(num);
            }
        }
        return rand.stream().mapToInt(i->i).toArray();
    }
}