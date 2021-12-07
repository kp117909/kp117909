package AISD;

public class A24_A25_DZ
{
    public static void main(String[] args)
    {
        double b = 0;
        int czas2min = 0;
       /* while(b<100*1000) // badamy kiedy nastąpi zwiększenie 1000-krotne populacji
        {
            czas2min++;
            b = a24(czas2min);
            System.out.println("liczba bakterii: "+b);
        }
        System.out.println("minut: "+2*czas2min); // 2*czas2min bo czas2min to okres 2 minut

        System.out.println("\n///////////////////////////////////////////\n");*/

        double lososie = 1000000; // lososie poczatkowe
        int czas = 0;
        while(lososie>=100) // dopoki >=100 to jeszcze nie wyginely
        {
            czas++;
            lososie = a25(czas);
            System.out.println("liczba lososi: "+lososie);
        }
        System.out.println("minut: "+czas);
    }


    /**
     *
     * @param min2 - czas wyrazony w jednostkach: 2minuty
     * @return
     */
    static double a24(int min2)
    {
        if(min2==1) // warunek poczatkowy (w zad. nie ma wyraznie okreslonej poczatkowej liczby bakterii)
            return 100; // sami zatem zakladamy, ze na starcie mamy np. 100 bakterii
        else
            return 2*a24(min2-1); // z 1 powstaja 2 nowe co 2 minuty, czyli co jednostke 2min
    }
    /**
     *
     * @param minuty - czas wyrazony w minutach
     * @return
     */
    static double a25(int minuty)
    {
        if(minuty == 1)
            return 1000000; // 1mln lososi na poczatku
        else // 0.002 zjedzone i 0.002 odplywa czyli zostaje 0.996
            return 0.996 * a25(minuty-1) * Math.pow(Math.E, 0.003);
    }
}
