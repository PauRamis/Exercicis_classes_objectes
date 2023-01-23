public class Exercici2 {
    /*Realitza una classe anomenada «Peix», que tingui una variable membre anomenada «nom». Fes
        un mètode «setNom(String nom)» i un mètode «getNom()» (que retorna el nom del peix).
        Implementa un constructor «còpia», que a partir d'un objecte «Peix» generi un nou objecte «Peix».
        Implementa el mètode «public boolean equals(Peix p)» per poder comparar objectes «Peix» i
        comprova que funciona correctament. Finalment, a la classe, implementa una variable «count» que
        compti quants de peixos hem creat.*/
    public static void main(String[] args) {
        Peix p1 = new Peix();
        p1.setNom("pep");

        Peix p2 = new Peix();
        p2.setNom(p1.nom);
        System.out.println(p2.getNom());

        System.out.println(Peix.quantsPeixos);
        System.out.println(p1.equals(p2));
    }

    public static class Peix {
        static int quantsPeixos = 0;
        private String nom = "UnNamed";

        Peix(){
            quantsPeixos++;
        }

        Peix(Peix p) {
            this.nom = p.nom;
        }

        public String getNom() {
            return nom;
        }

        void setNom(String nom) {
            this.nom = nom;
        }

        public boolean equals(Peix p) {
            return this.nom.equals(p.nom);
        }
    }
}
