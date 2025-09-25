package nezet;

import javax.swing.JOptionPane;

public class JopNezet {
    private String nev;
    private int kor;
    
    public void mutat(String uzenet){
        JOptionPane.showMessageDialog(null, uzenet);
    }
    
    /* set */
    public void nevBeker(){
        nev = JOptionPane.showInputDialog("név: ");
    }
    
    /* set */
    public void korBeker(){
        String k = JOptionPane.showInputDialog("kor: ");
        kor =  Integer.parseInt(k);
    }

    public String getNev() {
        return nev;
    }

    public int getKor() {
        return kor;
    }
}
