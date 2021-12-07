package Do_Kolosa;

import java.util.Random;
public class KosmonauciMC {

    static final int LOS = 10;

    public static void main(String[] args) {
       astro();
    }

    public static void astro(){
        int [][] astroSpec = {{1,4},{2,3,4},{3,5},{1,2,5}};
        int[] astro = {1,2,3,4,5};
        int N = astro.length;

        String optKonfig = new String();
        int optAstroLicz = N;

        Random los = new Random();
        for(int i = 0 ; i < LOS; i++){

            System.out.println("Rozwiązanie nr: " + (i+1));
            for(int j = 0 ; j < astro.length ; j++){
                int rndIndex = los.nextInt(N);
                if(rndIndex!=j){
                    int pom = astro[j];
                    astro[j] = astro[rndIndex];
                    astro[rndIndex] = pom;
                }
            }

            for(int j : astro){
                System.out.print(j + "\t");
            }
            System.out.println();

            String locKonfg = new String();
            int astroLicz = 0;

            int[] specStatus = new int[astroSpec.length];
            int j = 0;
            int sumSpec = 0;
            while(sumSpec < astroSpec.length){
                for(int k = 0 ; k < astroSpec.length; k++) {
                    for (int l = 0; l < astroSpec[k].length; l++) {
                        if (astroSpec[k][l] == astro[j]) {
                            specStatus[k]++;
                        }
                    }
                }
                    locKonfg = locKonfg + " "  + astro[j];
                    astroLicz++;
                    j++;
                    sumSpec = 0;

                    for(int specStat:specStatus)
                        if(specStat>=1)
                            sumSpec++;

                    System.out.println("\tAstro zabrani:" + locKonfg);
                    System.out.println("\tObsadzoen specjalności: \t"+sumSpec + " \t");
                    for(int specStat:specStatus)
                        System.out.print(specStat+ " ");
                    System.out.println();
                }
                System.out.println("Konfig: " + locKonfg);

                if(astroLicz<optAstroLicz){
                    optKonfig = locKonfg;
                    optAstroLicz = astroLicz;
                }
        }
            System.out.println("///////////////////");
            System.out.println("Mogą lecieć " + optKonfig);
    }

}
