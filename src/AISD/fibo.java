package AISD;

public class fibo {
    /*public static void main(String[] args) {
        int N = 2;
        for(int i = 1 ; i  < 11; i++){
            System.out.println("Liczba Królików po " + i + "dniach = "  + fibo(N+i));
        }

    }

    public static int fibo(int n){
        if(n == 1 || n == 2 ){
            return 1;
        }else
        {
            return fibo(n-1) + fibo(n-2);
        }*/



    /*public static void main(String[] args) {
        int N = 2;
        for (int i = 0; i <= 10; i++) {
            System.out.println("KROLICZKI " + krolik(N + i));
        }
    }

    public static int krolik(int N) {
        int tab[] = new int [N+1];
        tab[0] = 1;
        tab[1] = 1;
        for(int i = 2 ; i < tab.length; i++){
            tab[i] = tab[i-1] + tab[i-2];
        }

        return tab[tab.length -1];
    }*/

    public static void main(String[] args) {
        kroliki();
    }

    public static void kroliki(){
        int N = 2 ;
        for(int i = 1 ; i < 10 ; i++) {
            System.out.println("Liczba królików po " + i + " dniach wynosi: " + fibo(N+i));
        }
    }

    public static int fibo(int n){
        if(n == 1 || n == 2){
            return 1;
        }else{
            return fibo(n-1) + fibo(n-2);
        }
    }

}
