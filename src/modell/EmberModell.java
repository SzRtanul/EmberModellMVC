package modell;

public class EmberModell {
    private String nev;
    private int kor;

    public EmberModell(String nev, int kor) {
        this.nev = nev;
        setKor(kor);
    }
    
    public EmberModell(String nev) {
        this(nev, 18);
    }
    
    public EmberModell() {
        this("Alan Smitheeee", 0);
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        if(kor < 1 || kor > 130){
            throw new IllegalArgumentException("Nem létező kor érték!");
        }
        this.kor = kor;
    }
}
