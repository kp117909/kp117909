package com.company;
import java.lang.Math;

public class DzieliZwyziecaj {
    public static void main(String[] args) {
        int min = 0;
        int max = 1000;
        int liczba = RandomInt(min, max);
        //int liczba = 127;
        System.out.println("LICZBA WYNOSI: " +liczba);
        int szukaj = (min+max)/2;
        int opt = 100;
        for(int i = 0 ; i < 2 ; i++){
            int n = 0;

            while(liczba != szukaj)
            {
                n = n +1;
                System.out.println("Wybierma liczbę: " + szukaj);
                if(liczba > szukaj)
                {
                    System.out.println("ZA MALA  |" + szukaj+"|");
                    min = szukaj;
                    szukaj = RandomInt(min, max);
                    System.out.println("Przedział wynosi (" + min + " , " + max + " )");
                }
                else
                {
                    System.out.println("ZA DUZA  |"+szukaj+"|");
                    max = szukaj;
                    szukaj = RandomInt(min,max);
                    System.out.println("Przedział wynosi (" + min + " , " + max + " )");
                }
            }
            if(liczba == szukaj || i < 9){
                min = 0;
                max = 1000;
                szukaj = (min+max)/2;
                System.out.println("\tLICZBA POWTÓRZEN W TYM : " + n);
            }
            if(opt > n){
                opt = n;
            }
        }
        System.out.println("TAK TA LICZBA TO : |"+liczba+"|");
        System.out.println("N = " + opt);
    }

    public static int RandomInt(int min, int max)
    {
        int range = (max-min) + 1;
        return(int) (Math.random()*range) +min;
    }

}
