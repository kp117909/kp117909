package Do_Kolosa;

public class Fibo_A20_Króliki_DZ {
    public static int fibo(int n){
            if(n == 1 || n ==2 ){
                return 1;
            }else
            {
                return fibo(n-1) + fibo(n-2) ;
            }
    }

    public static void main(String[] args) {
        int N = 2;
        for(int i = 0; i <= 10 ; i++) {
            System.out.println(fibo(N+i));
        }
    }


}
