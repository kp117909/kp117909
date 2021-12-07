package Do_Kolosa;

public class Reszta_AZ1 {

    public static void main(String[] args) {
        final int[]  M = {500, 200, 100, 50, 20 ,10 ,5 ,2 ,1};
        int zl, gr, r, i = 0;
        zl = 15;
        gr = 28;
        r = zl * 100 + gr;
        while(r > 0 ){
            if(r >= M[i]){
                System.out.println(M[i]/100.0 + " ");
                r = r - M[i];
            }else{
                i++;
            }
        }
    }
}
