package AISD;

public class PlecakBrutalForce {

    /*
    P(2,4) = max(P(1,4) , 5 + P(1,1) ) = 5
    P(2,5) = max(P(1,5) , 5 + P(1,2) ) = 9
    P(2,6) = max(P(1,6) , 5+ P(1,3)) = 9
    P(2,7) = 9
    P(2,8) = 10
    P(2,9) = 10,
    P(3,0) = P(2,0) = 0
    P(3,1) = P(2,1)
    P(3,2) = max(P(2,2) , 7 + P(2,0)) = max(4,5) = 5
    P(3,3) = max(P(2,3) , 7+ P(2,1)) = max(5,5) =5
    P(3,4) = max(P(2,4) , 7 + P(2,2)) = max(5,9) = 9
    P(3,5) = max(P(2,5) , 7 + P(2,3)) = max(9,12) 12
    --> 7 + P(2,4) =

    P(4,3) = max (P(3,3) , 10 + P(3,0)) = max(7,10) =  10
    P(4,4) = max(P(3,4) , 10 + P(3,1)) = max(11,10) = 11
    P(4,5) = max(P(3,5) , 10 + P(3,2)) = max(12,17) = 17
    P(4,6) = max(P(3,6) , 10 + P(3,3)) = max(12,17) = 17
    P(4,7) = max(P(3,7) , 10 + P(3,4)) = max(16,21) = 21
    P(4,8) = max(P(3,8), 10 + P(3,5)) = max(16,21) == P(4,9)
    P(4,10) = max(P(3,9), 10 + P(3,7)) = max(16,
     */

    final static int N  = 6;
    final static int MAX_V = 10;
    final static int[] V = {6,2,3,2,3,1};
    final static int[] W = {6,4,5,7,10,2};
    public static void main(String[] args) {
        int max_W = 0;
        int v,w;
        int p1,p2,p3,p4,p5,p6;
        int[] tab = new int[N];
        for(p1 = 0; p1 <= 1 ; p1++){
            for(p2 = 0; p2 <= 1 ; p2++){
                for(p3 = 0; p3 <= 1 ; p3++){
                    for(p4 = 0; p4 <= 1 ; p4++){
                        for(p5 = 0; p5 <= 1 ; p5++){
                            for(p6 = 0; p6 <= 1 ; p6++){
                                v = p1* V[0] + p2 * V[1] + p3 * V[2] + p4 * V[3] + p5 *V[4] + p6*V[5];
                                if(v <= MAX_V){
                                    w = p1 * W[0] + p2 * W[1] + p3 *W[2] + p4* W[3] + p5 * W[4] + p6 * W[5];
                                    if (w > max_W){
                                        max_W = w;
                                        tab[0] = p1;
                                        tab[1] = p2;
                                        tab[2] = p3;
                                        tab[3] = p4;
                                        tab[4] = p5;
                                        tab[5] = p6;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Najlepsza możliwa wartość przedmiotów : " + max_W);
        System.out.println("W plecaku są przedmioty o numerach: ");
        for(int i =0 ; i< N; i++)
        {
            if(tab[i]==1){
                System.out.println(i + " ");
            }
        }
    }
}
