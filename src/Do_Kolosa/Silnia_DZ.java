package Do_Kolosa;

public class Silnia_DZ {
    public static void main(String[] args) {
        int liczba = 3;
        System.out.println(silnia(liczba));
    }

    public static int silnia(int liczba){
        if(liczba <= 1){
            return 1;
        }else{
            return silnia(liczba -1) * liczba;
        }
    }
}
