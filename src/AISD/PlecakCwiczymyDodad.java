package AISD;

public class PlecakCwiczymyDodad {
    final static int N = 6;
    final static int MAX_V = 10;
    final static int[] V = {6,2,3,2,3,1};
    final static int[] W = {6,4,5,7,10,2};

    static class Plecak{
        int wartosc;
        int[] zawartosc = new int[N];
    }

    public static void main(String[] args) {
        Plecak p = P(N-1, MAX_V);
        System.out.println("Wartosc plecaka = " + p.wartosc);
        System.out.println("Przedmiot w plecaku = ");
        for(int i = 0; i<N; i++){
            if(p.zawartosc[i] == 1 ) System.out.println(i + " ");
        }
    }

    static Plecak P(int n, int v){
        Plecak p1 = new Plecak();
        Plecak p2 = new Plecak();

        if(n == 0 && v < V[0]){
            p1.zawartosc[0] = 0;
            p1.wartosc = 0;
            return p1;
        }

        if (n == 0 && v >= V[0]){
            p1.zawartosc[0] = 1;
            p1.wartosc = W[0];
            return p1;
        }

        Plecak p = P(n-1, v);
        p1.zawartosc = p.zawartosc;
        p1.wartosc = p.wartosc;
        p1.zawartosc[n] = 0;

        if( n > 0 && v < V[n]){
            return p1;
        }

        p = P(n-1, v - V[n]);
        p2.zawartosc = p.zawartosc;
        p2.wartosc = W[n] + p.wartosc;
        p2.zawartosc[n] = 1;

        if(p2.wartosc > p1.wartosc){
            return p2;
        }else{
            return p1;
        }

    }

}
