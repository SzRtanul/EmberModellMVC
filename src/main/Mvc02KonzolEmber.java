package main;

import modell.EmberModell;
import nezet.CuiNezet;
import vezerlo.CuiVezerlo;

public class Mvc02KonzolEmber {

    public static void main(String[] args) {
        /* úgy kell modellt létrehozni, h nem ismerem
        a nézetben megadott adatokat! */
        EmberModell modell = new EmberModell("nem ezt adom meg");
        CuiNezet nezet = new CuiNezet();
        CuiVezerlo vezerlo = new CuiVezerlo(modell, nezet);
    }
    
}
