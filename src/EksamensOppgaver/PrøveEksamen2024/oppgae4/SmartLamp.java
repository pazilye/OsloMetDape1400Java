package EksamensOppgaver.PrøveEksamen2024.oppgae4;

public class SmartLamp {

    public SmartLight installedBullb;
    public String wifiName;


    public SmartLamp(SmartLight installedBullb, String wifiName) {
        this.installedBullb = installedBullb;
        this.wifiName = wifiName;

    }

    public SmartLamp(String wifiName) {
        this(null,wifiName);
    }

    public SmartLight getInstalledBullb() {
        return installedBullb;
    }

    public void setInstalledBullb(SmartLight installedBullb) {
        this.installedBullb = installedBullb;
    }

    public String getWifiName() {
        return wifiName;
    }

    public void setWifiName(String wifiName) {
        this.wifiName = wifiName;
    }

    // method to set brightness of the installed smartlight

    public void setBulbBrightness (int brightness){
        if(installedBullb != null){
            installedBullb.setBrightnessPercentage(brightness);
            System.out.println("Brightness is set to " + brightness +" % ");
        }else{
            System.out.println("no smart light is installed in the smartlamp");
        }
    }





}
