package ClassesAndObjects2.WatchTask;

public class Watch {

    private int time, minutes, seconds;

    public Watch(int time, int seconds, int minutes) {
       setTime(time);
       setMinutes(minutes);
       setSeconds(seconds);
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        if(time >=0 && time <=24){
            this.time = getTime();
            System.out.println("invalid time");
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if(seconds >=0 && seconds <=59){
            this.seconds = seconds;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if(minutes >=0 && minutes <=59){
            this.minutes = minutes;
        }
    }

    public void showTime(){
        String currentTime= "The time is : " + getTime() + ":" +getMinutes() +":" +getSeconds() + ".";
        System.out.println(currentTime);
    }
}

/*
Lag en klasse kalt Klokke. Klassen skal ha tre private heltalls- attributter, time, minutter, sekunder.

Klassen skal ha en konstruktør som initialiserer alle attributtene. Lag også get/set metoder for disse. Set metodene skal sjekke om inndataene er korrekte (0-24 timer, 0-59 på de to andre).

Lag så en metode "visTiden" som skriver ut tiden enten på System.out eller som meldingsboks på følgende format tt : mm : ss.

Skriv så kode i main for å teste ut denne klassen.
 */
