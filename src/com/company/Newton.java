package com.company;

public class Newton {
    /*public static void main(String[] args) {
        int N = 5;
        int K = 3;
        int [][] tab = new int[K + 1][N + 1];

        for(int n = 0; n <=N; n++){
            tab[0][n] = 1;
            for(n = 0; n<=N; n++)
            {
                for(int k= 0; k<=K;k ++){
                    if(n==k){
                        tab[k][n] = 1;
                    }
                    for(n = 2; n <= N; n++)
                    {
                        for(k = 1 ; k<= K; k++){
                            if(n<=k) continue;
                            tab[k][n] = tab[k-1][n-1] + tab[k][n-1];
                            System.out.println(tab[k][n]);
                        }
                    }
                }
            }
        }
    }*/
    public static void main(String[] args) {
        final int N = 5; // n-ty wyraz ciagu
        //System.out.println(fibo(N));
        System.out.println(fibo(N));
    }

    static int fibo(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibo(n - 1);
        }
    }

}
