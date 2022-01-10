package K_2TERAZZDAM;

import java.util.ArrayList;

public class A4_AZ {

    public static void main(String[] args) {
        int [][] astroSkills = {{1,4}, {2,3,4}, {3,5}, {1,2,5}};
        int [] astro = {1,2,3,4,5};

        int ind = 0 ;
        ArrayList<Integer> onBoard = new ArrayList<Integer>();
        while(true){
            if(ind == astro.length)
                break;
            System.out.println("Analizowany Astro: " + astro[ind]);

            int skill = 0;
            for(int i = 0 ; i < astroSkills.length; i++){
                for(int j = 0 ; j < astroSkills[i].length; j++){
                    if(astro[ind] == astroSkills[i][j])
                        skill++;
                }
            }
            System.out.println("\t Astro_"+astro[ind] + " : " +skill + " spec");

            if(skill >= 1 ){
                onBoard.add(astro[ind]);
                System.out.println("Astronauta na pokładzie" + onBoard.toString());
            }else{
                ind++;
                continue;
            }

            int match = 0 ;
            for(int i = 0 ; i < astroSkills.length; i++){
                for(int j = 0 ; j < astroSkills[i].length; j++) {
                    if (onBoard.contains(astroSkills[i][j])) {
                        match++;
                        break;
                    }
                }
            }

            System.out.println("Obsadzonych dziedzin :" + match);

            if(match == astroSkills.length) break;
            ind++;
        }

        if(ind == astro.length)
            System.out.println("Brak");
        else System.out.println("Mogą lecieć: " + onBoard.toString());


    }
}
