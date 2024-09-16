package ClassesAndObjects2.WindTask;

public class Wind {

    private double vindHastighet = 0.0;

    public Wind (double vindHastighet) {
        this.vindHastighet = vindHastighet;
    }

    public double getVindhastighet() {
        return vindHastighet;

    }

   public boolean erOrkan() {
        if(vindHastighet >= 120 ){
            System.out.println("Det er orkan");
        }else {
            System.out.println("Det er ikke orkan");
        }

        return false;
    }

    public boolean erVindstille() {
        if(vindHastighet <= 2 ){
            System.out.println("Det er vindstille");
        }else {
            System.out.println("Det er ikke vindstille");
        }

        return false;
    }

    public double getKnop() {
        double knop = vindHastighet / 1.852;
        return knop;

    }

   public int getBeaufort() {
        int beaufort = (int) (Math.pow(vindHastighet/3.01,0.6666) +0.5);
        if(beaufort >12 ){
            beaufort  = 12;
        }

        return beaufort;
         }


    }

/*
Det skal lages en klasse kalt Vind. Denne klassen skal beregne ut i fra en oppgitt vindhastighet i km/t om det er stille (mindre enn 2 km/t) og om det er orkan (mer enn 120 km/t).

Videre skal klassen kunne beregne hvor mye vindhastigheten tilsvarer på Beaufort-skala (1-12).  Formelen for Beaufort er : (((vindhastighet i km/t) / 3.01)^0.6666)+0.5. ^ betyr opphøyd i. Bruk gjerne Math.pow funksjonen for å foreta beregningen.

Til slutt skal det være mulig å regne ut antall knop i en metode. En knop er lik 1852 meter.
 */
