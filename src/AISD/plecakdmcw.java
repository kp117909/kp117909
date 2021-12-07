package AISD;

public class plecakdmcw {
    final static int N = 6;
    final static int MAX_V = 10;
    final static int[] V = {6,2,3,2,3,1};
    final static int[] W = {6,4,5,7,10,2};


    public static void main(String[] args) {
       int [][] tab = new int[N][MAX_V+1];

       for(int v = 0 ; v < MAX_V; v++) {
           if(v < V[0]) tab[0][v] = 0;
           else tab[0][v] = W[0];
        }

       for(int i = 1 ;  i < N; i ++ ){
           for(int v = 0 ; v <= MAX_V; v ++){
                if(v < V[i]) tab[i][v] = tab[i-1][v];
                else{
                    int p1 = tab[i-1][v];
                    int p2 = W[i] + tab[i-1][v - V[i]];
                    if(p2 > p1) tab[i][v] = p2;
                    else tab[i][v] = p1;
                }
           }
       }

       for(int i = 0 ; i < N ; i ++){
           for(int j = 0 ; j <=MAX_V; j ++){
               int var = tab[i][j];
               System.out.println(var + " ");
           }
       }

    }

}
