package ClassesAndObjects2.BankAccountTask;

public class Konto {

    private String bankOwnersName;
    private long bankNumber;
    private double saldo;
    public Konto(String bankOwnersName, long bankNumber, double saldo) {
        this.bankOwnersName = bankOwnersName;
        this.bankNumber = bankNumber;
        this.saldo=saldo;

    }

    public void bankOverview(){
        System.out.println(bankOwnersName +"\n" +bankNumber +"\n" +saldo);
    }

    public double insertMoney(double insertedMoney){
        saldo+=insertedMoney;
        System.out.println(insertedMoney + " kroner has been inserted");
        return saldo;
    }

    public double withdrawMoney(double withdrawenMoney){

        if (withdrawenMoney <=saldo){
            saldo -= withdrawenMoney;
            System.out.println("Here is your new bank balance " +saldo);
        }else {
            System.out.println("Sorry, you don't have enough money");
        }

        return withdrawenMoney;


    }




}



/*

        //  Attributtene for kontoinnehavers navn, kontornummer og saldo.

        //  Kontruktør som skal gi startverdier til ALLE attributtene

    /*  Kontoutskrifts-metode, som skriver ut kontoinnehaverens
       navn, kontonummer og saldo i et dialogvindu. */

    /*  Metode som setter inn et beløp på kontoen.
        Beløpets størrelse skal tas imot via en parameter til metoden.
        Metoden skal returnere en tekst som inneholder informasjon om
        den nye saldoen.  */

    /*  Metode som tar ut et beløp fra kontoen, under forutsetning av
        at det er dekning for beløpet.
        Uttaks-beløpets størrelse skal tas imot via en parameter til metoden.
        Hvis det er dekning på kontoen, skal metoden returnere en tekst
        med informasjon om den nye saldoen. Hvis  det ikke er dekning,
        skal den returnerte teksten inneholde informasjon om det. */

// end of class Konto
