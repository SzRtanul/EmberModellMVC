package main;

import modell.EmberModell;
import nezet.CuiNezet;
import nezet.JopNezet;
import vezerlo.CuiVezerlo;
import vezerlo.JopVezerlo;

public class Mvc02KonzolEmber {

    public static void main(String[] args) {
        //CuiNezet nezet = new CuiNezet();
        JopNezet nezet = new JopNezet();
        nezet.nevBeker();
        nezet.korBeker();
        
        EmberModell modell = new EmberModell(nezet.getNev(), nezet.getKor());
        //CuiVezerlo vezerlo = new CuiVezerlo(modell, nezet);
        JopVezerlo vezerlo = new JopVezerlo(modell, nezet);
    }
    
}
