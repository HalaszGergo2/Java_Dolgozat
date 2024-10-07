package modell;

public class Auto {
    private String rendszam, szin;
    private boolean extra1, extra2;

    public Auto(String rendszam, String szin){
        this(rendszam, szin, false, false);
    }
    
    public Auto(String rendszam, String szin, boolean extra1, boolean extra2) {
        this.rendszam = rendszam;
        this.szin = szin;
        this.extra1 = extra1;
        this.extra2 = extra2;
    }

    public String getRendszam() {
        return rendszam;
    }

    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public boolean isExtra1() {
        return extra1;
    }

    public void extratRak1(boolean extra1) {
        this.extra1 = true;
    }
    
    public boolean isExtra2() {
        return extra2;
    }

    public void extratRak2(boolean extra2) {
        this.extra2 = true;
    }
    
    
    
    
}
