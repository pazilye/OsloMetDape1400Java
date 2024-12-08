package InputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class fortellingList {

    public static ArrayList<String> readInFortelling() {

        File file = new File("src/TextInputOutput/fortelling.txt");
        ArrayList<String> list = new ArrayList<>();

        try (Scanner input = new Scanner(file)) {

            input.useDelimiter(" ");


            while (input.hasNext()) {

                String s = input.next();
                list.add(s);

            }


        } catch (FileNotFoundException e) {
            System.out.println("File cant be read");

        }

        return list;

    }

}








/*
En klassiker på barnebursdager er adjektivfortellingLinks to an external site.. En fortelling har placeholders i seg der man plasserer inn tilfeldige adjektiver. Hvis man velger litt saftige adjektiver, så blir gjerne historien ganske så morsom. 😊 Tenk, når du er ferdig med denne oppgaven har du et nyttig verktøy for diverse anledninger!

Her er et forslag til program (men gjør gjerne dine egne justeringer):

Når programmet starter, leser du inn a: fortellingen og b: listen med adjektiv-forslag fra fil. Du kan selv lage disse filene (eller bruke de som ligger i denne modulen). Brukeren presenteres for følgende meny:

Lag adjektivhistorie automatisk
Lag adjektivhistorie med egne adjektiver
Avslutt
Ved menyvalg 1 skal de allerede eksisterende adjektivforslagene benyttes til å lage historien. Men hvilke adjektiver som benyttes, og rekkefølgen på dem, skal være vilkårlig. Ferdig historie skrives til fil.

Ved menyvalg 2 skal brukeren få anledning til å skrive inn egne adjektiver. Du må på forhånd vite hvor mange forskjellige adjektiver du trenger (og brukeren må vite hvor mange adjektiver som gjenstår etter hvert adjektiv). Når alle adjektivene er på plass, skal fortellingen skrives til fil. Adjektivene skal også her komme i tilfeldig rekkefølge.

Noen tips:

Adjektivene må plasseres i en tilfeldig rekkefølge (det er jo noe av poenget). Det er flere måter å løse det på. Et av dem er å benytte Random-klassen. Et annet er å benytte en statisk metode i CollectionsLinks to an external site..
Adjektivene må plasseres på spesifikke steder i historien. Du bør derfor ha placeholders for der adjektivene skal inn i historien.
Det kan være en fordel å benytte unike filnavn når historien lagres til fil. Da skiver du ikke over forrige fortelling du lagde.
Du vil nok også trenge noen metoder du finner i String-klassen (finne placeholders, erstatte deler av tekst osv.).

Mulige utvidelser (hvis du vil):

La brukeren velge noen adjektiver. Hvis brukeren ikke vil lage flere selv, benyttes adjektivforslag (lest fra fil) til de resterende.
Ekstra vanskelig! Lag forskjellige typer placeholders som samsvarer med forskjellige typer bøyningerLinks to an external site. av adjektivene. På den måten kan du sette inn en riktig bøyning av adjektivene i historien. Det betyr også at du må ha riktige bøyninger tilgjengelig for innsetting. Klarer noen å løse dette, mon tro?
 */
