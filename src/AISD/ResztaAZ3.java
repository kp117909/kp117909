package AISD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ResztaAZ3
{
    public static void main(String[] args) throws IOException{
        final int [] M = {500,200,100,50,20,10,5,2,1};
        final int [] L = {0 , 0   ,1 , 0 , 0 ,0 ,0 ,0 , 0};
        int [] zliczaj = new int[M.length];
        int zl , gr , r, i = 0;
        zl = 1;
        gr = 59;
        r = zl * 100 + gr;
        while(r>0 && i < M.length){
            if(M[i] <= r && L[i] > 0) {
                System.out.println("Nominał " + M[i] / 100.0 + " zł");
                zliczaj[i]++;
                r = r - M[i];
                L[i]--;
            } else{
                i++;
            }
        }

        for(int j = 0 ; j < M.length ; j++){
            if(zliczaj[j] > 0)
            System.out.println("Nominał " +  M[j]/100.0 + " zł " +  zliczaj[j] +  " razy");
        }

        if(r>0)
            System.out.println("NIE I CHUJ " + r/100.0 + " zł");

    }



}
