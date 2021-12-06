package AISD;
import java.lang.Math;

public class DzieliZwyziecaj {
    public static void main(String[] args) {
        int min = 0;
        int max = 1000;
        int liczba = RandomInt(min, max);
        //int liczba = 127;
        System.out.println("LICZBA WYNOSI: " +liczba);
        int szukaj = 500;
        int n =0;
        while(liczba != szukaj)
        {
            n = n +1;
            System.out.println("Wybierma liczbę: " + szukaj);
            if (liczba == szukaj)
                System.out.println("TAK |"+szukaj+"|");
            else if(liczba > szukaj)
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
        System.out.println("TAK TA LICZBA TO : |"+szukaj+"|");
        System.out.println("N = " + n);
    }

    public static int RandomInt(int min, int max)
    {
        int range = (max-min) + 1;
        return(int) (Math.random()*range) +min;
    }

}
