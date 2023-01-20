public class Exercici2 {
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
