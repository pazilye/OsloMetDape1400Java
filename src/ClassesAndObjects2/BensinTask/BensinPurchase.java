package ClassesAndObjects2.BensinTask;

public class BensinPurchase {

    private String bensinStation,bensinType, timeFilled;
    private double  filledLiter, pricePerLiter;

    public BensinPurchase(String bensinStation, String bensinType, String timeFilled, double filledLiter, double pricePerLiter) {
        this.bensinStation = bensinStation;
        this.bensinType = bensinType;
        this.timeFilled = timeFilled;
        this.filledLiter = filledLiter;
        this.pricePerLiter = pricePerLiter;
    }

    public String getBensinStation() {
        return bensinStation;
    }

    public void setBensinStation(String bensinStation) {
        this.bensinStation = bensinStation;
    }

    public String getBensinType() {
        return bensinType;
    }

    public void setBensinType(String bensinType) {
        this.bensinType = bensinType;
    }

    public String getTimeFilled() {
        return timeFilled;
    }

    public void setTimeFilled(String timeFilled) {
        this.timeFilled = timeFilled;
    }

    public double getFilledLiter() {
        return filledLiter;
    }

    public void setFilledLiter(double filledLiter) {
        this.filledLiter = filledLiter;
    }

    public double getPricePerLiter() {
        return pricePerLiter;
    }

    public void setPricePerLiter(double pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }

    public double totalPrice (){
        return filledLiter * pricePerLiter;

    }
}

/*
Lag en klasse kalt BensinKjøp for å representere informasjon om kjøp av bensin. Klassen skal ha 5 private attributter:

Bensinstasjonens sted (en streng)
Type bensin (en streng)
Antall liter fylt (et desimaltall)
Prisen pr. liter (et desimaltall)
Tidspunkt fylt (en streng)
Klassen skal ha en konstruktør som initialiserer alle attributtene. Lag også get/set metoder for disse. Lag så en metode finnTotalPrisen. Denne skal ikke ha noen parametere inn, men skal returnere prisen som et desimaltall. Metoden skal da multiplisere antall liter fylt med prisen pr. liter.

Lag så kode i main for å teste ut denne klassen. Bruk String.format("%.2f", prisen); for å få to desimaler.
 */
