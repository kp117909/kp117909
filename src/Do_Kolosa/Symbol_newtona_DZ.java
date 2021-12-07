package Do_Kolosa;

public class Symbol_newtona_DZ {

    public static void main(String[] args) {
        int N = 5;
        int K = 3;

        System.out.println(newton(N,K));
    }

    public static int newton(int N, int K){
        if(K == 0 || K == N){
            return 1;
        }else{
            return newton(N-1,K-1) + newton(N-1, K);
        }
    }

}
