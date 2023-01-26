public class Exercici6 {
    public static void main(String[] args) {
        /*
        6- Escriu una classe anomenada «Carta» per representar una carta (naip). Cada carta té dues
            característiques principals: coll (oros, copes, espases, bastos) i número (de 1 a 12).

        7- Escriu una classe anomenada «Baralla» que conté un joc complet de cartes (espanyoles).

        8- Fes un petit programa per testejar les classes anteriors. Simplement, creeu un objecte de tipus
            «Baralla» i mostreu les cartes que conté.*/

    Carta[] baralla = new Carta[48];
    Carta.Coll[] colls = Carta.Coll.values();
    Carta.Num[] nums = Carta.Num.values();
        for (int i = 0; i < colls.length; i++) {
            Carta.Coll coll = colls[i];
            for (int j = 0; j < nums.length; j++) {
                Carta c = new Carta();
                c.coll = coll;
                c.num = nums[j];
                baralla[i*12 + i] = c;
            }
            baralla[i].print();
        }
    }
    public static class Carta {

        enum Coll {
          OROS, BASTOS, COPES, ESPASES
        };

        enum Num {
            AS, DOS, TRES, QUATRE, CINC, SIS, SET, VUIT, NOU, DEU, ONCE, DOTZE
        }

        Num num;
        Coll coll;

        void print() {
            System.out.printf(" ---------------- ");
            System.out.printf(" |  %2d         | \n", this.num.ordinal() + 1 );
            System.out.printf(" |              |");
            System.out.printf(" |              |");
            System.out.printf(" |      %2d     | \n", getSymbol(this.coll));
            System.out.printf(" |              |");
            System.out.printf(" |              |");
            System.out.printf(" |         %2d  | \n", this.num.ordinal() + 1 );
            System.out.printf(" ---------------- ");
        }

        private Object getSymbol(Coll coll) {
            switch (coll) {
                case OROS: return "OROS";
                case COPES: return "COPES";
                case BASTOS: return "BASTOS";
                case ESPASES: return "ESPASES";
            }
            throw new RuntimeException("Coll no valid");
        }
    }
}
