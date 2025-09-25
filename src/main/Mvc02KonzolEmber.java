package main;

import modell.EmberModell;
import nezet.CuiNezet;
import vezerlo.CuiVezerlo;

public class Mvc02KonzolEmber {

    public static void main(String[] args) {
        CuiNezet nezet = new CuiNezet();
        nezet.nevBeker();
        nezet.korBeker();
        
        EmberModell modell = new EmberModell(nezet.getNev(), nezet.getKor());
        CuiVezerlo vezerlo = new CuiVezerlo(modell, nezet);
    }
    
}
