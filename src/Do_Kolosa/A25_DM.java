package Do_Kolosa;

public class A25_DM {

    public static void main(String[] args) {
        int czas = 1;
        double liczba_lososi = 1000000;
        System.out.println("Lososie zaczną wymierać po czasie " + wymieranko(liczba_lososi, czas));
    }

    public static int wymieranko(double n , int t){
        double [] tab = new double[10000];
        tab[0] = n;
        for(int i = 1 ; tab[i-1] >= 100; i ++){
            t = i;
            tab[i] = 0.996 * tab[i-1] * Math.pow(Math.E, 0.003);
            System.out.println("Liczba łososi jest równa " + tab[i] + " po czasie " + t + " minut");
        }
        return t+1;
    }

}
