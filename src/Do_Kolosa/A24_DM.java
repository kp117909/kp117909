package Do_Kolosa;

public class A24_DM {
    final static int tyle_razy = 1000;

    public static void main(String[] args) {
        int liczba_bakteri = 1;
        int czas2minut = 0;
        System.out.println("Liczba bakteri wzrosnie o  " + tyle_razy + " po czasie : " +  2*rozmnazanko(liczba_bakteri, czas2minut) + " minut");
    }

    public static int rozmnazanko(int n , int t){
        int tab [] = new int[100];
        tab[0] = n;
        for(int i = 1; tyle_razy >= tab[i-1] ; i++){
            t++;
            tab[i] = tab[i-1] + 2*tab[i-1];
            System.out.println("Liczba bakteri po " + (2*t)  + " minutach wynosi: " + tab[i]);
        }

        return t;
    }

}
