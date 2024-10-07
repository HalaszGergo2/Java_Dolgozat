package main;

import modell.AutoModell;
import nezet.AutoNezet;
import vezerlo.AutoVezerlo;

public class Java_MVC_doga {

    public static void main(String[] args) {
        AutoModell auto = new AutoModell(); 
        AutoNezet nezet = new AutoNezet();
        new AutoVezerlo(auto, nezet);
    }
    
}
