//Implementa una classe anomenada «QuadratMagic» que tingui un mètode
//«void imprimeix()» que mostri el quadrat
public class Exercici1 {
    public static void main(String[] args) {
        QuadratMagic q = new QuadratMagic(5);
        q.imprimeix();
    }

    public static class QuadratMagic {
        int dimensio = 5;

        QuadratMagic(int n) {
            dimensio = n;
        }

        void imprimeix() {
            int[][] ar = new int[dimensio][dimensio];
            //Omplir de 1
            for (int i = 0; i < dimensio; i++) {
                if (ar[0][i] == 0) {
                    ar[i][0] = 1;
                }
            }

            //Omplir amb sumes
            for (int i = 1; i < dimensio-1; i++) {
                for (int j = 1; j < dimensio-1; j++) {
                    int dalt = ar[i - 1][j];
                    int esq = ar[i][j - 1];
                    int suma = dalt + esq;
                    ar[i][j] = suma;
                }
            }
            int max = ar[dimensio - 1][dimensio - 1];
            String s = "%" + (("" + max).length() + 1) + "d ";

            //Imprimir
            for (int i = 0; i < dimensio; i++) {
                for (int j = 0; j < dimensio; j++) {
                    System.out.printf(s, ar[i][j]);
                }
                System.out.println();
            }
        }
    }
}
