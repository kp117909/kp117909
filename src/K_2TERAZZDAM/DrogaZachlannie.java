package K_2TERAZZDAM;

    class Droga {
        public static void main(String[] args) {
            int tab[][] = new int[][]{
                    {0, 300, 402, 356, 0, 0, 0, 0, 0},
                    {300, 0, 0, 0, 440, 474, 0, 0, 0},
                    {402, 0, 0, 0, 0, 330, 0, 0, 0},
                    {356, 0, 0, 0, 0, 0, 823, 0, 0},
                    {0, 440, 0, 0, 0, 0, 0, 430, 0},
                    {0, 474, 330, 0, 0, 0, 813, 365, 774},
                    {0, 0, 0, 823, 0, 813, 0, 0, 403},
                    {0, 0, 0, 0, 430, 365, 0, 0, 768},
                    {0, 0, 0, 0, 0, 774, 403, 768, 0}};
            Rozw droga = new Rozw();
            droga.zachlanasolution(tab, 0);
        }
    }

    class Rozw {

        static final int liczba_drog = 9;

        void zachlanasolution(int tab[][], int ilosc)  {
            int sciezka[] = new int[liczba_drog];
            Boolean sprawdzone[] = new Boolean[liczba_drog];
            for (int i = 0; i < liczba_drog; i++) {
                sciezka[i] = Integer.MAX_VALUE;
                sprawdzone[i] = false;
            }
            sciezka[ilosc] = 0;
            for (int i = 0; i < liczba_drog - 1; i++) {
                int dys = minDystans(sciezka, sprawdzone);
                sprawdzone[dys] = true;
                for (int j = 0; j < liczba_drog; j++)
                    if (!sprawdzone[j] && tab[dys][j] != 0 && sciezka[dys] != Integer.MAX_VALUE && sciezka[dys] + tab[dys][j] < sciezka[j]) {
                        sciezka[j] = sciezka[dys] + tab[dys][j];
                    }
            }
            showSoluton(sciezka);
        }

        int minDystans(int sciezka[], Boolean sptSet[])   {
            int min = Integer.MAX_VALUE;
            int min_index = -1;
            for (int i = 0; i < liczba_drog; i++)
                if (sptSet[i] == false && sciezka[i] <= min) {
                    min = sciezka[i];
                    min_index = i;
                }

            return min_index;
        }


        void showSoluton(int sciezka[])   {
            System.out.println("Droga | \t Minimalny Dystans do Przebycia: ");
            for (int i = 0; i < liczba_drog; i++)
                System.out.println(i + " \t\t\t\t " + sciezka[i]);
        }


    }

