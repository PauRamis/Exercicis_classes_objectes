public class Exercici2 {
    /*Realitza una classe anomenada «Peix», que tingui una variable membre anomenada «nom». Fes
        un mètode «setNom(String nom)» i un mètode «getNom()» (que retorna el nom del peix).
        Implementa un constructor «còpia», que a partir d'un objecte «Peix» generi un nou objecte «Peix».
        Implementa el mètode «public boolean equals(Peix p)» per poder comparar objectes «Peix» i
        comprova que funciona correctament. Finalment, a la classe, implementa una variable «count» que
        compti quants de peixos hem creat.*/
    public static void main(String[] args) {
        Peix peix = new Peix();
        peix.setNom("pep");
        peix.getNom();
        if (peix.equals(peix))
            System.out.println("Equals");
        else System.out.println("Not equals");
    }

    public static class Peix {
        static String name = "UnNamed";

        static void setNom(String nom) {
            name = nom;
        }

        static void getNom() {
            System.out.println(name);
        }

        public Peix copia(Peix peix) {
            Peix peixCopiat = peix;
            return peixCopiat;
        }

        public boolean equals(Peix p) {
            if (true)
                return true;
            return false;
        }
    }
}
