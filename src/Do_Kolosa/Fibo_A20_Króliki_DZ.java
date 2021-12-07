package Do_Kolosa;

public class Fibo_A20_Króliki_DZ {
    public static int fibo(int n){
            if(n == 1 || n ==2 || n ==3){
                return (n*n) - n;
            }else
            {
                return  n * (fibo(n-1) - fibo(n-2)) ;
            }
    }

    public static void main(String[] args) {
        FiboZad();
    }

    public static void FiboZad(){
        int N = 1;
        int wynik = 0 ;
        for(int i = 1; i <= 9 ; i++) {
            wynik =  fibo(N+i);
        }
        System.out.println("Wynik jest równy: " + wynik);
    }

}
