package Do_Kolosa;
import static java.lang.Math.*;

public class A25_DZ {
    final static double tyle_razy_pol = 1000000/2;
    final static double tyle_razy_jedna_czwarta = 1000000/4;
    final static double tyle_razy_jedna_dziesiata = 1000000/10;
    final static double tyle_razy_jedna_setna = 1000000/100;

    public static void main(String[] args) {
        double liczba_lososi = 1000000;
        int minuta = 0;
        double liczba_promili = 0.004;
       /* System.out.println("Liczba łososi zmaleje dwukrotnie po czasie : " + lososie(liczba_lososi, liczba_promili, minuta) + " minut");*/
        System.out.println("Lososie wymrą po czasie: " + lososieWym(liczba_lososi, minuta) + " minut");
    }

    public static int lososieWym(double n ,int t){
        t++;
        if(n <= 100){
            return t;
        }else{
            System.out.println("Liczba lososi po " + t + " minutach jest równa: " + n);
            return(lososieWym((0.996 * n * pow(E,0.003)), t));
        }
    }


}
