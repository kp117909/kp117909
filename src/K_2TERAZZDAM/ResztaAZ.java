package K_2TERAZZDAM;

public class ResztaAZ {

    public static void main(String[] args) {
        final int[] M = {500,200,100,50,20,10,5,2,1};
        final int[] L = {1,  2,  0,  7, 2, 2, 5,2,10}; // max 13.49;
        int zl ,gr, r, i = 0;
        int[] zliczaj = new int[M.length];

        zl = 22;
        gr = 74;
        r = 100 * zl + gr;
        while(r > 0 && i < M.length){
            if(r >= M[i] && L[i] > 0){
                System.out.println("Nominał : " + M[i]/100.0 + " ");
                zliczaj[i]++;
                r  = r - M[i];
                L[i]--;
            }else{
                i++;
            }
        }
        System.out.println("Nominał \t Ilość");
        for(int j = 0; j < M.length ; j++){
            if(zliczaj[j] > 0)
                System.out.println(M[j]/ 100.0 + " \t\t " + zliczaj[j]);
        }

        if(r>0)
            System.out.println("NIE MOŻNA WYDAC RESZTY POZOSTAO : " + r/100.0 +" zł");

    }
}
