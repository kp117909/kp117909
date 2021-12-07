package Do_Kolosa;

public class Silnia_DM {
    public static void main(String[] args) {
        int liczba = 3;

        System.out.println("Silnia = " + silnia(liczba));
    }
    public static int silnia(int liczba){
        int iloczyn = 1;
        for(int i = 1 ; i <= liczba; i++)
        {
            iloczyn = iloczyn * i;
        }

        return iloczyn;
    }
}
