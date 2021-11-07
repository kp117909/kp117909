package AISD;
import java.lang.Math;

public class DzieliZwyziecaj_correct {

    public static int znajdz(int min, int max , int szukana, int ilosc_prob) {
        int srodek = (min+max)/2;
        if(srodek == szukana){
            return ilosc_prob;
        }
        if(szukana < srodek){
            System.out.println("Przedział ["+srodek+","+ min +"] Liczba jest za duża");
            return znajdz(min, srodek -1, szukana , ilosc_prob +1);
        }
        else{
            System.out.println("Przedział ["+srodek+","+max+"]Liczba jest za mała");
            return znajdz(srodek + 1, max, szukana ,ilosc_prob +1);
        }
    }

    public static void main(String[] args) {
        int min = 0;
        int max = 1000;
        int szukana = 2;
        System.out.println("Liczba " + szukana + " znaleziona w " + znajdz(min,max,szukana,1) + " podejściu");
    }
}
