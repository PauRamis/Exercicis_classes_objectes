public class Exercici4 {
    public static void main(String[] args) {
        Nombre deu = new Nombre("XIX");
        System.out.println(deu.valor);
    }
    public static class Nombre {
        int valor;

        Nombre(int n) {
            int resultat = n;
            this.valor = resultat;
        }

        Nombre(String s) {
            /*
            I = 1
            V = 5
            X = 10
            L = 50
            C = 100
            D = 500
            M = 1000
            */

            int resultat = 0;
            int last = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (last == 0 || valorLletra(c) <= last)
                    resultat += valorLletra(c);
                else
                    resultat = resultat - 2*last + valorLletra(c);
                last = valorLletra(c);
            }
            this.valor = resultat;
        }

        private int valorLletra(char c) {
            switch (c) {
                case 'I': return 1;
                case 'V': return 5;
                case 'X': return 10;
                case 'L': return 50;
                case 'C': return 100;
                case 'D': return 500;
                case 'M': return 1000;
            }
            return 0;
        }
    }
}
