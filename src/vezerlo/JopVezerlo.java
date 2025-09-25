package vezerlo;

import modell.EmberModell;
import nezet.JopNezet;

public class JopVezerlo {
    private EmberModell modell;
    private JopNezet nezet;

    public JopVezerlo(EmberModell modell, JopNezet nezet) {
        this.modell = modell;
        this.nezet = nezet;
        
        modell.setNev(nezet.getNev());
        modell.setKor(nezet.getKor());
        
        String kimenet = "%s kora: %d\n".formatted(modell.getNev(), modell.getKor());
        nezet.mutat(kimenet);
    }
}
