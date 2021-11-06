package AISD;
import java.lang.Math;

public class DzieliZwyziecaj_correct {
    public static void main(String[] args) {
        int min = 0;
        int max = 1000;
        int liczba_losowana = 325;
        System.out.println("LICZBA WYNOSI: " + liczba_losowana);
        System.out.println("Czy ta liczba jest to " + (min+max/2));
        if (liczba_losowana == (min+max/2)) {
            System.out.println("KOX");
        }
        else {
            if(liczba_losowana > )
        }

    }

    public static int RandomInt(int min, int max)
    {
        int range = (max-min) + 1;
        return(int) (Math.random()*range) +min;
    }

}
