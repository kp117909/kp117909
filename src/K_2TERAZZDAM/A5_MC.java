package K_2TERAZZDAM;
import java.util.Random;


public class A5_MC {
    final static int N = 10000;
    private static int[][] tab =
                {
                        {0,7,20,21,12,23},
                        {27,0,13,16,46,5},
                        {53,15,0,25,27,6},
                        {16,2,35,0,47,10},
                        {31,29,5,18,0,4},
                        {28,24,1,17,5,0}
                };
    private static int[] tab_l = new int[7];
    private static int najRozw = 1000;
    private static int aktRozw;
    private static int sprawdz;
    private static int kosztCzas = 0;

    public static void main(String[] args){
        Random random = new Random();

        for(int i = 0; i < N; i++){
            for(int a = 0; a < 7; a++) {
                tab_l[a] = random.nextInt(6) + 1;
            }

            tab_l[6] = tab_l[0];

            for (int j = 0; j < 6; j++) {
                if(tab[tab_l[j]-1][tab_l[j+1]-1] == -1) continue;
                kosztCzas = tab[tab_l[j]-1][tab_l[j+1] - 1] + kosztCzas;
            }

            kosztCzas = kosztCzas+ tab[tab_l[6]-1][tab_l[0]- 1];
            aktRozw = kosztCzas;
            kosztCzas = 0;

            int q = 0;
            for(int k = 0; k < 7; k++){
                int temp = k + 1;
                while(temp < 7){
                    if(tab_l[k] == tab_l[temp]){
                        q++;
                        break;
                    }
                    temp++;
                }
            }

            if(aktRozw < najRozw && q == 1 ){
                System.out.print("Smaki:" );
                for(int a = 0; a < 7; a++) {
                    System.out.print(" " +  tab_l[a] );
                }
                sprawdz = 1;
                najRozw = aktRozw;
                System.out.print(" || ");
                System.out.println("Koszt: " + aktRozw );
            }
            aktRozw = 0;
        }
        if(sprawdz != 1){
            System.out.println("Brak rozwiązania!");
        }
    }
}

