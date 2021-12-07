package Do_Kolosa;

public class Reszta_AZ2 {

    public static void main(String[] args) {
        final int [] M = {500, 200, 100, 50, 20 ,10 ,5, 2 ,1};
        int zl, gr, r, i = 0;
        int [] zliczaj = new int[M.length];
        zl = 15;
        gr = 58;
        r = zl * 100 + gr;
        while(r > 0){
            if(r >= M[i]) {
                System.out.println("Nominał = " + M[i] / 100.0);
                zliczaj[i]++;
                r = r - M[i];
            }else{
                i++;
            }
        }
        System.out.println("Nominał\tLiczba Monet");
        for(int j =0 ; j< M.length; j++){
            System.out.println(M[j]/100.0 + " \t " + zliczaj[j]);
        }
    }
}
