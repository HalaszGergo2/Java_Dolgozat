package modell;

public class AutoModell {
    private Auto[] autok;
    private String valtoztatottSzin = "Bordó";
    
    public AutoModell(){
        
        autok = new Auto[5];
        autok[0] = new Auto("ABC-123", "Piros");
        autok[1] = new Auto("CBA-321", "Zöld", true, true);
        autok[2] = new Auto("AAA-111", "Kék", true, false);
        autok[3] = new Auto("GJF-123", "Lila");
        autok[4] = new Auto("LKJ-848", "Fekete", false, true);
        autoSzinezo();
//        extratBerak();
    }
    
    public String kezdo() {
        String szoveg = "Az autók most bemutatásra fognak kerülni: \n\n";
        for (Auto auto : autok) {
            String rend = auto.getRendszam();
            String szin = auto.getSzin();
            boolean extra1 = auto.isExtra1();
            boolean extra2 = auto.isExtra2();
            szoveg +=  "Az autók adatai: " + "Rendszám: " + rend + ", Szín: " + szin + ", Klíma: " + extra1 + ", Tetőablak: " + extra2 + "\n"; 
        }
        return szoveg;
    }
    
    public void autoSzinezo(){
        //return autok[].setSzin(valtoztatottSzin);
        autok[3].setSzin(valtoztatottSzin);
    }
    
//    public void extratBerak(){
//        autok[0].extratRak1(true);
//    }
}
