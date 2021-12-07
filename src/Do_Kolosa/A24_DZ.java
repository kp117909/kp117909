package Do_Kolosa;

public class A24_DZ {
    final static int tyle_razy = 1000;

    public static void main(String[] args) {
        int liczba_bakteri = 1;
        int liczba2minut = 1;
        System.out.println("Liczba bakteri zwiększy się " + tyle_razy + " po czasie : " + (2*rozmnazanko(liczba_bakteri, liczba2minut)) + " minut");
    }

    public static int rozmnazanko(int n, int t){
        if(tyle_razy  <= n){
            return t;
        }else{
            System.out.println("Liczba bakteri po "+ (2*t) + " minutach, wynosi:  " + n);
            return rozmnazanko(n*2, t+1);
        }
    }

}
