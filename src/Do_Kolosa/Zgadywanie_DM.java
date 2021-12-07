package Do_Kolosa;

public class Zgadywanie_DM {

    public static void main(String[] args) {
        int min = 0;
        int max = 1000;
        int szukana = 210;
        System.out.println("Liczba szukana to " + szukana + " znaleziona za " + znajdz(min, max, szukana, 1) + " razem ");
    }

    public static int znajdz(int min, int max, int szukana, int podejscie){
        int tabmin[] = new int[1000];
        int tabmax[] = new int[1000];
        int tabsrodek[] = new int[1000];
        tabmin[0] = min;
        tabmax[0] = max;
        tabsrodek[0] = (min+max);
        tabsrodek[1] = (min+max);
        for(int i = 1 ; i <= 20; i++){
            System.out.println(tabsrodek[i]);
            if(szukana < tabsrodek[i]){
                tabsrodek[i] = tabsrodek[i-1]/2;
            }else{
                tabsrodek[i] = tabsrodek[i-1] + tabsrodek[i-2];
            }
            podejscie++;
            if(szukana < tabsrodek[i]){
                tabmin[i] = tabmin[i-1];
                tabmax[i] = tabsrodek[i] - 1;
                tabsrodek[i+1] = tabmax[i] ;
                System.out.println("PRZEDZIAL = [ " +tabmin[i] + ", " + tabmax[i]+ " ] 1");
            }else if(szukana > tabsrodek[i]) {
                tabmin[i] = tabsrodek[i-1];
                tabmax[i] = tabmax[i-1];
                tabsrodek[i+1] = tabmin[i]-1 ;
                System.out.println("PRZEDZIAL = [ " +tabsrodek[i] + ", " + tabmax[i]+ " ] 2 ");
            }else{
                System.out.println("PRZEDZIAL = [ " +tabsrodek[i] + ", " + tabmax[i]+ " ] 3 ");
                break;
            }
        }
        return podejscie;
    }

}
