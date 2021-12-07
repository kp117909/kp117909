package Do_Kolosa;

public class PlecakA1_DZDec {

    final static int N =6;
    final static int MAX_W = 10;
    final static int[] V = {6,2,3,2,3,1};
    final static int[] W = {6,4,5,7,10,2};

    static class Plecak{
        int wartosc;
        int[] zawartosc = new int[N];
    }

    public static void main(String[] args) {
        Plecak p = P(N-1, MAX_W);
        System.out.println("Wartośc plecaka: " + p.wartosc);
        System.out.println("Przedmioty w plecaku: ");
        for(int i = 0; i< N; i++){
            if(p.zawartosc[i] == 1) System.out.println(i + " ");
        }
    }

    static Plecak P(int i , int v){
        Plecak p1 = new Plecak();
        Plecak p2 = new Plecak();

        if(i == 0 && v < V[0]){
            p1.zawartosc[0]= 0;
            p1.wartosc = 0;
            return p1;
        }

        if( i== 0 && v >= V[0]){
            p1.zawartosc[0] = 1;
            p1.wartosc = W[0];
            return p2;
        }

        Plecak p = P(i-1,v);

        p1.zawartosc = p.zawartosc;
        p1.zawartosc[i] = 0;
        p1.wartosc = p.wartosc;
        if(i > 0 && v < V[i]){
            return p1;
        }

        p = P(i-1,v - V[i]);
        p2.zawartosc = p.zawartosc;
        p2.zawartosc[i] = 1;
        p2.wartosc = W[i] +  p.wartosc;
        if(p2.wartosc > p1.wartosc){
            return p2;
        }else{
            return p1;
        }

    }

}
