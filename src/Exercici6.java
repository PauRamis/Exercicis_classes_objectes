public class Exercici6 {
    public static void main(String[] args) {


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
            baralla[0].print();
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
            System.out.printf(" |              |");
            System.out.printf(" |              |");
            System.out.printf(" |              |");
            System.out.printf(" |         %2d  | \n", this.num.ordinal() + 1 );
            System.out.printf(" ---------------- ");
        }
    }
}
