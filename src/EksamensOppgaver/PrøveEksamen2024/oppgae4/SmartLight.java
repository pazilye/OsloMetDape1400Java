package EksamensOppgaver.PrøveEksamen2024.oppgae4;

public class SmartLight {

    public int brightnessPercentage;
    public boolean isOn;


    public SmartLight(int brightnessPercentage, boolean isOn) {
        setBrightnessPercentage(brightnessPercentage);
        this.isOn = isOn;
    }

    public int getBrightnessPercentage() {
        return brightnessPercentage;
    }

    public void setBrightnessPercentage(int brightnessPercentage) {

        if(brightnessPercentage <= 100 && brightnessPercentage >=0){
            this.brightnessPercentage = brightnessPercentage;
        }else {
            System.out.println("invalid percentange");
        }

    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}
