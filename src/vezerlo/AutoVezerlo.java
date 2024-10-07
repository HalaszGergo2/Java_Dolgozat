package vezerlo;

import modell.AutoModell;
import nezet.AutoNezet;

public class AutoVezerlo {
    private AutoModell modell;
    private AutoNezet nezet;
    
    public AutoVezerlo(AutoModell modell, AutoNezet nezet){
        this.modell = modell;
        this.nezet = nezet;
        indulas();
    }
    
    private void indulas(){
        nezet.megjelen(modell.kezdo());
    }
}
