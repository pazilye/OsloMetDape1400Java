package ClassesAndObjects2.BankAccountTask;

public class Bank {

    public static void main(String[] args) {

        Konto konto = new Konto("Pazi",435675424,100.89);

        //konto.bankOverview();

        konto.insertMoney(300);
        konto.withdrawMoney(100);

    }

}

/*
  /*  Opprett et Konto-objekter, som ved opprettelsen blir tilført
        navn, kontonummer og saldo. */

    /*  Test ut ALLE metodene du har laget i Konto-klassen på
        Konto-objektene. Skriv resultatene av metodene ut på System.out.
        Bruk dialogvinduer til både innlesing og utskrift av kontoinformasjon */


