package AISD;

import java.util.*;

class PlecakowyMonteCarlo {

    static final int N = 6;                // liczba przedmiotow
    static final int MAX_V = 10;           // objetosc plecaka

    final static int[] V = {2, 6, 3, 3, 1, 2};  // objetości przedmiotów
    final static int[] W = {4, 6, 5, 10, 2, 7}; // wartości przedmiotów

    public static void main(String[] args) {
        String opKonfg = new String();
        int optV = -1;
        int optW = 0;
        Random los = new Random();
        for (int i = 0; i < 10; i++) {
            int [] tab =  new int[N];
            for(int j = 0 ; j <N ; j ++) tab[j] = j;

            for (int j = 0; j < N; j++) {
                int rndLos = los.nextInt(N);
                if (rndLos != j) {
                    int pom = tab[j];
                    tab[j] = tab[rndLos];
                    tab[rndLos] = pom;
                }
            }

            String locKonfg = new String();
            int sumW = 0;
            int sumV = 0;
            int j = 0;

            while ((j < N) && (sumV + V[tab[j]] <= MAX_V)) {
                sumV = sumV + V[tab[j]];
                sumW = sumW + W[tab[j]];
                locKonfg = locKonfg + " " + tab[j];
                j++;
            }

            if (optW < sumW) {
                optW = sumW;
                optV = sumV;
                opKonfg = locKonfg;
            }
        }

        System.out.println(optV);
        System.out.println(optW);
        System.out.println(opKonfg);


    }


}
