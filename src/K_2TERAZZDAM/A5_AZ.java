package K_2TERAZZDAM;

public class A5_AZ {
    final static int N = 6;
    private static int[] liczba = new int[N];
    public static int minCzas = Integer.MAX_VALUE;
    public static int aktualCzas = 0;
    public static int[][] tab_lod = new int[N][N];
    final static int START = 0;
    public static void main(String[] args) {
        tab_lod[0][0] = 0;
        tab_lod[0][1] = 7;
        tab_lod[0][2] = 20;
        tab_lod[0][3] = 21;
        tab_lod[0][4] = 12;
        tab_lod[0][5] = 23;

        tab_lod[1][0] = 27;
        tab_lod[1][1] = 0;
        tab_lod[1][2] = 13;
        tab_lod[1][3] = 16;
        tab_lod[1][4] = 46;
        tab_lod[1][5] = 5;

        tab_lod[2][0] = 53;
        tab_lod[2][1] = 15;
        tab_lod[2][2] = 0;
        tab_lod[2][3] = 25;
        tab_lod[2][4] = 27;
        tab_lod[2][5] = 6;

        tab_lod[3][0] = 16;
        tab_lod[3][1] = 2;
        tab_lod[3][2] = 35;
        tab_lod[3][3] = 0;
        tab_lod[3][4] = 47;
        tab_lod[3][5] = 10;

        tab_lod[4][0] = 31;
        tab_lod[4][1] = 29;
        tab_lod[4][2] = 5;
        tab_lod[4][3] = 18;
        tab_lod[4][4] = 0;
        tab_lod[4][5] = 4;

        tab_lod[5][0] = 28;
        tab_lod[5][1] = 24;
        tab_lod[5][2] = 1;
        tab_lod[5][3] = 17;
        tab_lod[5][4] = 5;
        tab_lod[5][5] = 0;

        proba(START);
    }

    static void proba(int i) {

        if (i == N) {

            for (int j = 0; j < N; j++) {
                if(tab_lod[liczba[(j % N)] - 1][liczba[(j + 1) % N] - 1] == -1){
                    continue;
                }else{
                    aktualCzas += tab_lod[liczba[(j % N)] - 1][liczba[(j + 1) % N] - 1];
                }
            }

            if (aktualCzas <= minCzas) {
                minCzas = aktualCzas;
                System.out.println("Czas:\tKolejnosc:");
                System.out.print(minCzas+"\t\t");
                for(int j = 0; j < N+1; j++){
                    System.out.print(liczba[j%N] + " ");
                }
                System.out.print("\n");
            }

            aktualCzas = 0;
        } else {
            for (int j = 1; j <= N; j++)
            {
                int k;
                for (k = 0; k < i; k++) {
                    if (liczba[k] == j) {
                        break;
                    }
                }
                if (k == i) {
                    liczba[k] = j;
                    proba(i + 1);
                }
            }
        }
    }
}
