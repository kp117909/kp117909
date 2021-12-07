package Do_Kolosa;

public class A23_DZ {

    static boolean calosc = false;

    public static void main(String[] args) {
        int N_MAX = 100000;
        int N = 10;
        int[] temp = new int[100];
        System.out.println("Po " + katar(N, N_MAX, 0, temp) + " dniach , epidemia kataru zniknie.");
    }

    public static int katar(int liczba_chorych, int liczba_osob, int dzien, int[] temp) {
        dzien++;
        temp[dzien] = liczba_chorych;
        if (liczba_chorych <= 0) {
            return dzien;
        } else {
            int liczba_zdrowych = liczba_osob - liczba_chorych;
            if (liczba_zdrowych < 0)  liczba_zdrowych = 0;
            if (dzien <= 6) {
                System.out.println("Liczba zarażonych:  " + liczba_chorych + " , liczba zdrowych " + liczba_zdrowych + " dzień :" + dzien);
                return katar(liczba_chorych + (liczba_chorych * 2), liczba_osob - liczba_chorych, dzien, temp);
            } else {
                System.out.println("Liczba zarażonych:  " + liczba_chorych + " , liczba zdrowych " + (100000 - liczba_chorych) + " dzień :" + dzien);
                if (calosc) {
                    if (liczba_zdrowych >= 100000) {
                        return dzien;
                    } else {
                        return katar(liczba_chorych - temp[dzien - 5], liczba_osob - liczba_chorych, dzien, temp);
                    }
                } else {
                    if (liczba_chorych >= liczba_osob) {
                        calosc = true;
                        return katar(100000 - temp[dzien - 5], 100000 - liczba_chorych, dzien, temp);
                    } else {
                        if (liczba_chorych + (liczba_chorych * 2) - temp[dzien - 5] >= 100000) {
                            return katar(100000 - temp[dzien - 5], 100000 - liczba_chorych, dzien, temp);
                        } else {
                            return katar((liczba_chorych + (liczba_chorych * 2)) - temp[dzien - 5], liczba_osob - liczba_chorych, dzien, temp);
                        }
                    }
                }
            }
        }
    }
}