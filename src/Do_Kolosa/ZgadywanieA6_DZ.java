package Do_Kolosa;

public class ZgadywanieA6_DZ {

    public static void main(String[] args) {
        int min = 0;
        int max = 1000;
        int szukana = 210;
        System.out.println("Liczba " + szukana + " znaleziona za " + szukaj(min, max , szukana, 1) + " podejściem");
    }

    public static int szukaj(int min,int max,int  szukana,int podejscie){
        int srodek = (min+max)/2;
        if(srodek == szukana){
            return podejscie;
        }else if(szukana < srodek){
            System.out.println("Przedział [" + min + " , " + srodek + "] Liczba " + srodek + " jest za duża ");
            return szukaj(min, srodek -1, szukana, podejscie +1);
        }else{
            System.out.println("Przedział [" + srodek + " , " + max + "] Liczba " + srodek + " jest za mała ");
            return szukaj(srodek, max -1, szukana, podejscie +1);
        }

    }

}
