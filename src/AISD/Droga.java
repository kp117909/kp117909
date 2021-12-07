package AISD;

import java.util.ArrayList;
import java.util.Random;

public class Droga {

    final static int[][] droga_tab = {
            {0,300,402,356,-1,-1,-1,-1,-1},
            {300,0-1,-1,440,473,-1,-1,-1},
            {402,-1,0,-1,-1,330,-1,-1,-1},
            {356,-1,-1,-1,-1,-1,823,-1,-1},
            {-1,440,-1,-1,0,-1,-1,430,-1},
            {-1,474,330,-1,-1,0,813,365,774},
            {-1,-1,-1,823,-1,813,0,-1,403},
            {-1,-1,-1,-1,430,365,-1,0,768},
            {-1,-1,-1,-1,-1,774,403,768,0},
    };

    public static void main(String[] args) {
        int[] best_way = new int[droga_tab.length+1];
        int best_km = Integer.MAX_VALUE;
        for(int i = 0 ; i < 10; i++) {
            int[] rand = randomOrder();
            int droga = getTime(rand);
            if (droga == -1) continue;

            if (droga < best_km) {
                best_km = droga;
                best_way = rand;
            }

        }
            System.out.print("Najlepsza konfiguracja: ");
            for(int i = 0; i < droga_tab.length+1; i++){
                System.out.print(best_way[i] + " ");
            }
            System.out.println();
            System.out.println("Czas: " + best_km);
    }

    private static int getTime(int[] rand) {
        int time = 0;
        for(int i = 0; i < droga_tab.length; i++){
            if(droga_tab[i][i+1] == -1){
                return -1;
            }
            time += droga_tab[i][i+1];
        }
        return time;
    }


    private static int[] randomOrder() {
        ArrayList<Integer> rand = new ArrayList<>();
        Random rnd = new Random();
        while (rand.size() < droga_tab.length+1) {
            int num = rnd.nextInt(droga_tab.length+1) + 1;
            if(!rand.contains(num)){
                rand.add(num);
            }
        }
        return rand.stream().mapToInt(i->i).toArray();
    }

}
