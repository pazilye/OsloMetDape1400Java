package ClassesAndObjects3;

public class Oppgave {

    static class Dato {
        private int dag, måned, år;

        public Dato( int dag, int måned, int år ) {
            this.dag = dag;
            this.måned = måned;
            this.år =år;
        }

        private static String månedsnavn( int mnd ) {
            String[] navn = { "januar", "februar", "mars", "april", "mai",
                    "juni", "juli", "august", "september", "oktober", "november",
                    "desember" };
            if ( mnd > 0 && mnd < 13 )
                return navn[ mnd - 1 ];
            else
                return "ukjent måned";
        }

        @Override
        public String toString() {
            return "Dato{" +
                    "dag=" + dag +
                    ", måned=" + måned +
                    ", år=" + år +
                    '}';
        }
    }

    static class Bil{
        // opprett følgende attributter
        // typebetegnelse f.eks Audi A6
        // førstegangsregistrert av type Dato
        // kjennetegn dvs. skiltnummer

        public String typebetegnelse ,kjennetegn;
        public Dato registreringsDato;
        int skiltnummber;

        // lag også konstruktør for alle attributtene

        public Bil(String typebetegnelse, Dato registreringsDato, String kjennetegn) {
            this.typebetegnelse = typebetegnelse;
            this.registreringsDato = registreringsDato;
            this.kjennetegn = kjennetegn;
        }


        // lag så en toString metode for å vise alle attributtene


        @Override
        public String toString() {
            return "Bil{" +
                    "typebetegnelse='" + typebetegnelse + '\'' +
                    ", kjennetegn='" + kjennetegn + '\'' +
                    ", registreringsDato=" + registreringsDato +
                    ", skiltnummber=" + skiltnummber +
                    '}';
        }
    }

}
