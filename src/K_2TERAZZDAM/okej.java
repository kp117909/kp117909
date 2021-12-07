package K_2TERAZZDAM;
import java.lang.*;

    class NajkrótszaDroga
    {
        final static int BRAK = 99999, V = 9;


        void trasa(int tabela[][])
        {
            int dystans[][] = new int[V][V];
            int i, j, n;

            for (i = 0; i < V; i++)
                for (j = 0; j < V; j++)
                    dystans[i][j] = tabela[i][j];

            for (n = 0; n < V; n++)
            {

                for (i = 0; i < V; i++)
                {

                    for (j = 0; j < V; j++)
                    {

                        if (dystans[i][n] + dystans[n][j] < dystans[i][j])
                            dystans[i][j] = dystans[i][n] + dystans[n][j];
                    }
                }
            }

            wyniki(dystans);
        }

        void wyniki(int dystans[][])
        {
            System.out.println("Najkrótsze trasy pomiędzy miastami");


            for (int i=0; i<V; ++i)
            {
                for (int j=0; j<V; ++j)
                {
                    if (dystans[i][j]==BRAK)
                        System.out.print("BRAK   ");
                    else
                        System.out.print(dystans[i][j]+"    ");
                }

                System.out.println();
            }

        }

        public static void main (String[] args) {

            int tabela[][] = {
                    {0, 300, 402, 356, BRAK, BRAK, BRAK, BRAK, BRAK},
                    {300, 0, BRAK, BRAK, 440, 474, BRAK, BRAK, BRAK},
                    {402, BRAK, 0, BRAK, BRAK, 330, BRAK, BRAK, BRAK},
                    {356, BRAK, BRAK, 0, BRAK, BRAK, 823, BRAK, BRAK},
                    {BRAK, 440, BRAK, BRAK, 0, BRAK, BRAK, 430, BRAK},
                    {BRAK, 474, 330, BRAK, BRAK, 0, 813, 365, 774},
                    {BRAK, BRAK, BRAK, 823, BRAK, 813, 0, BRAK, 403},
                    {BRAK, BRAK, BRAK, BRAK, 430, 365, BRAK, 0, 768},
                    {BRAK, BRAK, BRAK, BRAK, BRAK, 774, 403, 768, 0}};

            NajkrótszaDroga a = new NajkrótszaDroga();



            a.trasa(tabela);
        }
    }
