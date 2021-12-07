package K_2TERAZZDAM;

public class PlecakAZ {
    final static int N = 6;
    final static int MAX_V = 10;

    final static int[] V = {1,2,3,2,3,1};  // objetosci przedmiotow
    final static int[] W = {6,4,5,7,10,2};

    public static void main(String[] args) {
        plecakmale();
    }

    public static void plecakmale(){
        boolean []rozw = new boolean[N];
        for(int i =0 ; i <N ; i++)
            rozw[i] = false;

        int sumaV = 0;
        int sumaW = 0;

        while(true){
            int minV = Integer.MAX_VALUE;
            int maxPoz = -1;

            for(int i = 0 ; i < N ; i++){
                if(!rozw[i]){
                    if((sumaV + V[i] < MAX_V) && (V[i] < minV)){
                        minV = V[i];
                        maxPoz = i;
                    }
                }
            }

            if(maxPoz >-1){
                rozw[maxPoz] = true;
                sumaW = sumaW + W[maxPoz];
                sumaV = sumaV + V[maxPoz];
            }else break;


        }

        System.out.println("Wartość optymalna plecaka metodą pakuj MALE: " + sumaW);
        System.out.println("Przedmioty w plecaku: ");

        for(int i =0 ; i < N ; i++){
            if(rozw[i])
                System.out.println(i + " ");
        }

    }

    public static void pakujCenne(){
        boolean [] rozw = new boolean[N];
        for(int i = 0 ; i < N ; i++)
            rozw[i] = false;

        int sumaW = 0;
        int sumaV = 0;

        while(true){
            int maxW = 0;
            int maxPoz = -1;
            for(int i = 0 ; i < N; i ++){
                if(!rozw[i]){
                    if((sumaV + V[i] <= MAX_V)&&(W[i] > maxW)){
                        maxW = W[i];
                        maxPoz = i;
                    }
                }
            }
            if(maxPoz > -1){
                rozw[maxPoz] = true;
                sumaW = sumaW + W[maxPoz];
                sumaV = sumaV + V[maxPoz];
            }else break;
        }
        System.out.println("Przedmioty w plecaku maja wartosć: " + sumaW);
        System.out.println("Są to przedmioty o numerach: ");

        for(int i = 0 ; i< N ; i++){
            if(rozw[i])
                System.out.println(i + " ");
        }

    }


    public static void plecakIloraz(){
        boolean [] rozw = new boolean[N];
        for(int i = 0 ; i < N ; i++)
            rozw[i] = false;
        int sumaW = 0;
        int sumaV = 0;

        while(true){
            double maxFrac = 0;
            int maxPoz = -1;
            for(int i = 0 ; i <N ; i++){
                if(!rozw[i]){
                    double frac =  W[i]/V[i];
                    if((sumaV + V[i] < MAX_V) && (frac > maxFrac)){
                        maxPoz = i;
                        maxFrac = frac;
                    }
                }
            }

            if(maxPoz > -1){
                rozw[maxPoz] = true;
                sumaW = sumaW + W[maxPoz];
                sumaV = sumaV + V[maxPoz];
            }else break;
        }

        System.out.println("Wartośći w plecaku = " + sumaW);
        System.out.println("Są to przedmioty o numerach: ");
        for(int i =0 ; i <N; i++){
            if(rozw[i])
                System.out.println(i + " ");
        }
    }

}
