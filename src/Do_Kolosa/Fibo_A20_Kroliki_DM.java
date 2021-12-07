package Do_Kolosa;

public class Fibo_A20_Kroliki_DM {

    public static void main(String[] args) {
        int N = 2;
        for(int i = 0; i< 10; i ++) {
            System.out.println(fibo(N+i));
        }
    }

    public static int fibo(int N){
        int []tab = new int[N+1];
        tab[0] = 1;
        tab[1] = 1;
        for(int i = 2; i<tab.length; i++){
            tab[i] = tab[i-1] + tab[i-2];
        }
        return tab[tab.length -1];
    }

}
